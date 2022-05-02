package controle;

import java.util.ArrayList;

import modelo.Pet;

public class PetProcess {
	
	public static ArrayList<Pet> pets = new ArrayList<>();
	
	public static void carregarTestes(){
		pets.add(new Pet(1,"Cachorro","Totó","Vira Latas",26,"20/10/2010","Diego Costa","(19)98877-7897"));
		pets.add(new Pet(2,"Gato","Mini","Angorá",4,"02/11/2012","Silas Madruga","(19)98788-4456"));
		pets.add(new Pet(3,"Coelho","Perna Longa","Basicão",3,"21/01/2010","Marta Silva","(19)98555-2254"));
		pets.add(new Pet(4,"Outro","Tiazinha","Normal",3,"25/10/2020","Ana Luiza","(19)98873-3355"));
		pets.add(new Pet(5,"Outro","Pipoca","Azul",2,"21/04/2021","Alfredo Godoy","(19)98845-1885"));
	}
	
}
