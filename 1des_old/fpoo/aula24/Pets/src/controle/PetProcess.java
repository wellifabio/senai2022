package controle;

import java.util.ArrayList;

import modelo.Pet;

public class PetProcess {

	public static ArrayList<Pet> pets = new ArrayList<>();
	private static PetDAO pd = new PetDAO();
	
	public static void abrir() {
		pets = pd.ler();
	}
	
	public static void salvar() {
		pd.escrever(pets);
	}
	
	public static void carregarTestes() {
		// Limpar a lista
		pets = new ArrayList<>();
		// Preencher com testes
		pets.add(new Pet(1, "Cachorro", "Toto", "Vira Latas", 26, "01/01/2015", "Joaquin", "(19)98787-7898"));
		pets.add(new Pet(2, "Gato", "Mimi", "Angorá", 3, "25/10/2020", "Sirley", "(19)99999-7171"));
		pets.add(new Pet(3, "Outro", "Tico", "Canário", 0.1f, "23/04/2018", "Ana júlia", "(19)97788-7887"));
		pets.add(new Pet(4, "Cachorro", "Thayson", "Labrador", 40, "10/05/2012", "Márcio Guerra", "(19)91454-1212"));
	}
}
