package model;

///* 
//* Exemplo de uma Classe DAO qie implementa a Interface Adapter
//* para executar comandos CRUD no SGBD Oracle
//* */

public class OracleCommands implements DbAdapter {

	@Override
	public String insert() {
		return "Método INSERT enviado com sucesso para o SGBD oracle";
	}

	@Override
	public String update() {
		return "Método UPDATE enviado com sucesso para o SGBD oracle";
	}

	@Override
	public String delete() {
		return "Método DELETE enviado com sucesso para o SGBD oracle";
	}

}
