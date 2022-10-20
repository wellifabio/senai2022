drop database if exists receitas;
create database receitas charset = UTF8 collate = utf8_general_ci;
use receitas;

create table receitas(
    id integer primary key not null auto_increment,
    tipo varchar(15) not null,
    nome varchar(40) not null,
    ingredientes varchar(255) not null,
    modo_preparo varchar(255) not null,
    foto mediumblob
);

load data infile 'D:/wellington/senai2022/2des/pwbe/aula11/receitas_blob/docs/db/receitas.csv'
into table receitas
fields terminated by ';'
enclosed by '"'
lines terminated by '\r\n'
ignore 1 rows
set foto=null;

select * from receitas;

update receitas set foto=to_base64(LOAD_FILE("D:/wellington/senai2022/2des/pwbe/aula11/receitas_arquivo/repositorio/ovo.png")) where id = 1;
update receitas set foto=to_base64(LOAD_FILE("D:/wellington/senai2022/2des/pwbe/aula11/receitas_arquivo/repositorio/miojo.png")) where id = 2;
update receitas set foto=to_base64(LOAD_FILE("D:/wellington/senai2022/2des/pwbe/aula11/receitas_arquivo/repositorio/ovo_frito.png")) where id = 3;
update receitas set foto=to_base64(LOAD_FILE("D:/wellington/senai2022/2des/pwbe/aula11/receitas_arquivo/repositorio/alface.png")) where id = 4;
update receitas set foto=to_base64(LOAD_FILE("D:/wellington/senai2022/2des/pwbe/aula11/receitas_arquivo/repositorio/brigadeiro.png")) where id = 5;
update receitas set foto=to_base64(LOAD_FILE("D:/wellington/senai2022/2des/pwbe/aula11/receitas_arquivo/repositorio/doce_de_leite.png")) where id = 6;
