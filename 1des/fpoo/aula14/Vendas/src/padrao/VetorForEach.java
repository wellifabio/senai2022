package padrao;

public class VetorForEach {

	public static void main(String[] args) {
		String nomes[] = { "Ana", "Maria", "Bruno", "Marcos" };
		System.out.println("Comprimento do vetor = " + nomes.length);
		// Laço tradicional para mostrar vetores
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		// Laço para cada (for each) especial para vetores e listas
		System.out.println("Lista de nomes com o laço ForEach:");
		for (String nome: nomes) {//Para cada nome em nomes
			System.out.println(nome);
		}
		// Neste vetor se quisermos adicionar um nome, não é possivel;
		// Neste vetor se quisermos remover um nome, não é possivel;
		nomes[0] = null; //pseudo exclusão do primeiro nome.
		nomes[2] = ""; //pseudo exclusão do terceiro nome.
		System.out.println("Lista de nomes com pseudo exclusão:");
		for (String nome: nomes) {//Para cada nome em nomes
			System.out.println(nome);
		}
		System.out.println("Comprimento do vetor = " + nomes.length);
	}

}
