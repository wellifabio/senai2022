package andreina;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 5) {
			System.out.print("1-Horas Extras\t3-Matérias Primas\n");
			System.out.print("2-Apuração\t4-Blocos\n");
			System.out.print("5-Sair\nEscolha: ");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
//horas extras
				System.out.println("Digite o total de horas trabalhadas: ");
				double horat = entrada.nextDouble();
				System.out.println("Digite o total de horas extras trabalhadas: ");
				double horaExtra = entrada.nextDouble();
				double valor = 5.625;
				double extra = 4.21875;
				double valorExtra = valor + extra;
				double salario = (horat * valor) + (horaExtra * extra);

				System.out.println("O salário total é de " + salario);

				break;
			case 2:
//apuração
				int t = 5;
				System.out.println("Digite os nomes das escolas");
				System.out.println("Digite uma nota de 0 a 10 para cada categoria");
				String[] nomes = new String[t];
				int n1;
				int n2;
				int n3;
				int[] apuracao = new int[t];
				for (int i = 0; i < t; i++) {
					System.out.print("Nome da " + (i + 1) + "° escola: ");
					nomes[i] = entrada.next();
					System.out.print("Nota da bateria [" + (i + 1) + "]: ");
					n1 = entrada.nextInt();
					System.out.print("Nota samba-enredo [" + (i + 1) + "]: ");
					n2 = entrada.nextInt();
					System.out.print("Nota fantasia [" + (i + 1) + "]: ");
					n3 = entrada.nextInt();
					apuracao[i] = (n1 + n2 + n3) / 3;
				}
				for (int i = 0; i < t; i++) {
					System.out.println(+(i + 1) + "° escola " + nomes[i] + " - apuração: " + apuracao[i]);
				}
				break;
			case 3:
//Materias prima
				String[] mp = { "Lantejoulas", "Penas de Avestruz do Himalaia", "Tecido de seda Húngara" };
				int[] valor1 = new int[3];
				for (int i = 0; i < 3; i++) {
					System.out.print("Digite a quantidade utilizada em quilos de " + mp[i] + ": ");
					int peso = entrada.nextInt();
					System.out.print("Digite o valor de " + mp[i] + ": ");
					int preco = entrada.nextInt();

					valor1[i] = peso * preco;
				}

				for (int i = 0; i < 3; i++) {
					System.out.println(mp[i] + " custa R$" + valor1[i]);
				}
				break;
			case 4:
//Blocos
				System.out.print("Digite o total de pessoas no bloco: ");
				int pessoas = entrada.nextInt();
				System.out.println("Pessoas na comissão da frente: " + (pessoas * 0.15));
				System.out.println("Pessoas na abre-alas: " + (pessoas * 0.05));
				System.out.println("Pessoas na ala das baianas: " + (pessoas * 0.15));
				System.out.println("Pessoas na carros alegóricos: " + (pessoas * 0.20));
				System.out.println("Pessoas na mestre-sala: " + (pessoas * 0.03));
				System.out.println("Pessoas na porta-bandeira: " + (pessoas * 0.03));
				System.out.println("Pessoas na bateria: " + (pessoas * 0.20));
				System.out.println("Pessoas na madrinha de bateria: " + (pessoas * 0.02));
				System.out.println("Pessoas na recuo da bateria: " + (pessoas * 0.20));
				break;
			case 5:
//Sair
				System.out.println("Adeus");
				break;
			default:
				System.out.println("Opção Inválida");
				break;

			}
		}
	}
}
