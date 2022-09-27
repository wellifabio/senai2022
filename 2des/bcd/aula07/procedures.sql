-- Imgine o seguinte cenário
select * from clientes;
-- O cliente 15 "Claudiney Ramos Tinoco" quer duas pizzas uma baiana e uma marguerita
select * from pizzas;
-- 6 Baiana 32.13
-- 22 Margherita 34.37
-- Registrando o pedido
insert into pedidos values (default, 15, curdate(), curtime(), null);
select * from pedidos order by pedido_id desc limit 1;
select last_insert_id();
-- pedido_id = 27
insert into itens_pedido values (27,6,1,32.13);
insert into itens_pedido values (27,22,1,34.37);

update pedidos
set valor = (select sum(quantidade * valor) from itens_pedido where pedido_id = 27)
where pedido_id = 27;

-- Exemplo de Stored procedure (Procedimento armazenado) que atualiza total do pedido
drop procedure if exists set_total_pedido();
delimiter //
create procedure set_total_pedido(id int)
begin
	update pedidos
	set valor = (select sum(quantidade * valor) from itens_pedido where pedido_id = id)
	where pedido_id = id;
end//
delimiter ;

-- Como temos apenas um comando neste precedimento, não é necessário alterar delimiter ou begin end
drop procedure if exists set_total_pedido();
create procedure set_total_pedido(id int)
update pedidos
set valor = (select sum(quantidade * valor) from itens_pedido where pedido_id = id)
where pedido_id = id;

-- Mostrar as procedures que meu BD possui.
SHOW PROCEDURE STATUS;

-- testar a PROCEDURE
select * from pedidos order by pedido_id desc limit 1;
-- vamos zerar o valor do pedido
update pedidos set valor = 0 where pedido_id = 27;
select * from pedidos order by pedido_id desc limit 1;
-- chamar o procedimento
call set_total_pedido(27);
select * from pedidos order by pedido_id desc limit 1;

-- Um exemplo de transação completa para realizar um pedido é a seguinte:
insert into pedidos values (default, 15, curdate(), curtime(), null);
insert into itens_pedido values (27,6,1,32.13);
insert into itens_pedido values (27,22,1,34.37);
call set_total_pedido(27);