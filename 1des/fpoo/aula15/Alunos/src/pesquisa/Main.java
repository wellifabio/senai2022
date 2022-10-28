package pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Pessoa> pessoas = new ArrayList<>();
	static int fasesDaVidaCont[] = { 0, 0, 0, 0 };
	static float mediaIdade = 0;
	static float fasesDaVidaMedia[] = { 0, 0, 0, 0 };

	public static void main(String[] args) {
		System.out.println("Digite quantas pessoas estão interessadas:");
		int n = scan.nextInt();
		System.out.println("Digite ou copie e cole a lista com:");
		System.out.println("nome, sobrenome e idade:");
		for (int i = 0; i < n; i++) {
			lePessoa();
			fasesDaVidaCont[pessoas.get(i).faseDaVida()]++;
			fasesDaVidaMedia[pessoas.get(i).faseDaVida()] += pessoas.get(i).idade;
			mediaIdade += pessoas.get(i).idade;
		}
		mediaIdade /= n;
		listar();
	}

	public static void lePessoa() {
		pessoas.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
	}

	public static void listar() {
		Pessoa pessoa = new Pessoa();
		System.out.println("Nome\tSobrenome\tIdade\tFase da vida");
		for (Pessoa p : pessoas)
			System.out.println(p.toString());
		System.out.println("\nEstatísticas:");
		System.out.println("Fase da vida\tQuantos\tMedia Idade");
		for (int i = 0; i < 4; i++) {
			float media = fasesDaVidaMedia[i] / fasesDaVidaCont[i];
			System.out.printf("%s\t%d\t%.1f\n", pessoa.faseVetor[i], fasesDaVidaCont[i], media);
		}
		System.out.printf("Media de idade total = %.1f", mediaIdade);
	}

}
