-- Criando Funções (Exemplo de uma função que formata valores como moeda)
-- Versão 1
drop function if exists moeda;

create function moeda(v float) returns text
return concat("R$ ",v);

-- Versão 2
drop function if exists moeda;
delimiter //
create function moeda(v float) returns text
Begin
    return concat("R$ ",v);
end//
delimiter ;
-- Para excluir uma função
drop function if exists moeda;
-- Criar a função novamente modificada com declaração de variáveis
delimiter //
create function moeda(v float) returns text
begin
    declare x varchar(20);
    set x = format(v,2,'de_DE');
    return concat("R$ ",x);
end//
delimiter ;