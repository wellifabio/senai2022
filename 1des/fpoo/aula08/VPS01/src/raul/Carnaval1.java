package raul;

import java.io.IOException;
import java.util.Scanner;

public class Carnaval1 {
	public static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {
			System.out.print("1- Horas extras\n 2- Apuração\n 3- Matéria prima\n 4- Organização\n 5- Sair");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				Horasextras();
				break;
			case 2:
				Apuração();
				break;
			case 3:
				//Matériaprima();
				break;
			case 4:
				Organização();
				break;
			case 5:
				System.out.println("Tchau.");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

	public static void Horasextras() {
		scan = new Scanner(System.in);
		System.out.println("informe as horas normais de trabalho:");
		int H1 = scan.nextInt();
		System.out.println("informe as horas extras de trabalho:");
		int H2 = scan.nextInt();
		double V1 = 5.625, V2 = 9.843, S;
		S = (H1 * V1 + H2 * V2);
		System.out.printf("O salário a ser pago é de: %.2f\n", S);
	}

	public static void Apuração() {
		scan = new Scanner(System.in);
		int t = 5;
		System.out.println("Digite os nomes das escolas: ");
		System.out.println("Digite uma nota de 0 a 10 para cada categoria: ");
		String[] nomes = new String[t];
		int N1, N2, N3;
		int[] apuracao = new int[t];
		for (int i = 0; i < t; i++) {
			System.out.println("Nome da " + (i + 1) + " escola:");
			nomes[1] = scan.next();
			System.out.println("Nota da bateria[" + (i + 1) + "]:");
			N1 = scan.nextInt();
			System.out.println("Nota de samba-enredo[" + (i + 1) + "]:");
			N2 = scan.nextInt();
			System.out.println("Nota de fantasia[" + (i + 1) + "]:");
			N3 = scan.nextInt();
			apuracao[i] = (N1 + N2 + N3) / 3;
		}
		for (int i = 0; i < t; i++) {
			System.out.println(+(i + 1) + " escola " + nomes[i] + " - apuração: " + apuracao[i]);
		}
	}

	/*
public static void Matériaprima() {
scan = new Scanner(System.in);
int Qt = 3;
String[] nomes = {"Seda Húngara","Lantejoula","Penas de Avestruz do Himalaia"};
double[] estimativa = new double[Qt];

for(int i = 0; i < Qt; i++) {
System.out.println("Kg de" + nomes[i]);
double K = scan.nextDouble();
System.out.println("digite o valor gasto: " + nomes[i]);
double V = scan.nextDouble();
double T = K * V;
for (int i = 0; i < Qt; i++) {
Object[] T;
System.out.printf("%s custa em torno de R$%.2f ", nomes[i], T[i]);
}
if(T[0]> T[1]&& T[2]);
System.out.println(T[0]);
}
}
	 */
	public static void Organização() {
		scan = new Scanner(System.in);
		System.out.println("Digite quantas pessoas estão participando: ");
		int P = scan.nextInt();
		double A = P * 0.15;
		double B = P * 0.05;
		double C = P * 0.15;
		double D = P * 0.20;
		double E = P * 0.03;
		double F = P * 0.20;
		double G = P * 0.02;
		double H = P * 0.20;
		System.out.println("O número de pessoas participando do bloco Comissão de frente é de: " + A);
		System.out.println("O número de pessoas participando do bloco Abre-Alas é de:" + B);
		System.out.println("O número de pessoas participando do bloco Ala das baianas é de:" + C);
		System.out.println("O número de pessoas participando do bloco Carros alegóricos é de:" + D);
		System.out.println("O número de pessoas participando do bloco Mestre-sala e Porta-bandeira é de:" + E);
		System.out.println("O número de pessoas participando do bloco Bateria é de:" + F);
		System.out.println("O número de pessoas participando do bloco Madrinha de bateria é de:" + G);
		System.out.println("O número de pessoas participando do bloco Recuo da bateria é de:" + H);
	}
}