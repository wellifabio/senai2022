-- Todos os clientes
select * from clientes;
-- Busca por nome os clientes "like"
select cliente_id from clientes where nome like "Cesar Augusto %";
-- Todos os telefones do cliente "Cesar Augusto ..." 
select * from telefones
where cliente_id = (select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago");

-- Quantos os telefones do cliente "Cesar Augusto ..." 
select count(telefone) from telefones 
where cliente_id = (select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago");
-- Deletar os 4 telefones e acrescentar um novo.
delete from telefones where cliente_id = 12;
insert into telefones (cliente_id, telefone) values (12,"19991865503");

-- Crie uma view que mostre os clientes e telefones juntos, coloque o nome de "vw_clientes"
create view vw_clientes as
select c.cliente_id, c.nome, t.telefone from clientes c
inner join telefones t on c.cliente_id = t.cliente_id;

-- (Leve) Acrescente um novo cliente "Joaquim Inácio Silva", um endereço qualquer, telefone 19989995511
insert into Clientes(nome, logradouro, numero, complemento, bairro, referencia) values("Joaquim Inácio Silva","Rua Wellington Martins",1204,"Fundos","Dom Bosco","Igreja");
insert into Telefones(cliente_id, Telefone) values(106,"19989995511");
select * from vw_clientes where nome like "Joaquim %";
-- que pediu 
insert into Pedidos(cliente_id, data, hora) values(106,"2022-01-03","22:00");
select * from pedidos order by pedido_id desc limit 1;
-- 2 pizzas Baiana e uma de Atum
insert into Itens_Pedido(pedido_id, pizza_id, quantidade, valor)
values
(28,6,2,32.13),
(28,5,1,32.29);

-- (Pesada)Acrescente um novo cliente "Joaquim Inácio Silva", um endereço qualquer, telefone 19989995511
insert into Clientes(nome, logradouro, numero, complemento, bairro, referencia) values("Joaquim Inácio Silva","Rua Wellington Martins",1204,"Fundos","Dom Bosco","Igreja");
insert into Telefones(cliente_id, Telefone) values(LAST_INSERT_ID(),"19989995511");
select * from vw_clientes where nome like "Joaquim %";
-- que pediu 
insert into Pedidos(cliente_id, data, hora) values(LAST_INSERT_ID(),curdate(),curtime());
select * from pedidos order by pedido_id desc limit 1;
-- 2 pizzas Baiana e uma de Atum
insert into Itens_Pedido(pedido_id, pizza_id, quantidade, valor)
values
(LAST_INSERT_ID(),(select pizza_id from pizzas where nome = "Baiana"),2,(select valor from pizzas where nome = "Baiana")),
(LAST_INSERT_ID(),(select pizza_id from pizzas where nome = "Atum"),1,(select valor from pizzas where nome = "Atum"));

