-- Alterar a senha dop root
-- No Shell antes de acessar o mysql digite o comando
mysqladmin.exe -u root password sua-nova-senha
-- Alterar a senha do PhpMyAdmin, acesse o arquivo abaixo
C:\xampp\phpMyAdmin\config.inc.php
-- altere a senha no campo password
$cfg['Servers'][$i]['password'] = '1234';


-- Para voltar sem senha, dentro do Mysql pelo shell digite o comando
SET PASSWORD FOR root@localhost=PASSWORD('');
-- Alterar a senha novamente no PhpMyAdmin