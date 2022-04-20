.REVISÕES, COMPLEMENTOS E INOVAÇÕES (Técinas de recuperação contínua)
------------
.Recursos avançados de Banco de dados
------------
	- Procedimentos Armazenados (Stored procedure)
	- Funções (Function)
	- Gatilhos (Trigger)
	- SQL (DCL)
	- condicionais e laços
------------
.Atividades 1 (Function)
------------
	- Crie uma função chamada desconto(valor) que aplique um desconto de 10% em um valor de parâmetro
	- Crie uma função chamada juros(valor,meses) que aplique um juros composto de 1% ao mês e receba como parâmetro o valor e quantos mêses.
------------
.Atividades 2 (Procedure)
------------
- Crie uma procedure que receba os dados a seguir: cliente_id, pizza_id e quantidade, e gere um pedido e coloque esta pizza como item. (nome: Pedido_um_sabor).
------------
.Atividades 3 (Trigger)
------------
- crie um gatilho que após inserir um iten no pedido atualize o valor total deste pedido, coloque o nome de "tr_atualiza_valor_pedido".
------------
.Atividades 4 (DCL)
------------
- Execute pausadamente (um por um) os comandos do arquivo dcl.sql
- Crie um usuário "pizzaiolo" com privilegios totais, porém somente no banco de dados pizzaria.
- Crie um usuário "atendente" com privilegios somente de leitura (SELECT) no banco de dados pizzaria.
- Crie um usuário "garcon" dando acesso somente de LEITURA na tabela de PIZZAS no BD PIZZARIA
- Crie um usuário "coadmin" com acesso total a todos os bancos de dados do SGBD
- Exclua os usuários que você criou.