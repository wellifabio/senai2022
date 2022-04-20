package model;

///* 
// * Exemplo de uma Interface que possui métodos
// * para executar comandos CRUD em qualquer SGBD
// * */

public interface DbAdapter {

	public String insert();

	public String update();

	public String delete();

}
