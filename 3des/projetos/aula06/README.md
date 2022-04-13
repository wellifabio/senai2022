.Recursos avançados de Banco de dados
------------
	- Entendendo as regras de negócio
	- Manipulando dados DML
	- Criando queries DQL
	- Utilizando funções
------------
.Acessando o banco de dados
------------
- A partir do banco de dados SQL Pizzaria já populado com dados de exemplo, faremos as seguintes atividades:
	- 1 Abra o XAMPP Control Panel, inicie os serviços Apache e MySQL e através do Shell acesse o SGBD "mysql -u root"
	- 2 Copie e cole o conteúdo do script de criação e população do banco de dados "pizzaria.sql"
	- 3 Estude o Modelo Conceitual (MER_DER) deste banco de dados conforme imagem "pizzaria_mer_der.jpg" neste diretório.
	- 4 Compare com o DER lógico, para isto verifique através do desenhador do phpMyAdmin(Clicando em Admin no serviço MySQL)

OBS(Anote em um script.sql os comandos utilizados para cada uma das etapas a seguir:)

------------
.Desafios nível 1
------------
- Qual o telefone do cliente "Cesar Augusto Pascali Rago"?
- Quantos telefones ele possui cadastrado?
- Através de comandos SQL/DML Remova os demais telefones e cadastre apenas o novo telefone 19991865503
- Crie uma view que mostre os clientes e telefones juntos, coloque o nome de "vw_clientes"
- Acrescente um novo cliente "Joaquim Inácio Silva", um endereço qualquer, telefone 19989995511 que pediu 2 pizzas Baiana e uma de atum
------------
.Desafios nível 2
------------
- Quando foi o último pedido do cliente "Cesar Augusto Pascali Rago"? Qual o valor deste pedido?
- Quantas pizzas ele pediu e quantos sabores diferentes
- Crie uma view da tabela Itens_pedido que mostre também o nome de cada pizza em ordem de pedido_id, coloque o nome de "vw_itens"
- Crie uma view que mostre por ordem de pedido os dados (pedido_id, cliente_id, data, hora, pizza_id, nome da pizza, valor da pizza, subtotal e total), nomeie como "vw_pedidos"
- Acrescente na view anterior o nome do cliente e mostre na ordem de pedido decrescente.
------------
.Desafio nível 3
------------
Liste apenas os clientes que fizeram pedidos (com repetidos)
Liste apenas os clientes que fizeram pedidos (sem repetidos)
Liste apenas os clientes que fizeram pedidos (sem repetidos, mas com total de pedidos que cada um fez)
Liste apenas os clientes que que não fizeram pedidos
------------
.Conhecimentos
------------
- (Sobre Join) https://pt.stackoverflow.com/questions/6441/qual-%C3%A9-a-diferen%C3%A7a-entre-inner-join-e-outer-join