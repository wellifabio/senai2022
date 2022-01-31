GitHub x Git

1 Criar uma conta no GitHub
2 Fazer o download e instalar o Git Bach
(Pesquisar por "download git")
3 Organizar suas pastas locais com seus códigos fonte
4 Criar um repositório remoto para seus códigos
5 Abrir o git bash clicanco com o botão direito do mouse
5.1 Clonar o diretório remoto vazio
	git clone <endereco do diretorio remoto.git>
5.2 Copiar ou mover os arquivos para o diretório clonado
	E acessar o git bash de dentro do reporitório
5.3 Adicionar os novos arquivos ao repositório local
	git add .
5.4 Colocar uma mensagem no seu commit
	git commit -m "Mensagem sobre o commit"
5.5 Caso seja necessário configure seus dados ex:
	git config user.name "wellifabio"
	git config user.email wellifabio@hotmail.com
5.6 Enviar /empurrar os dados para o repositório remoto
	git push
	
Caso você já tenha o repositório local e apenas adicionou novos códigos
Basta iniciar o processo, mas ao invés de clonar utilize
	git pull
De dentro do repositório
Para atualizar o repositório local com o remoto

Se estiver utilizando um computador público
Limpe as credenciais do windows antes e depois do processo:
>> Painel de controle
>> Contas de usuário 
>> Credenciais do Windows
>> Procure por git
>> Remover