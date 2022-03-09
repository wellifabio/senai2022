import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o inicio da sequencia : ");
		int inicio = input.nextInt();

		System.out.println("Informe o fim da sequencia : ");
		int fim = input.nextInt();
		
		int somapar = 0, somaimpar = 0;
		
		for(int i = inicio; i <= fim; i++) {
			if(i%2 == 0) {
				somapar = somapar + i;
				//somapar += i;
			}else {
				somaimpar = somaimpar + i;
				//somaimpar += i;
			}
		}
		
		System.out.println(somapar);
		System.out.println(somaimpar);
		
	}

}
