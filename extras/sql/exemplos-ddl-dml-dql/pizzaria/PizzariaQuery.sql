select * from cliente;
select * from pizza;
select * from telefone;
select * from pedido;
select * from item_pedido;

select * from item_pedido i, pizza p;

select * from item_pedido i, pizza p
where i.pizza_id = p.pizza_id order by pedido_id;

select * from item_pedido i, pizza p
where i.pizza_id = p.pizza_id and i.pedido_id = 5
order by pedido_id;

select i.pedido_id as NumPed, i.quantidade as Qtdade, p.nome as Nome, i.valor as Preço
from item_pedido i, pizza p
where i.pizza_id = p.pizza_id and i.pedido_id = 5
order by pedido_id;

select i.pedido_id as NumPed, i.pizza_id as CodPizza, i.quantidade as Qtdade, p.nome as Nome, i.valor as Preço,
i.quantidade * i.valor as Subtotal
from item_pedido i, pizza p
where i.pizza_id = p.pizza_id and i.pedido_id = 6
-- Elabore uma consulta que mostre o Id do pedido, a Quantidade, o nome, o preço e o subtotal do pedido de número 5
select i.pedido_id, p.nome, i.quantidade, i.valor, i.quantidade * i.valor as subtotal
from item_pedido i, pizza p
where i.pizza_id = p.pizza_id and i.pedido_id = 5;
-- Altere a quantidade de pizzas de nome Caipira no pedido numero 5 para 4.
update item_pedido set quantidade = 4 where pedido_id = 5 and pizza_id = 8;
-- Elabore uma consulta que mostre o Id do pedido, o Id da Pizza a Quantidade, o nome, o preço e o subtotal do pedido de número 6
select i.pedido_id, p.pizza_id, p.nome, i.quantidade, i.valor,
i.quantidade * i.valor as subtotal
from item_pedido i inner join pizza p
on i.pizza_id = p.pizza_id where i.pedido_id = 6;
-- Altere a quantidade de pizzas de nome Escarola do pedido número 6 para 2.
update item_pedido set quantidade = 2 where pedido_id = 6 and pizza_id = 15

-- Cadastre o pedido do Cliente Wellington: 1 pizza de calabresa e 2 Caipiras
select * from cliente where nome like "well%";
insert into pedido values (null,99,curdate(),"10:47",0);
select * from pizza where nome like "ca%";
select * from item_pedido;
insert into item_pedido values (27, 8, 2,(select valor from pizza where pizza_id = 8));
insert into item_pedido values (27, 9, 1,(select valor from pizza where pizza_id = 9));
select * from item_pedido where pedido_id = 27;
select * from pedido where pedido_id = 27;
update pedido set valor = (select sum(quantidade * valor)
from item_pedido where pedido_id = 27) where pedido_id = 27;
-- Cadastre o pedido de um cliente chamado Alisson: 1 pizza de calabresa.
insert into pedido values (null,3,curdate(),"10:47",0);
insert into item_pedido values (28, 9, 1,(select valor from pizza where pizza_id = 9));
update pedido set valor = (select sum(quantidade * valor)
from item_pedido where pedido_id = 28) where pedido_id = 28;
select * from pedido where pedido_id = 28;
-- Cadastre o pedido do Cliente Wellington: 2 pizzas de Calabresa
select * from cliente where nome like "wellington%";
select * from pedido;
insert into pedido values(null, 99, curdate(),"8:47",0);
select * from pedido where cliente_id = 99;
select * from item_pedido;
select * from pizza;
insert into item_pedido values (29,9,2,(select valor from pizza where pizza_id = 9));
select * from item_pedido where pedido_id = 29;
update pedido set valor=(select sum(quantidade * valor)
from item_pedido where pedido_id = 29) where pedido_id = 29;


select ip.pedido_id, p.nome, ip.quantidade, ip.valor, ip.quantidade * ip.valor as subtotal
from item_pedido ip right join pizza p
on p.pizza_id = ip.pizza_id
order by ip.pedido_id;

select * from cliente;
105
select * from pedido
26
select * from cliente join pedido;
select * from cliente inner join pedido;
2730
select * from cliente join pedido on cliente.cliente_id = pedido.cliente_id;
select c.nome, p.pedido_id, p.data from cliente c join pedido p on c.cliente_id = p.cliente_id;
select c.nome, p.pedido_id, p.data from cliente c inner join pedido p on c.cliente_id = p.cliente_id;
26
select c.nome, p.pedido_id, p.data from cliente c left join pedido p on c.cliente_id = p.cliente_id;
115
select c.nome, p.pedido_id, p.data from cliente c right join pedido p on c.cliente_id = p.cliente_id;
26
select c.nome, p.pedido_id, p.data from cliente c inner join pedido p on c.cliente_id = p.cliente_id
group by c.nome;
select c.nome, p.pedido_id, p.data from cliente c inner join pedido p on c.cliente_id = p.cliente_id
group by c.cliente_id;
select c.nome, p.pedido_id, p.data from cliente c inner join pedido p on c.cliente_id = p.cliente_id
group by c.cliente_id order by p.data desc;
16
select c.nome, p.pedido_id, p.data, p.valor from cliente c inner join pedido p on c.cliente_id = p.cliente_id
group by c.cliente_id order by p.data desc;
select c.nome, p.pedido_id, p.data, sum(p.valor) from cliente c inner join pedido p on c.cliente_id = p.cliente_id
group by c.cliente_id order by p.data desc;
16

select c.nome, p.pedido_id, p.data, p.valor, i.pizza_id from cliente c
inner join pedido p on c.cliente_id = p.cliente_id
right join item_pedido i
on p.pedido_id = i.pedido_id
order by p.data desc;
109
select c.nome, p.pedido_id, p.data, z.nome, i.valor, i.quantidade from cliente c
inner join pedido p on c.cliente_id = p.cliente_id
right join item_pedido i
on p.pedido_id = i.pedido_id
inner join pizza z
on i.pizza_id = z.pizza_id
order by p.pedido_id;
109
select c.nome, p.pedido_id, p.data, z.nome, i.valor, i.quantidade from cliente c
inner join pedido p on c.cliente_id = p.cliente_id
right join item_pedido i
on p.pedido_id = i.pedido_id
right join pizza z
on i.pizza_id = z.pizza_id
order by p.pedido_id;
125

-- Criação da View Cliente com Telefone
CREATE VIEW vw_Cliente
AS SELECT c.nome AS Nome, t.telefone AS Tel
FROM cliente c
INNER JOIN telefone t
ON c.cliente_id = t.cliente_id;

-- Criação da View Pedidos Com Nome do Cliente e da Pizza
create view vw_pedidos as
select c.cliente_id, c.nome, p.pedido_id,
z.nome as pizza, i.quantidade, i.valor,
i.quantidade * i.valor as total
from cliente c
inner join pedido p
on c.cliente_id = p.cliente_id
inner join item_pedido i
on p.pedido_id = i.pedido_id
inner join pizza z
on i.pizza_id = z.pizza_id
order by p.pedido_id;

delimiter //
create function dinheiro(din decimal(5,2)) returns text
begin 
return concat("R$ ", din);
end//
delimiter ;

alter view vw_pedidos as
select c.cliente_id, c.nome, p.pedido_id,
z.nome as pizza, i.quantidade,
dinheiro(i.valor) as preco,
dinheiro(i.quantidade * i.valor) as total
from cliente c
inner join pedido p
on c.cliente_id = p.cliente_id
inner join item_pedido i
on p.pedido_id = i.pedido_id
inner join pizza z
on i.pizza_id = z.pizza_id
order by p.pedido_id;