drop database if exists imgs;
create database imgs charset = UTF8 collate = utf8_general_ci;
use imgs;
create table imgs(
	 id integer primary key not null auto_increment,
	 foto mediumblob
);

INSERT INTO imgs (id,foto) VALUES (null,LOAD_FILE("D:/tel.png"));
SELECT * FROM imgs;
SELECT foto INTO OUTFILE "D:/imgs/retorno.png" FROM imgs WHERE id = 1;


