-- 2. Escreva um comando select para mostrar o nome do funcionário que mais fez solicitações (em Reais).
-- Então, você deverá mostrar o nome do funcionário e seu respectivo valor total, em Reais.
select * from ItensSolicitacao;
select max(valor) from ItensSolicitacao;

Select f.Nome_Func, sum(i.valor) as Total
from ItensSolicitacao i
inner join Solicitacao s on s.Num_Sol = i.Num_Sol
inner join Funcionarios f on s.Cod_Func = f.Cod_Func
group by f.Cod_Func
order by Total desc;

Select f.Nome_Func, sum(i.valor) as Total
from ItensSolicitacao i
inner join Solicitacao s on s.Num_Sol = i.Num_Sol
inner join Funcionarios f on s.Cod_Func = f.Cod_Func
group by f.Cod_Func
order by Total desc limit 1;
-- 3. Escreva um comando select para mostrar os nomes dos departamentos e produtos que requisitaram Parafuso e Difusor.
select * from departamentos;
select * from solicitacao;

select d.nome_depto from departamentos d inner join solicitacao s on d.cod_depto = s.cod_depto;

select * from produtos;

select d.nome_depto, p.Nome_produto from departamentos d
inner join solicitacao s on d.cod_depto = s.cod_depto
inner join itenssolicitacao i on s.Num_Sol = i.Num_Sol
inner join produtos p on i.cod_produto = p.cod_produto
where Nome_produto like "Parafuso" OR Nome_produto like "Difusor";

-- 4. Escreva um comando select para mostrar os nomes dos produtos vendidos em Fevereiro de 2018.
select p.Nome_produto from Produtos p
inner join  ItensSolicitacao i on i.Cod_Produto = p.Cod_Produto
inner join Solicitacao s on s.Num_Sol = i.Num_Sol
where Year(s.Data_sol) = "2018" AND month(s.Data_sol) = "02";
