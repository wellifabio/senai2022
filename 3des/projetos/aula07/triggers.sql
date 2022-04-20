-- Mostrar as TRIGGERS (GATILHOS) armazenadas no banco;
SHOW TRIGGERS;
-- É Associado a uma tabela
-- É armazenado no DB em um arquivo separado
-- Não sçao chamados diretamente, são disparados automaticamente
-- O procedimento é invocado quando um comando dml é executado.
-- Oso dos gatilhos para:
-- Verificação da integridade dos dados
-- Validação dos dados
-- Rastreamento e registro de logs de atividades nas tabelas
-- Arquivamento de registros excluídos

-- SINTAXE
CREATE TRIGGER nome timing operação
ON tabela
FOR EACH ROW
declarações

timing = BEFORE | AFTER
operação = INSERT | UPDATE | DELETE

-- Exemplo de gatilho que adiciona um telefone padrão '19111111111' ao inserir um novo cliente
create trigger tr_insere_telefone after insert on clientes
for each row
insert into telefones (cliente_id,telefone)
value (new.cliente_id,'19111111111');

SHOW TRIGGERS;

-- Inserindo um novo cliente para testar
insert into Clientes(nome, logradouro, numero, complemento, bairro, referencia)
values("Ana Silva","Rua dos Malas",124,"BL19 AP45","Vargeão","Igreja Presbiteriana");
-- Verificando se criou o telefone
select * from telefones where cliente_id = last_insert_id();

-- Agora crie um gatilho que após inserir um iten no pedido
-- atualize o valor total do pedido.
-- coloque o nome de "tr_atualiza_valor_pedido"