package client;

import java.util.Scanner;

import process.ContaCorrenteFacade;

/*
 * Facade ou Fachada
 * Serve para criar uma interface simplificada que roda outras a��es por tr�s.
 * Exemplo:
 * Para sacar R$ 50,00 do Banco, seria necess�rio:
 * Validar o n�mero da conta
 * Validar a senha
 * Validar se tem saldo na conta
 * Realizar a altera��o do saldo da conta
 * https://www.youtube.com/watch?v=B1Y8fcYrz5o
 * */

public class CaixaEletronico {

	public static ContaCorrenteFacade cc;
	public static int menu;
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		menu = 0;
		System.out.print("Digite o n�mero da conta e a senha:");
		cc = new ContaCorrenteFacade(leia.nextInt(),leia.nextInt());
				
		while (menu != 3) {
			System.out.print("\n\n1.Depositar\n2.Sacar\n3.sair\nDigite uma op��o:");
			switch (menu = leia.nextInt()) {
			case 1:
				System.out.print("Digite o valor do dep�sito:");
				cc.depositar(leia.nextDouble());
				break;
			case 2:
				System.out.print("Digite o valor do saque:");
				cc.sacar(leia.nextDouble());
				break;
			case 3:
				System.out.println("Valews, Falows.");
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
	}

}
