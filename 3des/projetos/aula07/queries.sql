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

-- Criando Funções
select * from itens_pedido;