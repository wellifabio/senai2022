-- Mostrar as funções e procedimentos armazenados no banco;
SHOW PROCEDURE STATUS;
SHOW FUNCTION STATUS;
-- Exemplos de PROCEDIMENTOS
drop procedure if exists ver_preco;
delimiter //
create procedure ver_preco(id integer)
begin
	select concat("O preço é ", valor) as Preço
	from pizza
	where pizza_id = id;
	select 'Procedimento executado com sucesso';
end//
delimiter ;
-- Testando o PROCEDIMENTO
call ver_preco(2);

-- Criando uma função que retorna o ultimo pedido garado
drop function if exists ultimo_pedido();
delimiter //
create function ultimo_pedido() returns integer
begin
declare retorno integer;
set retorno = (select pedido_id from pedido order by pedido_id desc limit 1);
return retorno;
end//
delimiter ;
select ultimo_pedido();

-- Criando uma função que coloca R$ antes do valor
delimiter //
create function dinheiro(din decimal(5,2)) returns text
begin 
return concat("R$ ", din);
end//
delimiter ;

-- Criando um procedimento que insere um pedido,
-- insere um item do pedido quando é de apenas um sabor de pizza
-- atualiza o valor total
-- e lista os pedidos do cliente
drop procedure if exists criar_pedido_item_igual;
delimiter //
create procedure criar_pedido_item_igual(cli integer, pizza int, qtd int)
begin
	insert into pedido values
		(default,cli,curdate(),curtime(),0);
	insert into item_pedido values
		(ultimo_pedido(),pizza,qtd,(select valor from pizza where pizza_id = pizza));
	update pedido set valor=(select sum(quantidade * valor) from item_pedido where pedido_id = ultimo_pedido())
			where pedido_id = ultimo_pedido();
	select c.cliente_id, c.nome, p.pedido_id, p.data,
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
		where c.cliente_id = cli
		order by p.data desc;
end//
delimiter ;
-- Testa o Procedimento
call criar_pedido_item_igual(3,5,3);


#IN, OUT e INOUT em Procedimentos Armazenados
#IN é padrão, então não é necessário escreve-lo
-- Exemplo da passagem de parâmetro IN
drop procedure if exists descricao_pizza;
delimiter $
create procedure descricao_pizza(in id integer)
begin
	select descricao from pizza where pizza_id = id;
end$
delimiter ;
call descricao_pizza(1);
set @cod = 2;
call descricao_pizza(@cod);

-- Exemplo de receber dados por parâmetro OUT
drop procedure if exists item_pedidos_total;
delimiter $
create procedure item_pedidos_total(in id integer, out total decimal(6,2))
begin
	select sum(valor*quantidade) into total from item_pedido where pedido_id = id;
end$
delimiter ;
call item_pedidos_total(1,@total);
select @total;

-- Exemplo de receber dados por parâmetro INOUT
drop procedure if exists aumento_13_porcento;
delimiter $
create procedure aumento_13_porcento(inout valor decimal(6,2))
begin
	set valor = valor + valor * 13 / 100;
end$
delimiter ;
set @valorinicial = 1250.3;
call aumento_13_porcento(@valorinicial);
select @valorinicial;