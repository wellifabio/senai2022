-- Para ver os procedimentos criados no seu BD
-- Escopo dos procedimentos armazenados BD
SHOW PROCEDURE STATUS;

-- procedimento que mostre o valor de uma pizza, recebendo como "filtro" parametro o id
drop procedure if exists ver_preco;
delimiter //
create procedure ver_preco(id integer)
begin
    declare quantos integer;
    select concat("O preço desta pizza é ",moeda(valor))
    from pizzas where pizza_id = id;
    set quantos = (select count(pizza_id) from pizzas where pizza_id = id);
    if quantos = 0 then
        select "Pizza não encontrada" as erro;
    end if;
end//
delimiter ;

-- Para executar um procedimento
call ver_preco(12);

-- Desafio: crie uma procedure que receba os dados a seguir:
-- cliente_id, pizza_id e quantidade
-- gere um pedido e coloque esta pizza como item

