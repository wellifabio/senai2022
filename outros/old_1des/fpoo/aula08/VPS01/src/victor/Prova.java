package victor;

public class Prova {

	Scanner sc = new Scanner(System.in);
	int menu = 0;while(menu!=5)
	{
	System.out.println("Digite uma opção: ");
	System.out.println("\n__________________________");
	System.out.print("1 - Horas Extras\n2 - Apuação\n3 - Matérias Primas\n4 - Blocos\n5 - Sair");
	menu = sc.nextInt();
	switch (menu) {
	case 1:
	double valorHora = 5.625;
	double hora1;
	double hora2;
	System.out.println("Digite o total de horas trabalhadas no mês:");
	hora1 = sc.nextDouble();
	System.out.println("Digite o total de horas extras trabalhadas no mês:");
	hora2 = sc.nextDouble();

	double salarioBruto = valorHora * hora1;
	double percentualHR = 75.0 / 100.0;
	double extra = valorHora + (percentualHR * valorHora);
	System.out.printf("Seu salário reajustado ficara: %.2f ", + (salarioBruto + extra)); break;
	case 2:

	String nomes [] = {"rosas do café","imperatriz HTML","unidos do JAVA","torcida CSS"," imperador do javaScript"};
	String cat [] = {"bateria","samba-enredo","fantasias"};
	int notas[];notas=new int[10];
	int notas1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int notas2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,
			10 };notas=new int[10];notas1=new int[10];notas2=new int[10];System.out.println("A escola "+nomes[0]+" teve nota 2 na categoria "+cat[0]+"nota 5 na categoria"+cat[1]+" e nota 6 na categoria"+cat[2]);System.out.println("A escola "+nomes[1]+" teve nota 6 na categoria "+cat[0]+"nota 6 na categoria "+cat[1]+" e nota 6 + na categoria "+cat[2]);System.out.println("A escola "+nomes[2]+" teve nota 2 na categoria "+cat[0]+"nota 9 na categoria "+cat[1]+" e nota 2 + na categoria "+cat[2]);System.out.println("A escola "+nomes[3]+" teve nota 8 na categoria "+cat[0]+"nota 10 + na categoria "+cat[1]+" e nota 10 + na categoria "+cat[2]);System.out.println("A escola "+nomes[4]+" teve nota 10 na categoria "+cat[0]+"nota 3 + na categoria "+cat[1]+"e nota 7 + na categoria "+cat[2]);
	int med;
	int med1;
	int med2;
	int med3;
	int med4;med=2+5+6/2;med1=6+6+6/2;med2=2+9+2/2;med3=8+10+10/2;med4=10+3+7/2;System.out.println("A média da escola"+nomes[0]+"foi de"+med);System.out.println("A média da escola"+nomes[1]+"foi de"+med1);System.out.println("A média da escola"+nomes[2]+"foi de"+med2);System.out.println("A média da escola"+nomes[3]+"foi de"+med3);System.out.println("A média da escola"+nomes[4]+"foi de"+med4);if(med>med1&&med>med2&&med>med3&&med>med4)
	{
		System.out.println("A escola " + nomes[0] + " é campeã");
	}else if(med1>med&&med1>med2&&med1>med3&&med1>med4)
	{
		System.out.println("A escola " + nomes[1] + " é campeã");
	}else if(med2>med&&med2>med1&&med2>med3&&med2>med4)
	{
		System.out.println("A escola " + nomes[2] + " é campeã");
	}else if(med3>med&&med3>med1&&med3>med2&&med3>med4)
	{
		System.out.println("A escola " + nomes[3] + " é campeã");
	}else if(med4>med&&med4>med1&&med4>med2&&med4>med3)
	{
		System.out.println("A escola " + nomes[4] + " é campeã");

	}case 3:

}

}
