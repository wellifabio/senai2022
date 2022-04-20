-- DCL (DATA CONTROL LANGUAGE)Administração de usuários
-- Comandos GRANT, REVOKE E DENY
SELECT user FROM mysql.user;
DESCRIBE mysql.user;
-- Criar usuário de Banco de Dados
DROP USER IF EXISTS pizzaiolo;
CREATE USER 'pizzaiolo'@'%' IDENTIFIED VIA mysql_native_password;
-- Configurar a senha
SET PASSWORD FOR 'pizzaiolo'@'%'=PASSWORD('1234');
-- Dar privilegios apenas no banco de dados PIZZARIA
GRANT ALL PRIVILEGES ON `pizzaria`.* TO 'pizzaiolo'@'%';
-- Revogar Acessos
-- Revogar todos os privilegios
REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'pizzaiolo'@'%';
REVOKE GRANT OPTION ON *.* FROM 'pizzaiolo'@'%';

-- Usuário com todos os privilegios em todos os Bancos de Dados do SGBD
-- Criar usuário de Banco de Dados (SGBD) dando todos os privilégios
DROP USER IF EXISTS pizzaiolo;
CREATE USER 'pizzaiolo'@'%' IDENTIFIED VIA mysql_native_password USING '***';
-- Dar todos os privilegios
GRANT ALL PRIVILEGES ON *.* TO 'pizzaiolo'@'%' REQUIRE 
NONE WITH GRANT OPTION
	MAX_QUERIES_PER_HOUR 0
	MAX_CONNECTIONS_PER_HOUR 0
	MAX_UPDATES_PER_HOUR 0 
	MAX_USER_CONNECTIONS 0;
-- Revogar todos os privilegios
REVOKE ALL PRIVILEGES ON *.* FROM 'pizzaiolo'@'%';
-- Dar apenas privilegios básicos
GRANT USAGE ON *.* TO 'pizzaiolo'@'%' REQUIRE
NONE WITH 
	MAX_QUERIES_PER_HOUR 0
	MAX_CONNECTIONS_PER_HOUR 0
	MAX_UPDATES_PER_HOUR 0
	MAX_USER_CONNECTIONS 0;
-- Ver os privilegios de um usuário
SHOW GRANTS FOR 'pizzaiolo';
	
-- ADMINISTRAR ROOT	
-- Alterar a senha do user root
-- No Shell antes de acessar o mysql digite o comando
mysqladmin.exe -u root password sua-nova-senha
-- Alterar a senha do PhpMyAdmin, acesse o arquivo abaixo
C:\xampp\phpMyAdmin\config.inc.php
-- altere a senha no campo password
$cfg['Servers'][$i]['password'] = '1234';
-- Para voltar sem senha, dentro do Mysql pelo shell digite o comando
SET PASSWORD FOR root@localhost=PASSWORD('');
-- Alterar a senha novamente no PhpMyAdmin