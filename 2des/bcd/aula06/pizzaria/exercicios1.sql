-- Qual o telefone do cliente "Cesar Augusto Pascali Rago"?
-- Simples
-- Este cliente é o id 12 possui 4 telefones
-- 12 1930031664
-- 12 1930025914
-- 12 1930029833
-- 12 1930030615
-- Ou da seguinte forma
select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago";
select * from telefones where cliente_id = 12;
select * from telefones where cliente_id = (select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago");

-- Quantos telefones ele possui cadastrado?
-- Ele possui quartro telefones
select count(telefone) from telefones where cliente_id = (select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago");

-- Através de comandos SQL/DML Remova os demais telefones e cadastre apenas o novo telefone 19991865503
delete from telefones where cliente_id = (select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago");
insert into telefones values (12,"19991865503");

-- Crie uma view que mostre os clientes e telefones juntos, coloque o nome de "vw_clientes"
create view vw_clientes as
select c.Cliente_id, c.nome,c.logradouro,c.numero,c.complemento, c.bairro, c.referencia,t.telefone
from clientes c inner join telefones t on c.cliente_id = t.cliente_id;

select * from vw_clientes;
-- Acrescente um novo cliente "Joaquim Inácio Silva", um endereço qualquer,
-- telefone 19989995511 que pediu 2 pizzas (uma baiana e uma de atum)
-- Cliente
show tables;
describe clientes;
insert into clientes value (null,'Joaquim Inácio Silva','Endereço qualquel',null,null,null,null);
select last_insert_id();
select * from clientes where cliente_id = 106;
select * from clientes where nome like "Joaquim%";
describe telefones;
insert into telefones values (106,"19989995511");
-- Pedidos
describe pedidos;
describe pizzas;
describe itens_pedido;
-- Carastrando o pedido de duas pizzas do "Joaquim Inácio Silva"
insert into pedidos value (null,106,curdate(),curtime(),null);
select last_insert_id();
-- pedido_id = 27
select * from pizzas where nome like "%baiana%";
-- pizza_id = 6 valor = 32.13
select * from pizzas where nome like "%atum%";
-- pizza_id = 5 valor = 32.29
-- Cadastrar os ítens do pedido
insert into itens_pedido value (27,6,1,32.13);
insert into itens_pedido value (27,5,1,32.29);