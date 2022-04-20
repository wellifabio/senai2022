package model;

///* 
//* Exemplo de uma Classe DAO que não implementa
//* a Interface Adapter, pois possui métodos
//* com nomes diferentes.
//* Nomes específicos MySQL neste exemplo
//* */

public class MySQLCommands {
	
	public String insertMySQL() {
		return "Método INSERT enviado com sucesso para o SGBD MySQL";
	}

	public String updateMySQL() {
		return "Método INSERT enviado com sucesso para o SGBD MySQL";
	}

	public String deleteMySQL() {
		return "Método INSERT enviado com sucesso para o SGBD MySQL";
	}

}
