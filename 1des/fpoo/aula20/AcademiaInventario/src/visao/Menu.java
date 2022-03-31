package visao;

import java.text.ParseException;
import java.util.Scanner;

import modelo.Aparelho;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static Aparelho aparelhos[] = new Aparelho[10];
	private static int quantos = 0;

	public static void main(String[] args) throws ParseException {

		int menu = 0;
		while (menu != 3) {
			System.out.println("1.Cadastrar\n2.Listar\n3.Sair");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrar();
				break;
			case 2:
				listar();
				break;
			case 3:
				System.out.println("Tchaw!");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	private static void cadastrar() throws ParseException {
		System.out.println("Nome Aparelho\tTipo Exercício\tGrupo Muscular\tData Compra\tValor Aquisição:");
		aparelhos[quantos] = new Aparelho(scan.next(),scan.next(),scan.next(),scan.next(),scan.nextDouble());
		System.out.println("Digite o tempo de depreciação:");
		aparelhos[quantos].setTempoDepreciacao(scan.nextInt());
		quantos++; //Acumulador
	}
	
	private static void listar() {
		System.out.println("Nome Aparelho\tTipo Exercício\tGrupo Muscular\tData Compra\tValor Aquisição\tTempo de Uso\tDepreciação\tValor Depreciado:");
		for (int i = 0; i < quantos; i++) {
			System.out.println(aparelhos[i].toString());
		}
	}

}
