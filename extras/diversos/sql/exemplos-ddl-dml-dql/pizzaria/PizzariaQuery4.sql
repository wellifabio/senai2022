-- Mostrar as TRIGGERS (GATILHOS) armazenadas no banco;
SHOW TRIGGERS
-- É Associado a uma tabela
-- É armazenado no DB em um arquivo separado
-- Não sçao chamados diretamente, são disparados automaticamente
-- O procedimento é invocado quando um comando dml é executado.
#Oso dos gatilhos para:
-- Verificação da integridade dos dados
-- Validação dos dados
-- Rastreamento e registro de logs de atividades nas tabelas
-- Arquivamento de registros excluídos
#SINTAXE

CREATE TRIGGER nome timing operação
ON tabela
FOR EACH ROW
declarações

timing = BEFORE | AFTER
operação = INSERT | UPDATE | DELETE

-- Exemplo de gatilho ao inserir um item_pedido
-- atualiza o valor total do pedido
create trigger tr_atualiza_valor_pedido after insert
on item_pedido
for each row
update pedido
set valor=(select sum(quantidade * valor) from item_pedido where pedido_id = new.pedido_id)
			where pedido_id = new.pedido_id;


-- Agora teremos que alterar nosso precedimento removendo a parte que o gatilho já faz.
drop procedure if exists criar_pedido_item_igual;
delimiter //
create procedure criar_pedido_item_igual(cli integer, pizza int, qtd int)
begin
	insert into pedido values
		(default,cli,curdate(),curtime(),0);
	insert into item_pedido values
		(ultimo_pedido(),pizza,qtd,(select valor from pizza where pizza_id = pizza));
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