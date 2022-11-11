package exercicio4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static Candidato[] candidatos = { 
			new Candidato(13, "Lula"), 
			new Candidato(22, "Bolsonaro"),
			new Candidato(0, "Branco")
			};
	static BufferedWriter bw;
	static int menu = 0;

	public static Candidato buscaCandidato(int numero) {
		Candidato candidato = new Candidato(numero, "Nulo");
		for (Candidato c : candidatos) {
			if (c.getNumero() == numero) {
				candidato = c;
			}
		}
		return candidato;
	}

	public static void main(String[] args) {
		Candidato voto = new Candidato();
		
		while (menu != 1) {
			System.out.print("Digite o número do candidato ou 0 para Branco: ");
			voto = buscaCandidato(scan.nextInt());
			System.out.println(voto);
			System.out.println("1.Confirma, 0.Não confirma");
			menu = scan.nextInt();
		}
		
		try {
			bw = new BufferedWriter(new FileWriter("./bd/eleicao.csv", true));
			bw.write(voto.toString());
			bw.close();
			System.out.println("Voto registrado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
