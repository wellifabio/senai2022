-- Para ver as funções criadas no seu SGBD.
-- Escopo das funções SGBD
SHOW FUNCTION STATUS;

-- Exemplos de funções nativas MySQL MariaDB
select curtime() as hora;
select curDate() as data;
select now() as agora;
select day(now()) as dia;
select month(now()) as mes;
select year(now()) as ano;
select day(curDate()) as dia;
select day("1980-09-08") as dia;
select month("1980-09-08") as dia;
select datediff(curDate(),"1980-09-08")/365;
select concat("R$ ",3.55);
-- As segintes funções agrupam array (vetor)
-- maximo
select max(valor) from itens_pedido;
-- Média aritmética
select avg(valor) from itens_pedido;
-- mínimo
select min(valor) from itens_pedido;
-- soma
select sum(valor) from itens_pedido;
-- contar
select count(valor) from itens_pedido;

-- Criando Funções (Exemplo de uma função que formata valores como moeda)
delimiter //
create function moeda(v decimal(7,2)) returns text
Begin
    return concat("R$ ",v);
end//
delimiter ;
-- Para excluir uma função
drop function moeda;
-- Criar a função novamente modificada com declaração de variáveis
delimiter //
create function moeda(v decimal(7,2)) returns text
begin
    declare x varchar(20);
    set x = format(v,2,'de_DE');
    return concat("R$ ",x);
end//
delimiter ;
-- Utilização da função criada no banco de dados Pizzaria
select pedido_id, pizza_id, quantidade, moeda(valor) from itens_pedido;

-- Exercícios
-- 1 - Crie uma função chamada desconto(valor) que aplique um desconto de 10% em um valor de parâmetro
drop function if exists desconto;
delimiter $
create function desconto(valor decimal(7,2)) returns decimal(7,2)
begin
    return valor - valor * 10 / 100;
end$
delimiter ;
-- Testar
select desconto(100);
-- Aplicando desconto ao contexto da pizzaria
select pedido_id, pizza_id, quantidade, moeda(valor)
as preco, moeda(desconto(valor)) as a_vista from itens_pedido;

-- 2 - Crie uma função chamada juros(valor,meses) que aplique um juros composto de 1% ao mês 
-- e receba como parâmetro o valor e quantos mêses.
drop function if exists juros;
delimiter $
create function juros(valor decimal(7,2),meses integer) returns decimal(7,2)
begin
    return valor * pow((1 + 0.01),meses);
end$
delimiter ;
-- testar
select juros(100,10);