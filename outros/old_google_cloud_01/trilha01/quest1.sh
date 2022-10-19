## Váriáveis de ambiente
export INST_NAME=nucleus-jumphost-569
export APP_PORT=8083
export REGION=us-east1
export ZONE=us-east1-b
export RF_NAME=grant-tcp-rule-324

gcloud config set compute/region $REGION
gcloud config set compute/zone $ZONE

## Tarefa 1: crie uma instância para o projeto jumphost
gcloud compute instances create $INST_NAME --project=qwiklabs-gcp-04-7a9ccf48e67d --zone=$ZONE --machine-type=n1-standard-1 --network-interface=network-tier=PREMIUM,subnet=default --metadata=enable-oslogin=true --maintenance-policy=MIGRATE --provisioning-model=STANDARD --service-account=896877271621-compute@developer.gserviceaccount.com --scopes=https://www.googleapis.com/auth/devstorage.read_only,https://www.googleapis.com/auth/logging.write,https://www.googleapis.com/auth/monitoring.write,https://www.googleapis.com/auth/servicecontrol,https://www.googleapis.com/auth/service.management.readonly,https://www.googleapis.com/auth/trace.append --create-disk=auto-delete=yes,boot=yes,device-name=nucleus-jumphost-569,image=projects/debian-cloud/global/images/debian-11-bullseye-v20220822,mode=rw,size=10,type=projects/qwiklabs-gcp-04-7a9ccf48e67d/zones/us-east1-b/diskTypes/pd-balanced --no-shielded-secure-boot --shielded-vtpm --shielded-integrity-monitoring --reservation-affinity=any

## Tarefa 2: crie um cluster de serviço do Kubernetes
## - criar um cluster na zona us-east1-b para hospedar o serviço;
gcloud container clusters create cluster1

## - Usar o contêiner "hello-app" do Docker (gcr.io/google-samples/hello-app:2.0) como um marcador de posição que será substituído pelo trabalho da equipe mais tarde;

gcloud container clusters get-credentials cluster1
kubectl create deployment hello-server --image=gcr.io/google-samples/hello-app:2.0

## - Expor o app na porta XXXX.
kubectl expose deployment hello-server --type=LoadBalancer --port $APP_PORT

## Tarefa 3: configure um balanceador de carga HTTP
## - Atualizar este script caso estja diferente no desafio
cat << EOF > startup.sh
#! /bin/bash
apt-get update
apt-get install -y nginx
service nginx start
sed -i -- 's/nginx/Google Cloud Platform - '"\$HOSTNAME"'/' /var/www/html/index.nginx-debian.html
EOF

## Crie um modelo de instância.
gcloud compute instance-templates create web-server-template \
          --metadata-from-file startup-script=startup.sh \
          --network default \
          --machine-type g1-small \
          --region $REGION

## Crie um pool de destino.
## Crie um grupo de instâncias gerenciadas.  
gcloud compute instance-groups managed create web-server-group \
          --base-instance-name web-server \
          --size 2 \
          --template web-server-template \
          --region $REGION

## Atrela o serviço a porta para o verificador de integridade HTTP
gcloud compute instance-groups managed \
          set-named-ports web-server-group \
          --named-ports http:80 \
          --region $REGION
		  
## Defina uma regra de firewall chamada XXXXXXXXXXXXXXXX para permitir o tráfego (80/tcp).
gcloud compute firewall-rules create $RF_NAME \
          --allow tcp:80 \
          --network default

## Crie uma verificação de integridade.
gcloud compute http-health-checks create http-basic-check

## Crie um serviço de back-end e anexe o grupo gerenciado de instâncias à porta chamada (http:80).
gcloud compute backend-services create web-server-backend \
          --protocol HTTP \
          --http-health-checks http-basic-check \
          --global
		  
gcloud compute backend-services add-backend web-server-backend \
          --instance-group web-server-group \
          --instance-group-region us-east1 \
          --global
		  
## Crie um mapa de URL e direcione para ele o encaminhamento de solicitações do proxy HTTP.
gcloud compute url-maps create web-server-map \
          --default-service web-server-backend
		  
## Crie uma regra de encaminhamento.
gcloud compute target-http-proxies create http-lb-proxy \
          --url-map web-server-map
		  
gcloud compute forwarding-rules create $RF_NAME \
     --global \
     --target-http-proxy http-lb-proxy \
     --ports 80
	 
gcloud compute forwarding-rules list
