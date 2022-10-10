package notas01;

public class Main {

	public static void main(String[] args) {
		Boletim boletins[] = new Boletim[5];
		
		boletins[0] = new Boletim("Arnaldo Antunes", 10f, 8f, 7.5f);	
		boletins[1] = new Boletim("Marcelo Rodrigues", 8f, 7.5f, 6f);
		boletins[2] = new Boletim("Mariana Nunes", 10f, 4f, 10f);		
		boletins[3] = new Boletim("Marcos Silva",8f,7f,6f);
		boletins[4] = new Boletim("Marina Mello",7.5f,7f,6.5f);
		
		System.out.println("Aluno\tPortuguês\tMatemática\tCiências\tMédia:");
		for(int i = 0; i < 5; i++) {
			System.out.println(boletins[i].toString());
		}

	}

}
