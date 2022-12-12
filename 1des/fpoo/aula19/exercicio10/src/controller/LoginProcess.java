package controller;

import dao.LoginDAO;
import modelo.Login;

public class LoginProcess {
	
	private LoginDAO ld = new LoginDAO();
	
	public boolean sucesso(Login login) {
		boolean encontrado = false;
		for(Login l: ld.abrir()) {
			if(l.getNome().equals(login.getNome()) && l.getSenha().equals(login.getSenha()))
				encontrado = true;
		}
		return encontrado;
	}
}
