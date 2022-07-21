package exemplos;

import java.io.IOException;

public class Exp3 {

	public static void main(String[] args) throws IOException {

		for(int i = 0; i < 10; i++) {
			System.out.println("Iteração"+i);
		}
		System.out.println("");
		for(int i = 1; i <= 5; i++) {
			System.out.println("valor"+i);
		}
		System.out.println("");
		for(int i = 10; i > 0; i-=2) {
			System.out.println("valor"+i);
		}
		System.out.println("");
		for(int i = 0; i < 10; i+=2) {
			System.out.println("valor"+i);
		}
		System.out.println("");
	}
}
