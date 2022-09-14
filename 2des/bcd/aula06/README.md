# Atividade pré-aula
- Criar o script de criação e população do banco de dados "Pizzaria"
- Este banco de dados está no livro "Princípio de Banco de dados com MySQL 5.7"
- Na página 50 está o MER x DER Lógico.
- Cadastrar 10 pizzas, 5 Clientes e um pedido para cada cliente.
- Cada pedido deve ter de 1 a 5 ítens.

#Desafio
- Criar um banco de dados para registro e controle de empréstimos
- Regras de negócio:
	- É necessário uma entidade Clientes para armazenar os dados de contato do cliente
	- Uma entidade Empréstimo para registrar os empréstimos feitos pelos clientes
	- Cada empréstimo é pago em parcelas, então é necessário uma entidade parcelas que faça relação com o empréstimo e o cliente.
	- A entidade parcelas deve possuir as datas de vencimento, pagamento, valor previsto e valor efetivo
		- a data de pagamento e o valor efetivo quando nulos significam que a parcela ainda não foi paga.
	- Utilizando gatilhos e/ou procedimentos armazenados automatize a geração de parcelas através do campo total de parcelas na entidade empréstimo.
	- Crie um relatório que mostre quanto dinheiro já foi emprestado e quanto dinheiro já foi recebido.