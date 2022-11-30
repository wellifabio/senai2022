# Deploy/Implantação
- Exemplo de implantação de aplicação Nodejs simples
- Serviço de nuvem gratuito heroku https://www.heroku.com/

# Deploy/Implantação
- Baixar o heroku app
- Terminal:
$ heroku login<br/>
<br/>
$ heroku git:clone -a patrimoniomongo<br/>
$ cd patrimoniomongo<br/>
<br/>
$ git add .<br/>
$ git commit -am "make it better"<br/>
$ git push heroku master<br/>
<br/>
$ heroku ps<br/>
$ heroku ps:scale web=1<br/>
$ heroku open<br/>
$ heroku logs --tail<br/>
$ web: npm start<br/>
$ heroku ps<br/>
<br/>
- Acessar o Terminal SSH do Heroku App<br/>
$ heroku ps:exec<br/>
<br/>
- Provisionar complementos<br/>
$ heroku addons:create papertrail<br/>
$ heroku addons:create heroku-postgresql:mini<br/>
- Verificar quais complementos foram adicionados
$ heroku addons<br/>
$ heroku addons:open papertrail<br/>
- Iniciar um console<br/>
$ heroku run bash<br/>
- OBS: FFunciona quando sua aplicação utiliza dynos, porém foram substituídos por Eco</br>
- Definir variáveis ​​de configuração<br/>
$ heroku config:set TIMES=2<br/>
$ heroku config<br/>
- Adicionar Banco de Dados Postgress (Parou de ser disponibilizado gratuitamente)
$ heroku addons:create heroku-postgresql:mini<br/>
- Instalar localmente<br/>
$ npm install pg<br/>
- Acessar o shell do Postgress (O firewall do SENAI Bloqueia)
$ heroku pg:psql<br/>