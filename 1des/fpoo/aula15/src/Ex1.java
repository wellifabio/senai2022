import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Informe o inicio do intervalo : ");
		int inicio = input.nextInt();
		
		System.out.println("Informe o fim do intervalo : ");
		int fim = input.nextInt();
		
		if(inicio%2 != 0) inicio++;
		//if(inicio%2 == 0) inicio++;
		
		for(int i = inicio; i <= fim; i+=2) {
			System.out.println(i);
		}		
	}

}
