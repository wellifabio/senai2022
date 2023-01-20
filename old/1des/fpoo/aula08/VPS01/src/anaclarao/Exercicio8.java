package anaclarao;

import java.util.Scanner;

public class Exercicio8 {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int opcao = 0;
		while (opcao !=5) {
		System.out.println("Digite uma opção: ");
		System.out.println("1 - Horas Extras\n2 - Apuração\n3 - Matérias Primas\n4 - Blocos\n5 - Sair");		
		opcao = entrada.nextInt();
		switch (opcao) {
		
		case 1:
			HorasExtras();
			break;
		case 2:
			Apuração();
			break;
		case 3:
			MateriasPrimas();
			break;
		case 4:
			Blocos();
			break;
		case 5:
			System.out.print("Obrigado!");
			break;
		default: 
			System.out.println("Opção Inválida");
			break;
		
			}// fechamento do switch
		}// fechamento do while
	} // fechamento do main
	
	
	public static void HorasExtras() {
		entrada = new Scanner(System.in);
		double salario, horasTrab, horasExtra;
		double valorExtra = 9.84375;
		
		System.out.println("Digite as horas trabalhadas no mês: ");
		horasTrab = entrada.nextDouble();
		System.out.println("Digite as horas extras trabalhadas no mês: ");
		horasExtra = entrada.nextDouble();
		
		salario = (horasTrab * 5.625) + (horasExtra * valorExtra);
		System.out.printf("O valor do salário é: %.2f \n",salario );
	}
	
	
	public static void Apuração() {
		entrada = new Scanner(System.in);
		int escola = 0;
		double media1 = 0, media2 = 0, media3 = 0, media4 = 0, media5 = 0;
		while (escola !=6) {
		System.out.println("Escolha a escola de samba para marcar os pontos obtidos: ");
		System.out.println("1 - Araras\n2 - Jaguatirica\n3 - Sumaré \n4 - Piracicaba\n5 - Piracanjuba\n6 - Resultado/Sair ");
		escola = entrada.nextInt();
		switch (escola) {
		
		
		case 1:
			double a,b,c;
			System.out.println("Digite a nota para bateria de 0 a 10: ");
			a = entrada.nextInt();
			
			System.out.println("Digite a nota para samba-enredo de 0 a 10: ");
			b = entrada.nextInt();
			
			System.out.println("Digite a nota para fantasias de 0 a 10: ");
			c = entrada.nextInt();
			
			media1 = (a+b+c) / 3;
			System.out.println("A média da escola Arara foi: " + media1);
			
			break;
		case 2:
			double d,e,f;
			System.out.println("Digite a nota para bateria de 0 a 10: ");
			d = entrada.nextInt();
			
			System.out.println("Digite a nota para samba-enredo de 0 a 10: ");
			e = entrada.nextInt();
			
			System.out.println("Digite a nota para fantasias de 0 a 10: ");
			f = entrada.nextInt();
			
			media2 = (d+e+f) / 3;
			System.out.println("A média da escola Jaguatirica foi:  " + media2);
			
			break;
		case 3:
			double g,h,i;
			System.out.println("Digite a nota para bateria de 0 a 10: ");
			g = entrada.nextInt();
			
			System.out.println("Digite a nota para samba-enredo de 0 a 10: ");
			h = entrada.nextInt();
			
			System.out.println("Digite a nota para fantasias de 0 a 10: ");
			i = entrada.nextInt();
			
			media3 = (g+h+i) / 3;
			System.out.println("A média da escola Sumaré foi: " + media3);
			break;
		case 4:
			double j,k,l;
			System.out.println("Digite a nota para bateria de 0 a 10: ");
			j = entrada.nextInt();
			
			System.out.println("Digite a nota para samba-enredo de 0 a 10: ");
			k = entrada.nextInt();
			
			System.out.println("Digite a nota para fantasias de 0 a 10: ");
			l = entrada.nextInt();
			
			media4 = (j+k+l) / 3;
			System.out.println("A média da escola Piracicaba foi:  " + media4);
			break;
		case 5:
			double m,n,o;
			System.out.println("Digite a nota para bateria de 0 a 10: ");
			m = entrada.nextInt();
			
			System.out.println("Digite a nota para samba-enredo de 0 a 10: ");
			n = entrada.nextInt();
			
			System.out.println("Digite a nota para fantasias de 0 a 10: ");
			o = entrada.nextInt();
			
			media5 = (m+n+o) / 3;
			System.out.println("A média da escola Piracanjuba foi: " + media5);
			break;
		case 6:
			double maiorMedia = 0;
			if (media1 >maiorMedia) {
				maiorMedia = media1;
			}
			if (media2 >maiorMedia) {
				maiorMedia = media2;
			}
			if (media3 >maiorMedia) {
				maiorMedia = media3;
			}
			if (media4 >maiorMedia) {
				maiorMedia = media4;
			}
			if (media5 >maiorMedia) {
				maiorMedia = media5;
			}
			if (maiorMedia == media1) {
				System.out.println("Escola de samba vencedora é ARARA");
			}
			if (maiorMedia == media2) {
				System.out.println("Escola de samba vencedora é JAGUATIRICA");
			}
			if (maiorMedia == media3) {
				System.out.println("Escola de samba vencedora é SUMARÉ");
			}
			if (maiorMedia == media4) {
				System.out.println("Escola de samba vencedora é PIRACICABA");
			}
			if (maiorMedia == media5) {
				System.out.println("Escola de samba vencedora é PIRACANJUBA");
			}
			
			System.out.print("Obrigado! \n");
			return;
		default: 
			System.out.println("Opção Inválida");
			break;
			
		}
	}
}
		public static void MateriasPrimas() {
			entrada = new Scanner(System.in);
			int materiais = 0;
			double total1 = 0, total2 = 0, total3 = 0;
			double  valorEstim1 = 0, valorEstim2 = 0, valorEstim3 = 0;
			while (materiais !=4) {
			System.out.println("Escolha um material: ");
			System.out.println("1 - Lantejoulas\n2 - Penas de Avestruz\n3 - Tecido de seda Húngara \n4 - Resultado/Sair ");
			materiais = entrada.nextInt();
			switch (materiais) {
				
			case 1:
				double qntd1, valor1;
				
				System.out.println("Digite a quantidade de lantejoulas utilizadas em quilos: ");
				qntd1 = entrada.nextDouble();
		
				System.out.println("Digite o valor por quilo: ");
				valor1 = entrada.nextDouble();
				
				System.out.println("Digite o valor estimado de gastos: ");
				valorEstim1 = entrada.nextDouble();
				
				total1 = qntd1 * valor1;
				System.out.println("Preço total das lantejoulas: " + total1);
				
				if(total1 > valorEstim1) {
					System.out.println("Valor excedeu o estimado");
				} else if (total1 == valorEstim1) {
					System.out.println("O valor está igual ao extimado");
				}else  {
					System.out.println("Valor não excedeu o estimado");
				}
				
				break;
			case 2:
				double qntd2, valor2;
				
				System.out.println("Digite a quantidade de penas de avestruz utilizadas em quilos: ");
				qntd2 = entrada.nextDouble();
		
				System.out.println("Digite o valor por quilo: ");
				valor2 = entrada.nextDouble();
				
				System.out.println("Digite o valor estimado de gastos: ");
				valorEstim2 = entrada.nextDouble();
				
				total2 = qntd2 * valor2;
				System.out.println("Preço total das penas: " + total2);
				
				if(total2 > valorEstim2) {
					System.out.println("Valor excedeu o estimado");
				} else if (total2 == valorEstim2) {
					System.out.println("O valor está igual ao estimado");
				}else {
					System.out.println("Valor não excedeu o estimado");
				}
				
				
				break;
			case 3:
				double qntd3, valor3;
				
				System.out.println("Digite a quantidade de penas de tecido de seda Húngara utilizadas em quilos: ");
				qntd3 = entrada.nextDouble();
		
				System.out.println("Digite o valor por quilo: ");
				valor3 = entrada.nextDouble();
				
				System.out.println("Digite o valor estimado de gastos: ");
				valorEstim3 = entrada.nextDouble();
				
				total3 = qntd3 * valor3;
				System.out.println("Preço total do tecido de seda: " + total3);
				
				if(total3 > valorEstim3) {
					System.out.println("Valor excedeu o estimado");
				} else if (total3 == valorEstim3) {
					System.out.println("O valor está igual ao estimado");
				}else {
					System.out.println("Valor não excedeu o estimado");
				}	
				
				break;
			case 4:
				
				if(total1 > valorEstim1) {
					System.out.println("As lantejoulas excederam o valor estimado");
				} else if (total1 == valorEstim1) {
					System.out.println("O valor das lantejoulas está igual ao estimado");
				}else {
					System.out.println("As lantejoulas não excederam o valor estimado");
				}
				
				if(total2 > valorEstim2) {
					System.out.println("As penas de avestruz excederam o valor estimado");
				} else if (total2 == valorEstim2) {
					System.out.println("O valor das penas de avestruz está igual ao estimado");
				}else {
					System.out.println("As penas de avestruz não excederam o valor estimado");
				}
				
				if(total3 > valorEstim3) {
					System.out.println("Os Tecidos de seda Húngara excederam o valor estimado");
				} else if (total3 == valorEstim3) {
					System.out.println("O valor do tecido de seda está igual ao estimado");
				}else {
					System.out.println("Os Tecidos de seda Húngara não exderam o valor estimado");
				}	
				
		
				System.out.print("Obrigado! \n");
				return;
			default: 
				System.out.println("Opção Inválida");
				break;	
		}
	}
}
			public static void Blocos() {
				entrada = new Scanner(System.in);
				int pessoas;
				int comissao,abreAlas, AlaDasBaianas, Carros, MestrePorta, Bateria, Madrinha, Recuo;
				
				System.out.println("Digite a quantidade total de pessoas que irão participar do desfile: ");
				pessoas = entrada.nextInt();
				
				comissao = (pessoas * 15) / 100;
				abreAlas = (pessoas * 5) / 100;
				AlaDasBaianas = (pessoas * 15) / 100;
				Carros = (pessoas * 20) / 100;
				MestrePorta = (pessoas * 3) / 100;
				Bateria = (pessoas * 20) / 100;
				Madrinha = (pessoas * 2) / 100;
				Recuo = (pessoas * 20) / 100;
				
				System.out.println("Escola Imperatriz HTML ");
				System.out.println(comissao + " pessoas estão no bloco da Comissão");
				System.out.println(abreAlas + " pessoas estão no bloco da Abre-Alas");
				System.out.println(AlaDasBaianas + " pessoas estão no bloco da Ala das Baianas");
				System.out.println(Carros + " pessoas estão no bloco da Carros Alegóricos");
				System.out.println(MestrePorta + " pessoas estão no bloco da Mestre-sala e Porta-bandeira");
				System.out.println(Bateria + " pessoas estão no bloco da Bateria");
				System.out.println(Madrinha + " pessoas estão no bloco da Madrinha de bateria");
				System.out.println(Recuo + " pessoas estão no bloco da Recuo de bateria");
		}
				
		
		
		
}// fechamento do código