package visao;

import java.util.Scanner;

import modelo.Turma;

public class Sorteio {

	private static Scanner scan = new Scanner(System.in);
	private static Turma turma = new Turma();

	public static void main(String[] args) {
		System.out.print("Digite quantos nomes deseja embaralhar," + "pressione <Enter> e em seguida digite"
				+ "os nomes também separando-os por linha:");
		turma.preencherVetor(scan.nextInt());
		turma.embaralhar();
		turma.listarTodosEmbaralhados();
		System.out.println("Digite quantos integrantes cada grupo deve ter");
		turma.separarGrupos(scan.nextInt());
	}

}
