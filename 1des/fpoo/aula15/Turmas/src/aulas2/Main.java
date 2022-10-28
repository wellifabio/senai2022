package aulas2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Turma> turmas = new ArrayList<>();
	static float totalRS = 0;
	static String cabecalho = "nomeTurma\tperiodo\tDia Sem.\tNum. Alunos\t Hrs. Sem.\tMensalidade"; 
	static String resultado = "\tFat. mensal\tFat. hora";
	
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de turmas:");
		int n = scan.nextInt();
		System.out.println(cabecalho);
		for(int i = 0; i < n; i++) {
			turmas.add(new Turma());
			totalRS+=turmas.get(i).faturamentoMensal();
		}
		System.out.println(cabecalho+resultado);
		for(Turma t: turmas)
			System.out.println(t.toString());
		System.out.printf("Faturamento total R$%.2f",totalRS);
	}

}
