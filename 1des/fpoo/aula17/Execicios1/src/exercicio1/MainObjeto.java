package exercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainObjeto {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Digite o nome e o salário");
		FGTS f = new FGTS(s.next(),s.nextDouble());
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./bd/fgts.csv", true));
			bw.write(f.toCSV());
			bw.close();
			System.out.println(f.toString());
			System.out.println("Dados gravados com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
