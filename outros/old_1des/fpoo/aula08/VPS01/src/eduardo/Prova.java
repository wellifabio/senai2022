package eduardo;

import java.util.Scanner;
import java.io.IOException;

	public class Prova {

		public static void main(String[] args) throws IOException{

			Scanner leia = new Scanner(System.in);
			System.out.println("==== Organização do Carnaval do Rio de Jaqueiro - VERSION 1.0 ====");
			int menu = 0;
			System.out.println("Digite um dos números abaixo\n1- Horas Extras\n2- Apuração\n3- Matérias Primas\n4- Blocos\n5- Sair");
			menu = leia.nextInt();
			
			switch(menu) {
			
			case 1:
				int horasTrabalhadas, horasExtras;
				double valorHoras, valorExtras, resultadoHoras, resultadoExtras;
				System.out.println("==== CALCULADORA HORAS MENSAIS E HORAS EXTRAS ====");
				System.out.print("Digite a quantidade de horas que você trabalha por mês: ");
				horasTrabalhadas = leia.nextInt();
				
				System.out.print("Digite a quantidade de horas extras:");
				horasExtras = leia.nextInt();
				
				valorHoras = 5.625;
				resultadoHoras = horasTrabalhadas * 5.625;
				
				valorExtras = ((valorHoras * 0.75) + 5.625);
				resultadoExtras = valorExtras * horasExtras;
				
				System.out.println("\nCerto! Então:\n");
				System.out.printf("Valor a receber Horas: R$%.3f \n", resultadoHoras);
				System.out.printf("Valor a receber de Horas Extras: R$%.3f \n", resultadoExtras);
				System.out.printf("\nVALOR A RECEBER TOTAL: R$%.3f \n", (resultadoHoras + resultadoExtras));
				
				break;
				
			case 2:
				
				System.out.println("==== Apuração Escolas de Samba ====");
				int size = 6;
				
				String[] escolas = new String[size];
				int[] pontosBat = new int[size], pontosSam = new int[size], pontosFan = new int[size], media = new int[size];;
				
				for(int i = 1; i < size; i++) {
					System.out.println("Nome da " + i + "° escola: ");
					escolas[i] = leia.next();
					System.out.println("Pontos de Bateria (0 a 10): ");
					pontosBat[i] = leia.nextInt();
					System.out.println("Pontos de Samba-Enredo (0 a 10): ");
					pontosSam[i] = leia.nextInt();
					System.out.println("Pontos de Fantasias (0 a 10): ");
					pontosFan[i] = leia.nextInt();
					
				}
				for(int i = 1; i < size; i++) {
					media[i] = pontosBat[i] + pontosSam[i] + pontosFan[i] / 3; 
					}
				for(int i = 1; i < size; i++) {
					System.out.println("Escola " +escolas[i]+ " com média de pontos: "+media[i]);
				}
					if (media[1] > media[2] || media[1] > media[3] || media[1] > media[4] || media[1] > media[5]) {
						System.out.println("Escola " +escolas[1]+ " é a campeã");
					} else if (media[2] > media[1] || media[2] > media[3] || media[2] > media[4] || media[2] > media[5]) {
						System.out.println("Escola " +escolas[2]+ " é a campeã");
					} else if (media[3] > media[1] || media[3] > media[2] || media[3] > media[4] || media[3] > media[5]) {
						System.out.println("Escola " +escolas[3]+ " é a campeã");
					}else if (media[4] > media[1] || media[4] > media[2] || media[4] > media[3] || media[4] > media[5]) {
						System.out.println("Escola " +escolas[4]+ " é a campeã");
					}else if (media[5] > media[1] || media[5] > media[2] || media[5] > media[3] || media[5] > media[4]) {
						System.out.println("Escola " +escolas[5]+ " é a campeã");
					}else {
						System.out.println("Empate.");
					}
					
					
				break;
				
			case 3:
				System.out.println("==== Cálculo Matéria Prima ====");
				double pesoKg, valorEstimado, valorLan, valorPenas, valorSeda;
				
				System.out.println("Digite o peso em KG dos materiais: ");
				pesoKg = leia.nextFloat();
				System.out.println("Digite o valor estimado que gastará: ");
				valorEstimado = leia.nextFloat();
				System.out.println("Digite o valor das lantejoulas: ");
				valorLan = leia.nextFloat();
				System.out.println("Digite o valor das Penas de Avestruz do Himalaia: ");
				valorPenas = leia.nextDouble();
				System.out.println("Digite o valor da Seda Húngara");
				valorSeda = leia.nextDouble();
				
				double valorTotal = valorLan + valorPenas + valorSeda;
				System.out.printf("Total de R$%.2f\n", valorTotal);
				if(valorTotal>valorEstimado) {
					System.out.println("O valor passa do estimado.");
				} else {
					System.out.println("Está dentro do orçamento.");
				}
				
				
				break;
				
			case 4:
				int totalPessoas, comissaoFrente, abreAlas, alaBaianas, carrosAleg, mestreSala, portaBandeira, bateria, madrinhaBateria, recuoBateria;
				
				System.out.println("==== Cálculo Pessoas Desfile ====");
				System.out.println("Quantas pessoas no total farão parte do desfile? Digite o valor: ");
				totalPessoas = leia.nextInt();
				comissaoFrente = (totalPessoas * 15) / 100 ;
				abreAlas = (totalPessoas * 5) / 100;
				alaBaianas = (totalPessoas * 15) / 100;
				carrosAleg = (totalPessoas * 20) / 100;
				mestreSala = (totalPessoas * 3) / 100;
				portaBandeira = (totalPessoas * 3) / 100;
				bateria = (totalPessoas * 20) / 100;
				madrinhaBateria = (totalPessoas * 2) / 100;
				recuoBateria = (totalPessoas * 20) / 100;
				
				System.out.println("Quantidade de pessoas [Comissão da Frente]: " + comissaoFrente);
				System.out.println("Quantidade de pessoas [Abre-Alas]: " + abreAlas);
				System.out.println("Quantidade de pessoas [Ala das Baianas]: " + alaBaianas);
				System.out.println("Quantidade de pessoas [Carros Alegóricos]: " + carrosAleg);
				System.out.println("Quantidade de pessoas [Mestre-sala]: " + mestreSala);
				System.out.println("Quantidade de pessoas [Porta-Bandeira]: " + portaBandeira);
				System.out.println("Quantidade de pessoas [Bateria]: " + bateria);
				System.out.println("Quantidade de pessoas [Madrinha de Bateria]: " + madrinhaBateria);
				System.out.println("Quantidade de pessoas [Mestre-sala]: " + recuoBateria);
				
				break;
				
			case 5:
				System.out.println("Você saiu.");
				break;
				
				default:
					System.out.println("Opção Incorreta. Por favor, digite novamente.");
					break;
			}
			
		}

			
	}