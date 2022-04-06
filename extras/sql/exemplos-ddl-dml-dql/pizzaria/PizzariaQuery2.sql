-- Mostrar as funções e procedimentos armazenados no banco;
SHOW PROCEDURE STATUS;
SHOW FUNCTION STATUS;
-- Exemplos de Funções Nativas do Banco
select curtime() as hora;
select curDate() as data;
select now() as agora;
select day(now()) as dia;
select month(now()) as mes;
select year(now()) as ano;
select datediff(curDate(),"1980-09-08")/365;
-- Exemplo de inserir im pedido na pizzaria
-- Utilzando funçõe que pegam a data e a hora
-- do sistema
insert into pedido values
(default,105,curdate(),curtime(),0);
-- Exemplo de como inserir os itens do pedido
insert into item_pedido values
(27, 1, 1, 32),
(27, 2, 2, 31);
-- Atualizando o valor do pedido usando a
-- função sum() para somar
update pedido set valor = 
(select sum(quantidade * valor)
from item_pedido where pedido_id = 27)
where pedido_id = 27;
-- Criando uma função que coloca R$ antes do valor
delimiter //
create function dinheiro(din decimal(5,2)) returns text
begin 
return concat("R$ ", din);
end//
delimiter ;
-- Testando a função
select pedido_id, dinheiro(valor) from pedido;
-- Função que retorna a idade em dias
drop function if exists idade_dias;
delimiter //
create function idade_dias(nasc date) returns int
begin
return datediff(curDate(),nasc);
end//
delimiter ;
-- Testando a função
select idade_dias("1998-09-08") as dias_de_vida;
-- Função que retorna a idade em meses
drop function if exists idade_meses;
delimiter //
create function idade_meses(nasc date) returns int
begin
return datediff(curDate(),nasc)/30;
end//
delimiter ;
-- Testando a função
select idade_meses("1998-09-08") as meses_de_vida;
-- Função que retorna a idade;
drop function if exists idade;
delimiter //
create function idade(nasc date) returns int
begin
return datediff(curDate(),nasc)/365;
end//
delimiter ;
-- Testando a função
select idade("1980-09-08") as anos_de_vida;