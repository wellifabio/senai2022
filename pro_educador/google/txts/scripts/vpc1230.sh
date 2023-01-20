# Criar uma VPC
gcloud compute networks create managementnet --project=qwiklabs-gcp-01-3510e53f975c --subnet-mode=custom --mtu=1460 --bgp-routing-mode=regional
# Criar uma subRede
gcloud compute networks subnets create managementsubnet-us --project=qwiklabs-gcp-01-3510e53f975c --range=10.130.0.0/20 --stack-type=IPV4_ONLY --network=managementnet --region=us-east1

# Criar outra VPC com diuas subredes
gcloud compute networks create privatenet --subnet-mode=custom
gcloud compute networks subnets create privatesubnet-us --network=privatenet --region=us-east1 --range=172.16.0.0/24
gcloud compute networks subnets create privatesubnet-eu --network=privatenet --region=europe-west4 --range=172.20.0.0/20

# Listar VPCs
gcloud compute networks list
# listar Subredes
gcloud compute networks subnets list --sort-by=NETWORK

#Criar regras de firewall
gcloud compute firewall-rules create managementnet-allow-icmp-ssh-rdp --direction=INGRESS --priority=1000 --network=managementnet --action=ALLOW --rules=tcp:22,tcp:3389,icmp --source-ranges=0.0.0.0/0
gcloud compute firewall-rules create privatenet-allow-icmp-ssh-rdp --direction=INGRESS --priority=1000 --network=privatenet --action=ALLOW --rules=icmp,tcp:22,tcp:3389 --source-ranges=0.0.0.0/0

#Listar todas as regras de firewall
gcloud compute firewall-rules list --sort-by=NETWORK

#Criar uma instância de VM
gcloud compute instances create managementnet-us-vm --project=qwiklabs-gcp-01-3510e53f975c --zone=us-east1-c --machine-type=e2-micro --network-interface=network-tier=PREMIUM,subnet=managementsubnet-us --metadata=enable-oslogin=true --maintenance-policy=MIGRATE --provisioning-model=STANDARD --service-account=678148889585-compute@developer.gserviceaccount.com --scopes=https://www.googleapis.com/auth/devstorage.read_only,https://www.googleapis.com/auth/logging.write,https://www.googleapis.com/auth/monitoring.write,https://www.googleapis.com/auth/servicecontrol,https://www.googleapis.com/auth/service.management.readonly,https://www.googleapis.com/auth/trace.append --create-disk=auto-delete=yes,boot=yes,device-name=managementnet-us-vm,image=projects/debian-cloud/global/images/debian-11-bullseye-v20220719,mode=rw,size=10,type=projects/qwiklabs-gcp-01-3510e53f975c/zones/us-east1-c/diskTypes/pd-balanced --no-shielded-secure-boot --shielded-vtpm --shielded-integrity-monitoring --reservation-affinity=any
gcloud compute instances create privatenet-us-vm --zone="us-east1-c" --machine-type=e2-micro --subnet=privatesubnet-us

gcloud compute instances list --sort-by=ZONE

NAME: mynet-eu-vm
ZONE: europe-west4-a
MACHINE_TYPE: e2-medium
PREEMPTIBLE:
INTERNAL_IP: 10.164.0.2
EXTERNAL_IP: 34.90.214.2
STATUS: RUNNING

NAME: managementnet-us-vm
ZONE: us-east1-c
MACHINE_TYPE: e2-micro
PREEMPTIBLE:
INTERNAL_IP: 10.130.0.2
EXTERNAL_IP: 34.148.120.110
STATUS: RUNNING

NAME: mynet-us-vm
ZONE: us-east1-c
MACHINE_TYPE: e2-medium
PREEMPTIBLE:
INTERNAL_IP: 10.142.0.2
EXTERNAL_IP: 34.75.53.150
STATUS: RUNNING

NAME: privatenet-us-vm
ZONE: us-east1-c
MACHINE_TYPE: e2-micro
PREEMPTIBLE:
INTERNAL_IP: 172.16.0.2
EXTERNAL_IP: 34.148.246.200
STATUS: RUNNING

#ping nos IPs Externos
ping -c 3 34.90.214.2
ping -c 3 34.148.120.110
ping -c 3 34.148.246.200

#ping nos IPs Internos
ping -c 3 10.164.0.2
ping -c 3 10.130.0.2
ping -c 3 172.16.0.2
