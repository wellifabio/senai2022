create database if not exists Funeraria default character set = utf8;
use Funeraria;
create table Planos(
	idPlano integer primary key auto_increment,
	dataCadastro date not null,
	tipo varchar(30) not null,
	descricao varchar(80)
	);

create table Produtos(
	cod integer primary key auto_increment,
	nome varchar(40) not null,
	descricao varchar(80) not null,
	preco decimal(5,2)
	);

create table Parcerias(
	cnpj varchar(14) primary key,
	nome varchar(40) not null,
	telefone varchar(15)
	);

insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"Unitário básico","Velório e Caixão básico");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"Unitário clássico","Velório, Caixão básico e 4 velas");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"Unitário padrão","Velório, Caixão standat e 4 velas");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"Unitário pluss","Velório, Caixão style pluss, velas e duas carpideiras");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"familiar básico","Velório e Caixão básico para até 5 pessoas");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"familiar clássico","Velório, Caixão básico e 4 velas, para até 5 pessoas");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"familiar padrão","Velório, Caixão standat e 4 velas para 10 pessoas");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"familiar Pluss","Velório, Caixão style pluss, velas e duas carpideiras para 3 pessoas");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"plano pet unitário","Velório animal e caixão sob medida");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"plano pet pluss","Velório animal, caixão sob medida, cerimônia e discurso");
insert into Planos(dataCadastro, tipo, descricao) values(CURDATE(),"plano plus size","Velório, Caixão sob medida para até 250 quilos");

insert into Produtos(nome, descricao, preco) values("Caixão básico","Caixão de compensado básico",250.99);
insert into Produtos(nome, descricao, preco) values("Caixão pequeno","Caixão pequeno de compensado básico",200.99);
insert into Produtos(nome, descricao, preco) values("Caixão standat","Caixão modelo padrão de compensado",300.49);
insert into Produtos(nome, descricao, preco) values("Velas Grandes","Velas Grandes, conjunto com 4",80.45);
insert into Produtos(nome, descricao, preco) values("Velas Médias","Velas Médias, conjunto com 4",75.55);
insert into Produtos(nome, descricao, preco) values("Velas Pequenas","Velas Pequenas, conjunto com 4",60.90);
insert into Produtos(nome, descricao, preco) values("Caixão Style Pluss","Caixão Style Pluss de madeira de lei",22.00);
insert into Produtos(nome, descricao, preco) values("Caixão de Cachorro","Caixão de Cachorro sob medida",200.99);
insert into Produtos(nome, descricao, preco) values("Caixão de Gato","Caixão de Gato sob medida",200.99);
insert into Produtos(nome, descricao, preco) values("Caixão Sob Medida","Caixão Sob Medida para até 250 quilos",800.49);
insert into Produtos(nome, descricao, preco) values("Coroa de flores Grande","Coroa de flores Grande com uma frase",180.45);
insert into Produtos(nome, descricao, preco) values("Coroa de flores Média","Coroa de flores Média com uma frase",150.55);
insert into Produtos(nome, descricao, preco) values("Coroa de flores Pequena","Coroa de flores Pequena com uma frase",120.90);

insert into Parcerias(cnpj, nome,telefone) values("02556456000125","VUNIMED SAUDE","19989797797");
insert into Parcerias(cnpj, nome,telefone) values("06455643000129","BRAZESCO SEGUROS","19998788778");
insert into Parcerias(cnpj, nome,telefone) values("01564654000164","GITAU SAÚDE","19996898785");
insert into Parcerias(cnpj, nome,telefone) values("01321321000132","Restaurante da Vovó","1935654568");
insert into Parcerias(cnpj, nome,telefone) values("06849887000159","Lanchão da Praça","19989877899");
insert into Parcerias(cnpj, nome,telefone) values("06516564000184","BCDonalds","19897898987");
insert into Parcerias(cnpj, nome,telefone) values("06465968000178","CaninhaCOCOROTE","19966578987");
insert into Parcerias(cnpj, nome,telefone) values("06984798000126","CIRCO DE SOLZÃO","19654657987");

describe Produtos;
describe Planos;
describe Parceria;
show tables;





