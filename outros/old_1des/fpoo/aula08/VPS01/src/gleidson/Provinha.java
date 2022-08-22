package gleidson;

import java.util.Scanner;

public class Provinha {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = 0;
		while (menu != 5) {
			System.out.println("1- Horas Extras \n2-  Apuração \n3- Matérias Primas\n4- Blocos\n5- Sair");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				scan = new Scanner(System.in);
				String nome;
				int horas, HEX;
				double P, PE, salario1, salario2, total;
				System.out.println("Digite seu nome");
				nome = scan.next();
				System.out.println("Digite suas horas trabalhadas");
				horas = scan.nextInt();
				System.out.println("Digite suas horas extras");
				HEX = scan.nextInt();
				P = 5.625;
				PE = 9.843;
				salario1 = horas * P;
				salario2 = HEX * PE;
				total = salario1 + salario2;
				System.out.println("Funcionario:" + nome);
				System.out.println("seu salario sem horas extras:" + "\nR$" + salario1);
				System.out.println("Valor a receber pelas horas extras" + "\nR$" + salario2);
				System.out.println("O valor toral do seu salario é:" + "\nR$" + total);
				break;
			case 2:
				String nome1, nome2, nome3, nome4, nome5;
				int media1, media2, media3, media4, media5;
				int b1, s1, f1, b2, s2, f2, b3, s3, f3, b4, s4, f4, b5, s5, f5;
				int nota1, nota2, nota3, nota4, nota5;
				System.out.println("Digite o nome das esolcas");
				nome1 = scan.next();
				nome2 = scan.next();
				nome3 = scan.next();
				nome4 = scan.next();
				nome5 = scan.next();
				System.out.println("Digite as notas da 1º escola:\n" + nome1);
				b1 = scan.nextInt();
				s1 = scan.nextInt();
				f1 = scan.nextInt();

				System.out.println("Digite as notas da 2º escola:\n" + nome2);
				b2 = scan.nextInt();
				s2 = scan.nextInt();
				f2 = scan.nextInt();
				System.out.println("Digite as notas da 3º escola:\n" + nome3);
				b3 = scan.nextInt();
				s3 = scan.nextInt();
				f3 = scan.nextInt();
				System.out.println("Digite as notas da 4º escola:\n" + nome4);
				b4 = scan.nextInt();
				s4 = scan.nextInt();
				f4 = scan.nextInt();
				System.out.println("Digite as notas da 5º escola:\n" + nome5);
				b5 = scan.nextInt();
				s5 = scan.nextInt();
				f5 = scan.nextInt();
				nota1 = b1 + s1 + f1;
				media1 = nota1 / 3;
				nota2 = b2 + s2 + f2;
				media2 = nota2 / 3;
				nota3 = b3 + s3 + f3;
				media3 = nota3 / 3;
				nota4 = b4 + s4 + f4;
				media4 = nota4 / 3;
				nota5 = b5 + s5 + f5;
				media5 = nota5 / 3;
				System.out.println("Media da escola:\n" + nome1 + ":" + media1);
				System.out.println("\nMedia da escola:\n" + nome2 + ":" + media2);
				System.out.println("\nMedia da escola:\n" + nome3 + ":" + media3);
				System.out.println("\nMedia da escola:\n" + nome4 + ":" + media4);
				System.out.println("\nMedia da escola:\n" + nome5 + ":" + media5);
				break;
			case 3:
				scan = new Scanner(System.in);
				int kg, kg2, kg3, estimativa;
				double valor1, valor2, valor3;
				double gasto, gasto2, gasto3, total2;
				System.out.println("Digite a quantidade em kg de lantejola, em seguida o valor do kg");
				kg = scan.nextInt();
				valor1 = scan.nextDouble();
				System.out.println(
						"Digite a quantidade em quilos da Penas de Avestruz do Himalaia,em seguida o valor do kg");
				kg2 = scan.nextInt();
				valor2 = scan.nextDouble();
				System.out.println("Digite a quantidade em quilos do tecido de seda Húngara,em seguida o valor do kg");
				kg3 = scan.nextInt();
				valor3 = scan.nextDouble();
				System.out.println("Digite a estimativa de gastos");
				estimativa = scan.nextInt();
				gasto = kg * valor1;
				gasto2 = kg2 * valor2;
				gasto3 = kg3 * valor3;
				total2 = gasto + gasto2 + gasto3;
				System.out.println("Os gastos são:" + "\nR$" + gasto + "\nR$" + gasto2 + "\nR$" + gasto3
						+ "\ntotal de gastos:" + "\nR$" + total2);
				if (total2 > estimativa)
					System.out.println("Você ultrapassou sua estimativa de gastos ");
				if (total2 < estimativa)
					System.out.println("Você manteve sua estimativa de gastos");

				break;
			case 4:
				scan = new Scanner(System.in);
				int pessoas, Comissaodefrente, Abrealas, Aladasbaianas, Carrosalegoricos, MestresalaePortabandeira,
						Bateria;
				int Madrinhadebateria, Recuodabateria;
				int n1, n2, n3, n4, n5, n6, n7, n8;

				System.out.println("Digite o número de pessoas participantes do desfile");
				pessoas = scan.nextInt();

				Comissaodefrente = (int) (pessoas * 0.15);
				n1 = Comissaodefrente;
				Abrealas = (int) (pessoas * 0.05);
				n2 = Abrealas;
				Aladasbaianas = (int) (pessoas * 0.15);
				n3 = Aladasbaianas;
				Carrosalegoricos = (int) (pessoas * 0.20);
				n4 = Carrosalegoricos;
				MestresalaePortabandeira = (int) (pessoas * 0.03);
				n5 = MestresalaePortabandeira;
				Bateria = (int) (pessoas * 0.20);
				n6 = Bateria;
				Madrinhadebateria = (int) (pessoas * 0.02);
				n7 = Madrinhadebateria;
				Recuodabateria = (int) (pessoas * 0.02);
				n8 = Recuodabateria;
				System.out.println("\nTotal pessoas na Comissão de frente :\n" + n1);
				System.out.println("\nTotal de pessoas no Ala das baianas:\n" + n2);
				System.out.println("\nTotal de pessoas no Abre-alas:\n" + n3);
				System.out.println("\nTotal de pessoas no Mestres-ala e Porta bandeira:\n" + n4);
				System.out.println("\nTotal de pessoas no Madrinha de bateria:\n" + n5);
				System.out.println("\nTotal de pessoas na Bateria:\n" + n6);
				System.out.println("\nTotal de pessoas na Madrinha de bateria:\n" + n7);
				System.out.println("\nTotal de pessoas no Recuo das baterias:\n" + n8);
				break;
			case 5:
				System.out.println("Bye,Bye.");
				break;
			default:
				System.out.println("está opção é incorreta");
			}
		}
	}
}