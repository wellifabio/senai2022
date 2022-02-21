
public class Ex1 {
	public static void main(String[] args) {
		mostra();
	}
	
	public static void mostra() {
		int[] vetorInteiros = new int[5];
		
		vetorInteiros[0] = 2;
		vetorInteiros[1] = 4;
		vetorInteiros[2] = 5;
		vetorInteiros[3] = 6;
		vetorInteiros[4] = 8;
		
		System.out.println("Indice\tValor");
		
		for(int i = 0; i < vetorInteiros.length; i++) {
			System.out.println(i + "\t" + vetorInteiros[i]);
		}
	}
}
