package client;

import javax.swing.JOptionPane;

import domain.ConnectDBSingleton;

///* 
//* Exemplo de uma Cliente que implementa os
//* https://www.youtube.com/watch?v=IXgE3jmwdk0
//* */

public class MainClass {

	//Instancia dois objetos db1 e db2 da mesma classe sem iniciálos
	private static ConnectDBSingleton con1;
	private static ConnectDBSingleton con2;

	public static void main(String[] args) {
			
		//inicia o primeiro objeto
		con1 = (ConnectDBSingleton) ConnectDBSingleton.getInstance();
		con1.setDbName("Produto"); //Configura o nome do banco no objeto 1
		JOptionPane.showMessageDialog(null, con1.connection());//Mostra o nome do BD
		con1.setDbName("Pedido"); //Muda o nome do banco no objeto 1
		//Inicia o segundo objeto
		con2 = (ConnectDBSingleton) ConnectDBSingleton.getInstance();
		JOptionPane.showMessageDialog(null, con2.connection());//Mostra o nome do BD
		//Nota-se que o nome do BD é o que foi alterado no objeto 1 porém também está alterado no Objeto 2
		
	}

}
