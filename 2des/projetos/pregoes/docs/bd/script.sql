drop database if exists Pregao;
create database Pregao charset=UTF8 collate utf8_general_ci;
use Pregao;

create table usuarios(
    usuario_id integer primary key not null auto_increment,
    email varchar(100) not null unique,
    senha varchar(100) not null,
    tipo_documento varchar(4) not null,
    numero_documento varchar(20) not null,
    nome varchar(50) not null,
    tipo integer not null
);

-- tipo de documento (cpf, cnpj)
-- tipo de usuário (comprador, fornecedor)

create table telefones(
    usuario integer not null,
    tipo varchar(15) not null,
    numero varchar(20) not null,
    foreign key (usuario) references usuarios(usuario_id)
);

create table pregoes(
    pregao_id integer primary key not null auto_increment,
    comprador integer not null,
    data_abrtura date not null,
    data_encerramento date not null,
    foreign key (comprador) references usuarios(usuario_id)
);

create table objetos(
    objeto_id integer primary key not null auto_increment,
    pregao integer not null,
    nome varchar(50) not null,
    descricao varchar(256) not null,
    foreign key (pregao) references pregoes(pregao_id)
);

create table ofertas(
    oferta_id integer primary key not null auto_increment,
    objeto integer not null,
    fornecedor integer not null,
    data date not null,
    valor decimal(10,2) not null,
    foreign key (objeto) references objetos(objeto_id),
    foreign key (fornecedor) references usuarios(usuario_id)
);

show tables;

insert into usuarios (email, senha, tipo_documento, numero_documento, nome, tipo) values
('ama@souza.com',md5('1234'),'cpf','590.610.841-64','Ana Pereira de Souza',0),
('maria@barros.com',md5('1234'),'cpf','481.145.560-64','Maria Mello de Barros',0),
('marcos@rego.com',md5('1234'),'cpf','339.455.110-11','Marcos Mello Rego',0),
('sansung@sansung.com',md5('1234'),'cnpj','79.267.167/0001-90','Sansung',1),
('texaco@texaco.com',md5('1234'),'cnpj','69.996.489/0001-05','Texaco',1),
('shell@shell.com',md5('1234'),'cnpj','01.682.010/0001-89','Shell',1),
('lg@lg.com',md5('1234'),'cnpj','14.955.306/0001-71','LG',1),
('positivo@positivo.com',md5('1234'),'cnpj','11.217.132/0001-70','Positivo',1),
('ambev@ambev.com',md5('1234'),'cnpj','72.666.240/0001-29','Ambev',1),
('cocacola@cocacola.com',md5('1234'),'cnpj','01.271.049/0001-84','Coca Cola',1),
('kodak@kodak.com',md5('1234'),'cnpj','76.094.755/0001-56','Kodak',1),
('loginha@loginha.com',md5('1234'),'cnpj','96.024.978/0001-58','Loginha',1),
('bardaesquina@bardaesquina.com',md5('1234'),'cnpj','46.253.921/0001-28','Bar da esquina',1),
('bardapraia@bardapraia.com',md5('1234'),'cnpj','61.700.282/0001-97','Bar da Praia',1),
('casadoferreiro@casadoferreiro.com',md5('1234'),'cnpj','66.797.089/0001-58','Casadoferreiro',1),
('seuoscar@seuoscar.com',md5('1234'),'cnpj','04.951.566/0001-39','Seu Oscar',1),
('importadordoparaguai@importadordoparaguai.com',md5('1234'),'cnpj','77.862.338/0001-30','Importador do Paraguai',1),
('importadordemiami@importadordemiami.com',md5('1234'),'cnpj','43.644.594/0001-96','Importador de Miami',1),
('gentequefaz@gentequefaz.com',md5('1234'),'cnpj','93.502.224/0001-93','Gente que faz',1);

insert into telefones values
(1,'celular','19-64371-4552'),
(1,'fixo','19-63014-0312'),
(2,'celular','19-16445-3821'),
(3,'celular','19-03491-8877'),
(3,'fixo','19-53155-5663'),
(4,'celular','19-14063-9720'),
(4,'fixo','19-02811-2764'),
(5,'celular','19-31969-3474'),
(5,'fixo','19-65220-9230'),
(6,'celular','19-05226-9534'),
(6,'fixo','19-97812-3878'),
(6,'comercial','19-95799-4248'),
(7,'celular','19-08493-9800'),
(7,'fixo','19-96621-9125'),
(8,'celular','19-26745-1669'),
(8,'fixo','19-15627-3624'),
(9,'celular','19-52970-4874'),
(9,'fixo','19-90745-4896'),
(9,'comercial','19-18129-7226'),
(10,'celular','19-64795-8016'),
(10,'fixo','19-64769-5901'),
(11,'celular','19-86038-2809'),
(11,'fixo','19-73436-4472'),
(12,'celular','19-81209-1528'),
(12,'fixo','19-41933-8597'),
(13,'celular','19-94193-7991'),
(13,'fixo','19-46787-6152'),
(14,'celular','19-34641-8324'),
(14,'fixo','19-68603-7640'),
(15,'celular','19-28582-1323'),
(15,'fixo','19-04374-1319'),
(16,'celular','19-05973-0027'),
(16,'fixo','19-31822-1361'),
(16,'comercial','19-72911-0409'),
(17,'celular','19-43725-4529'),
(17,'fixo','19-22646-2856'),
(18,'celular','19-13444-8979'),
(18,'fixo','19-53682-9329'),
(19,'celular','19-10872-5425'),
(19,'fixo','19-53054-6760');

select * from usuarios;
select * from telefones;



