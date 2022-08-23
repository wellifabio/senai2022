## Variáveis de ambiente********************************
export PROJECT_ID=qwiklabs-gcp-01-f928371c2cb7
export SANAME=challenge
export ROLE_BIGQUERY=roles/bigquery.dataOwner
export ROLE_CLOUDSTORAGE=roles/storage.admin
export LANG=fr

echo $PROJECT_ID
echo $SANAME
echo $ROLE_BIGQUERY
echo $ROLE_CLOUDSTORAGE

## Tarefa 1: ****configure uma conta de serviço para acessar as APIs de machine learning, o BigQuery e o Cloud Storage****

## 1. Crie uma conta de serviço que atribua as credenciais para o script:
gcloud config set project $PROJECT_ID
gcloud iam service-accounts create $SANAME

## 2. Após criar a conta, vincule a ela os papéis `BigQuery Role` e `Cloud Storage Role`.
gcloud projects add-iam-policy-binding $PROJECT_ID \
	--member=serviceAccount:$SANAME@$PROJECT_ID.iam.gserviceaccount.com \
	--role=$ROLE_BIGQUERY

gcloud projects add-iam-policy-binding $PROJECT_ID \
	--member=serviceAccount:$SANAME@$PROJECT_ID.iam.gserviceaccount.com \
	--role=$ROLE_CLOUDSTORAGE

gsutil cp gs://$PROJECT_ID/analyze-images-v2.py .

## Tarefa 2: crie e faça o download de um arquivo de credenciais para sua conta de serviço****
## 1. Faça o download do arquivo de credenciais do IAM em formato JSON.
gcloud iam service-accounts keys create sa-key.json \
	--iam-account $SANAME@$PROJECT_ID.iam.gserviceaccount.com

## 1. Configurar a variável de ambiente que fornece o nome do arquivo de credenciais para o script Python.
export GOOGLE_APPLICATION_CREDENTIALS=${PWD}/sa-key.json
echo $GOOGLE_APPLICATION_CREDENTIALS

## Tarefa 3: modifique o script Python para extrair texto dos arquivos de imagem
echo > analyze-images-v2.py
nano analyze-images-v2.py
## Subistitua todo o código pelo do arquivo local analyze-images-v2.py
## Realizar a modificação nas linhas 80 e 88 do arquivo de código acima pela variável  Locale fornecida em seu LAB!
# ex: de
    if locale == 'en':
# para
    if locale == 'fr':

## Voltar para o terminal do powershell verificar se a alteração aconteceu e executar o script pyton
cat analyze-images-v2.py | grep "if locale"
python3 analyze-images-v2.py $PROJECT_ID $PROJECT_ID

## Tarefa 5: identifique o idioma mais usado nas placas do conjunto de dados
## Abrir o BIGQUERY
## Navegar até o SEU_PROJETO>IMAGE_CLASSIFICATION_DATASET>IMAGE_TEXT_DETAIL
## Abrir uma QUERY em uma nova aba.

bq query \
'SELECT locale,COUNT(locale) 
as lcount FROM image_classification_dataset.image_text_detail 
GROUP BY locale 
ORDER BY lcount DESC'