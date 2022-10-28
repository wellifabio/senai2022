package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Turma> turmas = new ArrayList<>();
	static float totalRS = 0; 

	public static void main(String[] args) {
		System.out.println("Digite quantas turmas:");
		int n = scan.nextInt();
		System.out.println("nomeTurma\tperiodo\tDia Sem.\tNum. Alunos\t Hrs. Sem.\tMensalidade");
		for(int i = 0; i < n; i++) {
			turmas.add(new Turma(scan.next(),scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),scan.nextFloat()));
			totalRS+=turmas.get(i).faturamentoMensal();
		}
		System.out.println("nomeTurma\tperiodo\tDia Sem.\tNum. Alunos\t Hrs. Sem.\tMensalidade\tFat. mensal\tFat. hora");
		for(Turma t: turmas)
			System.out.println(t.toString());
		System.out.printf("Faturamento total R$%.2f",totalRS);
	}

}
