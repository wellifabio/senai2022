##Configurar Região e Zona
gcloud config set compute/region us-east1
gcloud config set compute/zone us-east1-b

#Tarefa 1
##Crie uma instância para o projeto jumphost

gcloud compute instances create nucleus-jumphost-254 --machine-type=f1-micro --image-family=debian-11 --image-project=debian-cloud 

#Tarefa 2
##Crie um cluster de serviço do Kubernetes

gcloud container clusters create meu-cluster \
 --machine-type=n1-standard-1

gcloud container clusters get-credentials meu-cluster

kubectl create deployment hello-server --image=gcr.io/google-samples/hello-app:2.0

kubectl expose deployment hello-server --type=LoadBalancer --port 8083

#Tarefa 3
##Configure um balanceador de carga HTTP

gcloud compute instance-templates create template-nginx \
   --network=default \
   --subnet=default \
   --tags=allow-health-check \
   --machine-type=e2-medium \
   --image-family=debian-11 \
   --image-project=debian-cloud \
   --metadata=startup-script="#! /bin/bash
apt-get update
apt-get install -y nginx
service nginx start
sed -i -- 's/nginx/Google Cloud Platform - '"\$HOSTNAME"'/' /var/www/html/index.nginx-debian.html"

gcloud compute instance-groups managed create nginx-grupo \
   --template=template-nginx --size=2

gcloud compute instance-groups managed set-named-ports nginx-grupo --named-ports http:80

gcloud compute firewall-rules create accept-tcp-rule-793 \
  --network=default \
  --action=allow \
  --direction=ingress \
  --target-tags=allow-health-check \
  --rules=tcp:80

gcloud compute addresses create lb-ipv4-1 \
  --ip-version=IPV4 \
  --global

gcloud compute health-checks create http http-basic-check \
  --port 80

gcloud compute backend-services create web-backend-service \
  --protocol=HTTP \
  --port-name=http \
  --health-checks=http-basic-check \
  --global

gcloud compute backend-services add-backend web-backend-service \
  --instance-group=nginx-grupo \
  --global

gcloud compute url-maps create web-map-http \
    --default-service web-backend-service

gcloud compute target-http-proxies create http-lb-proxy \
    --url-map web-map-http

gcloud compute forwarding-rules create http-content-rule \
    --address=lb-ipv4-1\
    --global \
    --target-http-proxy=http-lb-proxy \
    --ports=80