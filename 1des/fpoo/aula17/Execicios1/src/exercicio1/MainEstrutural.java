package exercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEstrutural {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		double salario;
		System.out.println("Digite seu nome e seu salário");
		nome = scan.next();
		salario = scan.nextDouble();
		double fgts = salario * 8 / 100f;
		String saida = String.format("%s;%.2f;%.2f\r\n", nome, salario, fgts);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./bd/fgts.csv", true));
			bw.write(saida);
			bw.close();
			System.out.println("Dados gravados com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
