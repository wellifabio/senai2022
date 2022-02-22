package carloseduardo;

import java.io.IOException;
import java.util.Scanner;

public class CX {

	public static Scanner entrada;

	public static void main(String[] args) throws IOException {

		entrada = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {

			System.out
					.print("Escolha\n 1.Horas Extras\n 2.Apuração\n 3.Gastos Ecolares\n 4.Blocos\n 5.Sair\nEscolha:\n");
			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				double SLR, HRS, HREXT, SLRFNL;
				System.out.println("Horas de trabalho:");
				HRS = entrada.nextDouble();
				System.out.println("Hora extra:");
				HREXT = entrada.nextDouble();
				SLRFNL = (HRS * 5.625) + (HREXT * 4.218);
				System.out.println("Sua remuneração é:" + SLRFNL);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				int PESSOAS;
				double CDF, ALS, ADB, CA, MSP, B, MDB, RDB;
				System.out.println("Quantas pessoas vão ao desfile");
				PESSOAS = entrada.nextInt();
				System.out.println("------------------------------");
				CDF = (PESSOAS = 15) / 100;
				ALS = (PESSOAS = 5) / 100;
				ADB = (PESSOAS = 15) / 100;
				CA = (PESSOAS = 20) / 100;
				MSP = (PESSOAS = 3) / 100;
				B = (PESSOAS = 20) / 100;
				MDB = (PESSOAS = 2) / 100;
				RDB = (PESSOAS = 20) / 100;
				System.out.println("Comissão de frente terá:" + CDF);
				System.out.println("Abre alas terá:" + ALS);
				System.out.println("Mestre de ala e porta bandeira" + MSP);
				System.out.println("Carros alegoricos" + CA);
				System.out.println("Mestre de sala terá" + MSP);
				System.out.println("Bateria terá" + B);
				System.out.println("Madrinha de bateria terá" + MDB);
				System.out.println("Recuo de bateria terá" + RDB);

				System.out.println("Bom desfile");
				break;
			case 5:
				System.out.print("Tchau!");
				break;
			default:
				System.out.print("Pastel de frango");

			}
		}
	}
}