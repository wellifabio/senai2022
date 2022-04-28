package controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDAO {
	
	private BufferedReader br;
	private String path = "C:\\Users\\Professor\\Desktop\\work\\Login\\dados\\usuarios.csv";

	public ArrayList<Usuario> abrir() {
		ArrayList<Usuario> linhas = new ArrayList<>();
		Usuario usuario;
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while(linha != null) {
				usuario = new Usuario(linha);
				linhas.add(usuario);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return linhas;
	}
}
