-- Quando foi o último pedido do cliente "Cesar Augusto Pascali Rago"? Qual o valor deste pedido?
-- quando 2022-09-20 valor 354.71
select p.data, p.valor from pedidos p 
inner join clientes c on p.cliente_id = c.cliente_id
where c.nome like "Cesar Augusto Pascali Rago"
order by p.data desc
limit 1;
-- Quantas pizzas ele pediu e quantos sabores diferentes
-- id	pizza	qtd	val	
-- 22	5	4	32.29
-- 22	7	5	31.97
-- 22	8	1	31.81
-- 22	25	1	33.89
-- quantas 11 sabores 4
select * from itens_pedido where pedido_id = 22;

select sum(quantidade) as "Quantas pizzas",count(quantidade) as "Quantos sabores"
from itens_pedido where pedido_id = 22;

select * from itens_pedido where pedido_id = (select p.pedido_id from pedidos p 
inner join clientes c on p.cliente_id = c.cliente_id
where c.nome like "Cesar Augusto Pascali Rago"
order by p.data desc
limit 1);

select sum(quantidade) as "Quantas pizzas",count(quantidade) as "Quantos sabores"
from itens_pedido where pedido_id = (select p.pedido_id from pedidos p 
inner join clientes c on p.cliente_id = c.cliente_id
where c.nome like "Cesar Augusto Pascali Rago"
order by p.data desc
limit 1);

-- Crie uma view da tabela Itens_pedido que mostre também o nome de cada pizza
-- em ordem de pedido_id, coloque o nome de "vw_itens"
create view vw_itens as
select i.pedido_id, i.pizza_id, p.nome, i.quantidade, i.valor
from itens_pedido i inner join pizzas p
on i.pizza_id = p.pizza_id
order by pedido_id;

select * from vw_itens;

-- Crie uma view que mostre por ordem de pedido os dados
-- (pedido_id, cliente_id, data, hora, pizza_id, nome da pizza, valor da pizza, subtotal e total), nomeie como "vw_pedidos"

create view vw_pedidos as
select p.pedido_id, p.cliente_id, p.data, p.hora, i.pizza_id, pz.nome as 'Nome da pizza',
pz.valor as 'Valor da pizza', (i.quantidade * i.valor) as subtotal, p.valor as total
from pedidos p inner join itens_pedido i on i.pedido_id = p.pedido_id
inner join pizzas pz on pz.pizza_id = i.pizza_id;

select * from vw_pedidos;

-- Acrescente na view anterior o nome do cliente e mostre na ordem de pedido decrescente.
drop view if exists vw_pedidos ;
create view vw_pedidos as
select p.pedido_id, p.cliente_id, c.nome, p.data, p.hora, i.pizza_id, pz.nome as 'Nome da pizza',
pz.valor as 'Valor da pizza', (i.quantidade * i.valor) as subtotal, p.valor as total
from clientes c inner join pedidos p on c.cliente_id = p.cliente_id
inner join itens_pedido i on i.pedido_id = p.pedido_id
inner join pizzas pz on pz.pizza_id = i.pizza_id
order by pedido_id desc;

select * from vw_pedidos;