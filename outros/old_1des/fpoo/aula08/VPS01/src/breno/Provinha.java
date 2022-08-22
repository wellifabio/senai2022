package breno;

import java.util.Scanner;

public class Provinha {
	public static void main(String[] args) {
		int menu = 0;
		while (menu != 5) {
			Scanner leia = new Scanner(System.in);
			System.out.println("1 Horas Extras, 2 Apuração, 3 Matérias Primas, 4 Blocos, 5 Sair");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Digite a quatidade de horas trabalhada: ");
				double ht = leia.nextDouble();
				System.out.println("Digite as suas horas extras: ");
				double he = leia.nextDouble();

				if (he != 0) {
					double sal1 = (5.625 * 75) / 100;
					he = he * sal1;
					double sal2 = ht * 5.625;
					double sal3 = sal2 + he;
					System.out.printf("Seu salario e de %.2f\n", sal3);
				} else {
					double sal2 = (ht * 5.625);
					System.out.printf("Seu salario e de %.2f\n", sal2);
				}
				break;
			case 2:
				System.out.println("Digite a quantidade de blocos:");
				int comprimento = leia.nextInt();
				String[] nome = new String[comprimento];
				int[] bateria = new int[comprimento];
				int[] samba = new int[comprimento];
				int[] fantasia = new int[comprimento];
				int[] soma = new int[comprimento];
				int[] media = new int[comprimento];
				String nomef = "none";
				int mediaf = 0;

				for (int i = 0; i < comprimento; i++) {
					System.out.print("Nome da escola[" + i + "]: ");
					nome[i] = leia.next();
					System.out.print("Pontos em bateria[" + i + "]: ");
					bateria[i] = leia.nextInt();
					System.out.print("Pontos em samba enredo[" + i + "]: ");
					samba[i] = leia.nextInt();
					System.out.print("Pontos em fantasia[" + i + "]: ");
					fantasia[i] = leia.nextInt();
				}
				for (int i = 0; i < comprimento; i++) {

					soma[i] = bateria[i] + samba[i] + fantasia[i];
					media[i] = soma[i] / 3;
					if (media[i] > mediaf) {
						mediaf = media[i];
						nomef = nome[i];
					}
				}
				System.out.println("O vencedor e: " + nomef + " com a media de: " + mediaf);
				break;
			case 3:

				break;
			case 4:
				System.out.println("quantas pessoas irão participar do desfile?:");
				int pessoas = leia.nextInt();
				float cf = (pessoas * 15) / 100;
				float aa = (pessoas * 5) / 100;
				float ab = (pessoas * 15) / 100;
				float ca = (pessoas * 20) / 100;
				float pb = (pessoas * 3) / 100;
				float b = (pessoas * 20) / 100;
				float mb = (pessoas * 2) / 100;
				float rb = (pessoas * 20) / 100;
				System.out.print("irá precisar de " + cf + " pessoas na comissão de frente\n\n" + aa
						+ " pessoas na Abre alas\n\n" + ab + " pessoas na ala das baianas\n\n" + ca
						+ " pessoas nos Carros alegóricos\n\n" + pb + " pessoas no Mestre sala e na porta bandeira\n\n"
						+ b + " pessoas na bateria\n\n" + mb + " pessoas na madrinha de bateria\n\n" + rb
						+ " pessoas no recuo de bateria\n\n");
				break;
			case 5:
				System.out.println("Muito Obrigado por usar nossos sistemas!");
				break;
			default:
				System.out.println("Tente novamente!");
				break;
			}
		}
	}
}