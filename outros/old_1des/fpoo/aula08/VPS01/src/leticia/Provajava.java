package leticia;

import java.io.IOException;
import java.util.Scanner;

public class Provajava{
	public static Scanner scan;
     public static Scanner entrada;  
      
     
	public static void main(String[] args)throws IOException {
		entrada = new Scanner(System.in);
		int menu = 0;
		while(menu != 5) {
			System.out.print("Escolha a opção que deseja ver(*-*)");
			System.out.println("----------------------------");
			System.out.println( "1.Horas Extras\n2.Apuração\n3.Matérias Primas\n4.Blocos\n5.Sair");
			System.out.println("--------------------------------------------------");
			menu = entrada.nextInt();
		switch(menu) {
		//Informar
		  // total de horas e horas extras que recebe
		//trabalhadas no mês e informe o valor do salário reajustado
		//R$ 5,625 por hora trabalhada *
		//75% horas extras
		case 1:
			
			 HorasExtras();   
			  
			
			break;
			
		case 2:
			GerarAResposta();
			break;
		case 3:
			
			break;
			//Receba do usuário o total de pessoas que irão participar do desfil
			// informe a quantidade de pessoas necessária em cada bloco.
		case 4:
			
			break;
		case 5:
			System.out.println("Obrigada :)");
			break;
			default:
				break;
		}
		}
}
	public static void HorasExtras() {
		  entrada = new Scanner(System.in);
		 double salario;
		 double horaTrab, horaExtraT;
		 double Totalhora, H = 5.625;
		 double HExtras;
		 float  porc = 75;
		 
		 //entrada
		 System.out.print("Degite a hora que voê trabalhou:");
		 horaTrab = entrada.nextDouble();
		 System.out.print("Digite quantas horas extra você trabalhou nesse mês:");
		 horaExtraT= entrada.nextDouble();
		 //
		 Totalhora = horaTrab * H;
		  HExtras =(H * 75)/100 + H;
		 salario = Totalhora + HExtras;
		 //Saída
		 System.out.printf("O seu salario vai ser, junto com as horas extras:%.2f", salario);
		 System.out.println("");
	 }
		  
     //armazene o nome das escolas de samba 
 //obtidos nas categorias: bateria, samba-enredo e fantasias
// o nome da escola, a média dos pontos obtidos e a escola campeã.
//que 5  escolas de samba estão competindo e que os pontos de cada categoria vão de 0 a 10.

  public static void GerarAResposta() {
	 
	  Scanner scan = new Scanner(System.in);
		System.out.print("---------- :");
		int comprimento = scan.nextInt();
		comprimento = 5;
		String[] nomes = { "São Clemente", "Beija-Flor de Nilópolis", "Paraíso do Tuiuti.", "Portela.", "Beijalá", "Cracatú"};
		String[] nome = {"bateria, samba-enredo e fantasias"};
		int[] pontos= new int[comprimento];
		for (int i = 0; i < comprimento; i++) {
			System.out.println("Digite o nome da Escola ["+i+"]: ");
			nomes[i]=entrada.next();
					
			System.out.print("Digite a nota que você da pra bateria:" );
			nome[i] = entrada.next();
			System.out.println("Digite a nota que você da pra samba-enredo:  ");
			nome[i] = entrada.next();
			
			System.out.println("Digite a nota que você da pra fantasia:  ");
			nome[i] = entrada.next();
		}
		for(int i = 0; i < comprimento; i++) {
			 
			System.out.println(nomes[i]);
			if(pontos[i]<5) {
				System.out.println(nome[i]+"+ i + ");
			
			
		}
			
  }
  }
  //Carros alegóricos (20%), Mestre-sala e Porta-bandeira (3%), Bateria (20%),
  //Madrinha de bateria (2%) e Recuo da bateria (20%)
  public static void GerarBloco() {
  entrada = new Scanner(System.in);
  int qtdp;
   float Comissãofrente = 15;
   float  Alas=5;
   float AlaBai = 15;
   float Carrosale = 20;
   float  MestreePorta = 3;
   float Bateria = 20;
   float Madrinha = 2;
   float Recuo = 20;
  System.out.println("Digite pessoas irão participar do desfile");
  qtdp = entrada.nextInt();
   System.out.printf("Comissãofrente:%.1f",Comissãofrente * qtdp);
  System.out.println("");
  }
}
