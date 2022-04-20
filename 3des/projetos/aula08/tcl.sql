-- Transações: São operações que para serem completas são necessários mais de um insert
-- Ou vários insert, alguns updates.
-- Exemplos no banco de dados PIZZARIA
-- Neste banco de dados por exemplo um pedido só estará completo após adicionar um ou mais ítens
-- Alterando o campo valor do pedido com a soma dos subtotais dos ítens.
-- Este seria um exemplo de Transação, caso ocorra um erro durante estes processos
-- A transação seria cancelada e o pedido iria voltar ao estado inicial


-- Bancos de dados MySQL estão configurados como auto commit
-- para utilizarmos Transações, devemos desligar esta opção
SELECT @@autocommit;
SET @@autocommit = OFF;
SELECT @@autocommit;

-- Já conectado ao banco de dados PIZZARIA, veja como estão os últimos 5 pedidos
Select * from pedidos order by pedido_id desc limit 5;

-- Vamos iniciar uma transação e finalizar com Rollback
start transaction;
    insert into pedidos value (default,1,curdate(),curtime(),null);
    select * from pedidos order by pedido_id desc limit 5;
rollback;

-- veja como estão os últimos 5 pedidos e confirme que nada foi alterado
Select * from pedidos order by pedido_id desc limit 5;

-- Agora vamos iniciar uma transação e finalizar com Commit
start transaction;
    insert into pedidos value (default,1,curdate(),curtime(),null);
    select * from pedidos order by pedido_id desc limit 5;
commit;

-- veja como estão os últimos 5 pedidos e confirme que foi alterado desta vez.
Select * from pedidos order by pedido_id desc limit 5;

-- Agora vamos iniciar uma transação utilizar savepoint e finalizar com Commit
-- Inicie uma transação e adicione um novo pedido
start transaction;
    Select * from pedidos order by pedido_id desc limit 5;
    savepoint teste1;
    insert into pedidos value (default,1,curdate(),curtime(),null);
    Select * from pedidos order by pedido_id desc limit 5;
    rollback to teste1;    
commit;
Select * from pedidos order by pedido_id desc limit 5;

-- Por fim voltamos a configuração padrão de auto commit
SET @@autocommit = ON;
SELECT @@autocommit;

-- Desafio:
-- Crie uma Procedure que utilize transações para adicionar um pedido e dois ítens
-- Retornando sucesso ou erro ao final do procedimento.