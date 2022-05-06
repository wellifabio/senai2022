package visao.testes;

import java.util.Scanner;

import controle.UsuarioProcessa;
import modelo.Usuario;

public class TesteConsole {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		UsuarioProcessa.carregar();
		for (Usuario u : UsuarioProcessa.usuarios) {
			System.out.println(u.toString());
		}
		System.out.print("Digite o email:");
		int indice = UsuarioProcessa.checarEmail(scan.next());
		if (indice != -1) {
			System.out.print("Digite a senha:");
			if (UsuarioProcessa.checarSenha(indice, scan.next())) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Acesso negado");
			}
		} else {
			System.out.println("Usuário não encontrado");
		}
	}

	// Método para criptografar a senha somando ou subtraindo
	// os dois primeiros digitos aos demais
	public String criptoManual(String senha) {
		// Cria um vetor de caracteres para manipular a String
		char charArray[] = new char[senha.length()];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = senha.charAt(i); // Passa cada caracter da string para o vetor
			// Se a soma caracter + primeiro dígito for menor do que
			// o tamanho tabela ASCII (256) soma, senão subtrai
			if (charArray[i] + charArray[0] < 255) {
				charArray[i] += charArray[0];
			} else {
				charArray[i] -= charArray[0];
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			// Se a soma caracter + segundo dígito for menor do que
			// o tamanho tabela ASCII (256) soma, senão subtrai
			if (charArray[i] + charArray[1] < 255) {
				charArray[i] += charArray[1];
			} else {
				charArray[i] -= charArray[1];
			}
		}
		// Retorna o vetor de caracteres para a string
		senha = new String(charArray);
		return senha;
	}
}
