package visoes;

/*
 * Exemplo do Design Pattern de Comportamento Command
 * Em um sistema para ligar ou desligar um Componente Qualquer
 * Por: https://www.youtube.com/watch?v=Wis6pXZ-xxw
 * 
 * Criado na estrutura MVC
 * 
 * */

import java.util.Scanner;

import controles.ControleRemoto;
import modelos.CaixaDeSom;
import modelos.CaixaDesligarCommand;
import modelos.CaixaLigarCommand;
import modelos.TV;
import modelos.TVDesligarCommand;
import modelos.TVLigarCommand;

public class Usuario {

	public static ControleRemoto controle;
	public static CaixaDeSom caixa;
	public static TV tv;


	public static void main(String[] args) {

		controle = new ControleRemoto();
		caixa = new CaixaDeSom();
		tv = new TV();
		
		try (Scanner scan = new Scanner(System.in)) {
			int menu = 0;

			while (menu != 5) {
				System.out.println("Caixa de Som status: "+caixa.status+" Status TV:"+tv.status);
				System.out.println("1. Ligar Caixa de Som");
				System.out.println("2. Desligar Caixa de Som");
				System.out.println("3. Ligar TV");
				System.out.println("4. Desligar TV");
				System.out.println("5. Sair TV");
				System.out.print("Digite uma opção:");
				menu = scan.nextInt();
				switch (menu) {
				case 1:
					controle.setCommand(new CaixaLigarCommand(caixa));
					break;
				case 2:
					controle.setCommand(new CaixaDesligarCommand(caixa));
					break;
				case 3:
					controle.setCommand(new TVLigarCommand(tv));
					break;
				case 4:
					controle.setCommand(new TVDesligarCommand(tv));
					break;
				case 5:
					System.out.println("Valews falows");
					break;
				default:
					System.out.println("Opção inválida");
				}
				System.out.println("\n\n**********************");
				controle.pressionarBotao();
				System.out.println("**********************\n\n");
			}
		}

	}

}
