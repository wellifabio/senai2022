-- DESAFIO NÍVEL 1
-- Todos os clientes
select * from clientes;
-- Busca por nome os clientes "like"
select cliente_id from clientes where nome like "Cesar Augusto %";
-- Todos os telefones do cliente "Cesar Augusto ..." com uma subConsulta 
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
-- Alterar um telefone para "19111111111", direto na tabela de telefones, pois a view é somente para leitura
update telefones set telefone = "19111111111" where telefone = "1930027393";

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
-- que pediu duas pizzas "Baiana" e uma de "Atum"
insert into Pedidos(cliente_id, data, hora) values(LAST_INSERT_ID(),curdate(),curtime());
select * from pedidos order by pedido_id desc limit 1;
-- 2 pizzas Baiana e uma de Atum
insert into Itens_Pedido(pedido_id, pizza_id, quantidade, valor)
values
(LAST_INSERT_ID(),(select pizza_id from pizzas where nome = "Baiana"),2,(select valor from pizzas where nome = "Baiana")),
(LAST_INSERT_ID(),(select pizza_id from pizzas where nome = "Atum"),1,(select valor from pizzas where nome = "Atum"));

-- DESAFIO NÍVEL 2
-- Quando foi o último pedido do cliente "Cesar Augusto Pascali Rago"? Qual o valor deste pedido?
select * from pedidos where cliente_id = (select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago")
order by pedido_id desc limit 1;
-- Ordenando pela data
select * from pedidos where cliente_id = (select cliente_id from clientes where nome = "Cesar Augusto Pascali Rago")
order by data desc limit 1;
-- Quantas pizzas ele pediu e quantos sabores diferentes
select * from itens_pedido where pedido_id = 22;
select pizza_id, quantidade from itens_pedido where pedido_id = 22;
select count(pizza_id), sum(quantidade) from itens_pedido where pedido_id = 22;
select count(pizza_id) as sabores, sum(quantidade) as quantas from itens_pedido where pedido_id = 22;
-- - Crie uma view da tabela Itens_pedido que mostre também o nome de cada pizza em ordem de pedido_id, coloque o nome de "vw_itens"
create view vw_itens as
select i.pedido_id, i.pizza_id, p.nome, i.quantidade, i.valor from itens_pedido i
inner join pizzas p on p.pizza_id = i.pizza_id
order by i.pedido_id;
select * from vw_itens;
-- - Crie uma view da tabela Itens_pedido com o Subtotal
create view vw_itens_sub as select *, (quantidade * valor) as subtotal from itens_pedido;
select * from vw_itens_sub;

-- ÍNDICES, um campo além da chave primária, que fica classificado, melhorar o desempenho de pesquisas(select)
-- Exemplo indexar o campo nome da tabela pizza
create index nom on pizzas(nome);

-- Crie uma view que mostre por ordem de pedido os dados
-- (pedido_id, cliente_id, data, hora, pizza_id, nome da pizza, valor da pizza, subtotal e total),
-- nomeie como "vw_pedidos"

select
p.pedido_id, p.cliente_id, p.data, p.hora, v.pizza_id, v.nome, v.valor, (v.quantidade * v.valor) as subtotal
from pedidos p
inner join vw_itens v
on p.pedido_id = v.pedido_id;

create view vw_pedidos as
select
p.pedido_id, p.cliente_id, p.data, p.hora,
v.pizza_id, v.nome, v.valor, (v.quantidade * v.valor) as subtotal,
sum(v.quantidade * v.valor) as total
from pedidos p
inner join vw_itens v
on p.pedido_id = v.pedido_id
group by p.pedido_id;

-- esta view faz mais sentido se adicionar a quantidade de
drop view vw_pedidos;
create view vw_pedidos as
select
p.pedido_id, p.cliente_id, p.data, p.hora,
v.pizza_id, v.nome, v.quantidade, v.valor, (v.quantidade * v.valor) as subtotal,
sum(v.quantidade * v.valor) as total
from pedidos p
inner join vw_itens v
on p.pedido_id = v.pedido_id
group by p.pedido_id;
-- Testando a view
select * from vw_pedidos;
-- Acrescente na view anterior o nome do cliente e mostre na ordem de pedido decrescente.
