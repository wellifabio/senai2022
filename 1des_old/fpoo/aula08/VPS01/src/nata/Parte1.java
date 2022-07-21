package nata;

import java.io.IOException;
import java.util.Scanner;

public class Parte1 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {

			System.out.println("Digite uma opção");
			System.out.println("1-Salario \2-Academia Campeã \3-Gastos da escola");
			System.out.println("4-Pessoas desfile \5-Sair");
			menu = ler.nextInt();
			switch (menu) {
			case 1:
				double SLR, HRS, HREXT, SLRFNL;
				System.out.print("Coloque suas horas de trabalho feitas :");
				HRS = ler.nextDouble();
				System.out.print("Coloque seu tempo de hora extra:");
				HREXT = ler.nextDouble();
				SLRFNL = (HRS * 5.625) + (HREXT * 4.218);
				System.out.println("Sua remuneração será: " + SLRFNL);
				System.out.println("--------------------------------");
				System.out.println("VAMOS VER OUTRAS OPÇÕES :)");
				System.out.println("_________________________________");

			case 2:
				double BATERIA, SAMBAENREDO, FANTASIAS, MEDIA;

				break;

			case 3:
				break;

			case 4:
				int PESSOAS;
				double CDF, ALS, ADB, CA, MSP, B, MDB, RDB;
				System.out.println("Quantas pessoas irão ao desfile?:");
				PESSOAS = ler.nextInt();
				System.out.println("___________________________________________________");
				CDF = (PESSOAS * 15) / 100;
				ALS = (PESSOAS * 5) / 100;
				ADB = (PESSOAS * 15) / 100;
				CA = (PESSOAS * 20) / 100;
				MSP = (PESSOAS * 3) / 100;
				B = (PESSOAS * 20) / 100;
				MDB = (PESSOAS * 2) / 100;
				RDB = (PESSOAS * 20) / 100;

				System.out.println("Número de pessoas por equipe na tabela a baixo");
				System.out.println("--------------------------------------------------");
				System.out.println("Comissão de frente terá:" + CDF);
				System.out.println("Abre-Alas terá:" + ALS);
				System.out.println("Ala das baianas terá: " + ADB);
				System.out.println("Carros alegóricos terá:" + CA);
				System.out.println("Mestre-sala e Porta-bandeira terá: " + MSP);
				System.out.println("Bateria terá: " + B);
				System.out.println("Madrinha de bateria terá:" + MDB);
				System.out.println("Recuo da bateria terá: " + RDB);
				System.out.println("___________________________________________________");
				System.out.println("Bom desfile ;)");
				System.out.println("E boa sorte <3");
				System.out.println("______________");

				break;

			case 5:
				System.out.println("Missão cumprida, BOA SOLDADO(A)! ;)");
				break;
			default:
				System.out.println("Opção não aceitavel, tente novamente :)");
				System.out.println("--------------------");
				break;
			}
		}
	}
}