package exercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner  scan = new Scanner(System.in);
	static IRRF irrf;
	
	public static void main(String[] args) {
		System.out.println("Digite o nome e o salário");
		irrf = new IRRF(scan.next(),scan.nextDouble());
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./bd/irrf.csv", true));
			bw.write(irrf.toCSV());
			bw.close();
			System.out.println(irrf);
			System.out.println("Dados gravados com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
