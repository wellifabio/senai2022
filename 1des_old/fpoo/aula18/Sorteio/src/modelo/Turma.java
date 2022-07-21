package modelo;

import java.util.Iterator;
import java.util.Scanner;

public class Turma {
	
	private String[] alunos;
	private Scanner scan = new Scanner(System.in);
	
	public void preencherVetor(int qtdade) {
		alunos = new String[qtdade];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = scan.nextLine();
		}
	}
	
	public void listarTodos() {
		for (String a : alunos) {
			System.out.println(a);
		}
	}
}
