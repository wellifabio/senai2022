# Subconsultas e ações transaçionais
	- Pode ser utilizadas em qualquer operação CRUD - DML
# Atividade pré-aula:
- Criar o script de criação e população do banco de dados "Pizzaria"
- Este banco de dados está no livro "Princípio de Banco de dados com MySQL 5.7"
- Na página 50 deste livro está o MER x DER Lógico.
- Cadastrar 10 pizzas, 5 Clientes e um pedido para cada cliente.
- Cada pedido deve ter de 1 a 5 ítens.

# Exercícios (lista1)
- Qual o telefone do cliente "Cesar Augusto Pascali Rago"?
- Quantos telefones ele possui cadastrado?
- Através de comandos SQL/DML Remova os demais telefones e cadastre apenas o novo telefone 19991865503
- Crie uma view que mostre os clientes e telefones juntos, coloque o nome de "vw_clientes"
- Acrescente um novo cliente "Joaquim Inácio Silva", um endereço qualquer, telefone 19989995511 que pediu 2 pizzas (uma baiana e uma de atum)

# Desafio:
- Criar um banco de dados para registro e controle de empréstimos conforme regras de negócio estabelecidas
- Regras de negócio:
	- É necessário uma entidade Clientes para armazenar os dados de contato do cliente
	- Uma entidade Empréstimo para registrar os empréstimos feitos pelos clientes
	- Cada empréstimo é pago em parcelas, então é necessário uma entidade parcelas que faça relação com o empréstimo e o cliente.
	- A entidade parcelas deve possuir as datas de vencimento, pagamento, valor previsto e valor recebido
		- a data de pagamento e o valor recebido quando nulos significam que: "Esta parcela ainda não foi paga".
	- Utilizando gatilhos e/ou procedimentos armazenados automatize a geração de parcelas através do campo total de parcelas na entidade empréstimo.
	- Crie um relatório que mostre quanto dinheiro já foi emprestado e quanto dinheiro já foi recebido.
	- Os dados para teste estão neste repositório em formato "CSV"
	- Também neste diretório encontra-se o DER(Diagrama de Entidade e Relacionamentos) deste desafio
		- Crie o script SQL de criação e importação dos dados "CSV"
		- Crie o Gatilho e os Relatórios/Consultas ou Views que respondam as seguintes questões:
			- Quanto já foi emprestado?
			- Quanto já foi recebido?
			- Quanto existe a receber?
			- Qual o lucro bruto esperado?
		- Para responder estas questões, altere os dados do seu Banco de dados de forma que todas as parcelas com vencimento aterior a hoje já foram pagas.