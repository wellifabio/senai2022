package controle;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioProcessa {

	public static ArrayList<Usuario> usuarios = new ArrayList<>();
	private static UsuarioDAO ud = new UsuarioDAO();

	public static void carregar() {
		usuarios = ud.abrir();
	}

	public static int checarEmail(String email) {
		int retorno = -1;
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getEmail().equals(email)) {
				return i;
			}
		}
		return retorno;
	}

	public static boolean checarSenha(int indice, String senha) {
		if (usuarios.get(indice).getSenha().equals(senha)) {
			return true;
		}
		return false;
	}
}
