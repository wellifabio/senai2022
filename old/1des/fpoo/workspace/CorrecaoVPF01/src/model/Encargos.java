package model;

import java.io.IOException;
import java.util.Scanner;

public class Encargos {

	public static Scanner scan;
	public static String nome;
	public static double salario;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		double inssPorcento, inssDesconto, salMenosINSS;
		double irrfPorcento, irrfDeduzir, irrfDesconto;
		double fgtsPorcento = 8, fgtsDepositar;

		System.out.println("-------------------------------------------------");
		System.out.println("       Cálculos de encargos sobre salário        ");
		System.out.println("-------------------------------------------------");
		System.out.print("Digite o nome completo do funcionário: ");
		nome = scan.nextLine();
		System.out.print("Digite o salário base para cálculo: ");
		salario = scan.nextDouble();
		int menu = 0;
		while (menu != 4) {
			System.out.println("\n-----------------");
			System.out.print("1 INSS\n2 IRRF\n3 FGTS\n4Sair\nDigite sua opção:");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				if (salario > 7087.22) {
					inssPorcento = 0f; //Teto
				} else if (salario > 3641.03) {
					inssPorcento = 14f;
				} else if (salario > 2427.35) {
					inssPorcento = 12f;
				} else if (salario > 1212.01) {
					inssPorcento = 9f;
				} else {
					inssPorcento = 7.5f;
				}
				
				if (inssPorcento == 0f)
					inssDesconto = 992.21;
				else
					inssDesconto = salario * inssPorcento / 100;
				System.out.println("\n-----------------");
				System.out.println("Funcionário: " + nome);
				System.out.printf("Alíquita de INSS: %.2f%%\n", inssPorcento);
				System.out.printf("Desconto de INSS: R$%.2f\n", inssDesconto);
				System.out.println("-----------------\n");				
				break;
			case 2:
				if (salario > 7087.22) {
					inssPorcento = 0f; //Teto
				} else if (salario > 3641.03) {
					inssPorcento = 14f;
				} else if (salario > 2427.35) {
					inssPorcento = 12f;
				} else if (salario > 1212.01) {
					inssPorcento = 9f;
				} else {
					inssPorcento = 7.5f;
				}
				
				if (inssPorcento == 0f)
					inssDesconto = 992.21;
				else
					inssDesconto = salario * inssPorcento / 100;
				
				salMenosINSS = salario - inssDesconto;
				
				if(salMenosINSS < 1903.99) {
					irrfPorcento = 0f;
					irrfDeduzir = 0f;
				}else if(salMenosINSS <  2826.66) {
					irrfPorcento = 7.5f;
					irrfDeduzir = 142.80f;
				}else if(salMenosINSS <  3751.06) {
					irrfPorcento = 15f;
					irrfDeduzir = 354.80f;
				}else if(salMenosINSS <  4664.68) {
					irrfPorcento = 22.5f;
					irrfDeduzir = 636.13f;
				}else {
					irrfPorcento = 27.5f;
					irrfDeduzir = 869.36f;
				}
				irrfDesconto = salMenosINSS * irrfPorcento / 100 - irrfDeduzir;
				System.out.println("\n-----------------");
				System.out.println("Funcionário: " + nome);
				System.out.printf("Alíquita de IRRF: %.2f%%\n", irrfPorcento);
				System.out.printf("Desconto de IRRF: R$%.2f\n", irrfDesconto);
				System.out.println("-----------------\n");					
				break;
			case 3:
				fgtsDepositar = salario * fgtsPorcento / 100;
				System.out.println("\n-----------------");
				System.out.println("Funcionário: " + nome);
				System.out.printf("Alíquita de FGTS: %.2f%%\n", fgtsPorcento);
				System.out.printf("Depositar de FGTS: R$%.2f\n", fgtsDepositar);
				System.out.println("-----------------\n");	
				break;
			case 4:
				System.out.println("Fim do programa.");
				break;
			default:
				break;
			}
		}
		
		if (salario > 7087.22) {
			inssPorcento = 0f; //Teto
		} else if (salario > 3641.03) {
			inssPorcento = 14f;
		} else if (salario > 2427.35) {
			inssPorcento = 12f;
		} else if (salario > 1212.01) {
			inssPorcento = 9f;
		} else {
			inssPorcento = 7.5f;
		}
		
		if (inssPorcento == 0f)
			inssDesconto = 992.21;
		else
			inssDesconto = salario * inssPorcento / 100;
		
		salMenosINSS = salario - inssDesconto;
		
		if(salMenosINSS < 1903.99) {
			irrfPorcento = 0f;
			irrfDeduzir = 0f;
		}else if(salMenosINSS <  2826.66) {
			irrfPorcento = 7.5f;
			irrfDeduzir = 142.80f;
		}else if(salMenosINSS <  3751.06) {
			irrfPorcento = 15f;
			irrfDeduzir = 354.80f;
		}else if(salMenosINSS <  4664.68) {
			irrfPorcento = 22.5f;
			irrfDeduzir = 636.13f;
		}else {
			irrfPorcento = 27.5f;
			irrfDeduzir = 869.36f;
		}
		irrfDesconto = salMenosINSS * irrfPorcento / 100 - irrfDeduzir;
		fgtsDepositar = salario * fgtsPorcento / 100;	
		double salLiquido = salMenosINSS - irrfDesconto;
		
		System.out.println("\n-------------------------------------------------");
		System.out.println("                 Relatório final                 ");
		System.out.println("-------------------------------------------------");
		System.out.println("Funcionário: " + nome);
		System.out.printf("Salário base: %.2f\n", salario);
		System.out.printf("Alíquita de INSS: %.2f%%\n", inssPorcento);
		System.out.printf("Desconto de INSS: R$%.2f\n", inssDesconto);
		System.out.printf("Salário - INSS: %.2f\n", salMenosINSS);
		System.out.printf("Alíquita de IRRF: %.2f%%\n", irrfPorcento);
		System.out.printf("Desconto de IRRF: R$%.2f\n", irrfDesconto);
		System.out.printf("Depositar de FGTS: R$%.2f\n", fgtsDepositar);
		System.out.printf("Salário Líquido: R$%.2f\n", salLiquido);
		System.out.println("-------------------------------------------------\n");

	}

}
