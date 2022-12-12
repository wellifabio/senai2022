package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelos.Login;

public class LoginDAO {
	
	BufferedReader br;
	String arquivo = "./bd/usuarios.csv";

	public ArrayList<Login> abrir() {
		ArrayList<Login> usuarios = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = br.readLine();
			while (linha != null) {
				usuarios.add(new Login(linha));
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showConfirmDialog(null, "Arquivo não encontrado");
		} catch (IOException e) {
			JOptionPane.showConfirmDialog(null, "Erro ao ler o arquivo");
		}
		return usuarios;
	}
}
