# Deploy/Implantação
- Exemplo de implantação de aplicação Nodejs simples
- Serviço de nuvem gratuito heroku https://www.heroku.com/

# Deploy/Implantação
- Baixar o heroku app
- Terminal:
$ heroku login

$ heroku git:clone -a patrimoniomongo 
$ cd patrimoniomongo

$ git add .
$ git commit -am "make it better"
$ git push heroku master

$ heroku ps:scale web=1
$ heroku open
$ heroku logs --tail
$ heroku ps