--Exemplo de tabela de usuários com criptografia de senha
create table usuarios(
	login varchar(50) primary key,
	senha varchar(50),
	perfil varchar(10)
	);

--Utilizando criptografia de senha
insert into usuarios(login, senha, perfil) values ("Ana",MD5("teste123"),"Administrador");
insert into usuarios(login, senha, perfil) values ("Bia",PASSWORD("teste123"),"Administrador");
insert into usuarios(login, senha, perfil) values ("Carlos",DES_ENCRYPT("teste123", "chave"),"padrao");
insert into usuarios(login, senha, perfil) values ("Maria",AES_ENCRYPT("teste123", "chave"),"padrao");

select login,AES_DECRYPT(senha,"chave"),perfil from usuarios;
select login,DES_DECRYPT(senha,"chave"),perfil from usuarios;
select * from usuarios where senha = MD5("teste123");
select * from usuarios where senha = PASSWORD("teste123");

select MD5("teste123");

insert into usuarios(login, senha, perfil) values ("Bete",MD5("teste123"),"Administrador");

Tabela dos comandos para criptografia de dados
Name	Description
AES_DECRYPT()	Decrypt using AES
AES_ENCRYPT()	Encrypt using AES
COMPRESS()	Return result as a binary string
DECODE()	Decodes a string encrypted using ENCODE()
DES_DECRYPT()	Decrypt a string
DES_ENCRYPT()	Encrypt a string
ENCODE()	Encode a string
ENCRYPT()	Encrypt a string
MD5()	Calculate MD5 checksum
OLD_PASSWORD()	Return the value of the pre-4.1 implementation of PASSWORD
PASSWORD()	Calculate and return a password string
SHA1(), SHA()	Calculate an SHA-1 160-bit checksum
SHA2()	Calculate an SHA-2 checksum
UNCOMPRESS()	Uncompress a string compressed
UNCOMPRESSED_LENGTH()	Return the length of a string before compression