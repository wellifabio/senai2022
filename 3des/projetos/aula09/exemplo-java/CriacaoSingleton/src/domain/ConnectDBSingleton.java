package domain;

public class ConnectDBSingleton {

	private static Object instance = null;
	private String dbName;
	
	//Construtor privado
	private ConnectDBSingleton() {
	}
	
	//Controle que garante que tenha uma única instância
	public static Object getInstance() {
		if(ConnectDBSingleton.instance == null) {
			ConnectDBSingleton.instance = new ConnectDBSingleton();
		}
		return ConnectDBSingleton.instance;
	}
	
	//Gets && Sets
	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	//Metodo para testar a conexão
	public String connection() {
		return "Estamos conectados ao BD: " + dbName;
	}

}
