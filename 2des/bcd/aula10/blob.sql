drop database if exists armazena_arquivos;
create database armazena_arquivos charset = UTF8 collate = utf8_general_ci;
use armazena_arquivos;
create table arquivos(
	 id integer primary key not null auto_increment,
	 tipo varchar(5) not null,
	 arquivo mediumblob
);

insert into arquivos values (null,'.jpg',load_file("D:/wellington/senai2022/2des/bcd/aula10/blobitens/note.jpg"));
insert into arquivos values (null,'.png',load_file("D:/wellington/senai2022/2des/bcd/aula10/blobitens/tel.png"));
insert into arquivos values (null,'.txt',load_file("D:/wellington/senai2022/2des/bcd/aula10/blobitens/text.txt"));
insert into arquivos values (null,'.docx',load_file("D:/wellington/senai2022/2des/bcd/aula10/blobitens/texto.docx"));

select id, tipo from arquivos;

select arquivo into dumpfile "D:/wellington/senai2022/2des/bcd/aula10/blobresult/file1.jpg" from arquivos where id = 1;
select arquivo into dumpfile "D:/wellington/senai2022/2des/bcd/aula10/blobresult/file2.png" from arquivos where id = 2;
select arquivo into dumpfile "D:/wellington/senai2022/2des/bcd/aula10/blobresult/file3.txt" from arquivos where id = 3;
select arquivo into dumpfile "D:/wellington/senai2022/2des/bcd/aula10/blobresult/file4.docx" from arquivos where id = 4;

