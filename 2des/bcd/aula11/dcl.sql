-- DCL (DATA CONTROL LANGUAGE)Administração de usuários
-- Ver os usuários do SGBD
SELECT user FROM mysql.user;
DESCRIBE mysql.user;

-- Comandos GRANT, REVOKE (Exemplos)
-- Criar usuário de Banco de Dados
DROP USER IF EXISTS pizzaiolo;
CREATE USER 'pizzaiolo'@'%' IDENTIFIED VIA mysql_native_password;
-- Configurar a senha
SET PASSWORD FOR 'pizzaiolo'@'%'=PASSWORD('1234');
-- Ver os privilegios de um usuário
SHOW GRANTS FOR 'pizzaiolo';
-- Dar privilegios TOTAIS, apenas no banco de dados PIZZARIA
GRANT ALL PRIVILEGES ON `pizzaria`.* TO 'pizzaiolo'@'%';
-- Ver os privilegios de um usuário
SHOW GRANTS FOR 'pizzaiolo';

-- Criar um usuário "atendente" dando acesso somente de LEITURA no banco de dados PIZZARIA
DROP USER IF EXISTS atendente;
CREATE USER 'atendente'@'%' IDENTIFIED VIA mysql_native_password;
SET PASSWORD FOR 'atendente'@'%'=PASSWORD('1234');
SHOW GRANTS FOR 'atendente';
GRANT SELECT ON `pizzaria`.* TO 'atendente'@'%';
SHOW GRANTS FOR 'atendente';

-- Criar um usuário "garcon" dando acesso somente de LEITURA na tabela de PIZZAS no bd PIZZARIA
DROP USER IF EXISTS garcon;
CREATE USER 'garcon'@'%' IDENTIFIED VIA mysql_native_password;
SET PASSWORD FOR 'garcon'@'%'=PASSWORD('1234');
SHOW GRANTS FOR 'garcon';
GRANT SELECT ON `pizzaria`.`pizzas` TO 'garcon'@'%';
SHOW GRANTS FOR 'garcon';

-- Revogar Privilegios
-- Revogar todos os privilegios
REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'pizzaiolo'@'%';
REVOKE GRANT OPTION ON *.* FROM 'pizzaiolo'@'%';

-- Criando usuário do (SGBD) já configurando a senha dando todos os privilégios em todos os Bancos de Dados
DROP USER IF EXISTS coadmin;
CREATE USER 'coadmin'@'%' IDENTIFIED VIA mysql_native_password USING PASSWORD('1234');
-- Dar todos os privilegios
GRANT ALL PRIVILEGES ON *.* TO 'coadmin'@'%' REQUIRE 
NONE WITH GRANT OPTION
	MAX_QUERIES_PER_HOUR 0
	MAX_CONNECTIONS_PER_HOUR 0
	MAX_UPDATES_PER_HOUR 0 
	MAX_USER_CONNECTIONS 0;
-- Revogar todos os privilegios
REVOKE ALL PRIVILEGES ON *.* FROM 'coadmin'@'%';
REVOKE GRANT OPTION ON *.* FROM 'coadmin'@'%';
-- Dar apenas privilegios básicos de leitura
GRANT USAGE ON *.* TO 'coadmin'@'%' REQUIRE
NONE WITH 
	MAX_QUERIES_PER_HOUR 0
	MAX_CONNECTIONS_PER_HOUR 0
	MAX_UPDATES_PER_HOUR 0
	MAX_USER_CONNECTIONS 0;

-- Excluir todos os usuários de Exemplo
DROP USER IF EXISTS coadmin;
DROP USER IF EXISTS pizzaiolo;
DROP USER IF EXISTS atendente;
DROP USER IF EXISTS garcon;
	
-- ADMINISTRAR USUÁRIO ROOT	
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