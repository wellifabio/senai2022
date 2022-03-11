package visao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import modelo.Item;

public class Principal {

	static Scanner s = new Scanner(System.in);
	static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws IOException, ParseException {

		System.out.println("Cálculo de inventário");
		System.out.print("Digite quantos ítens deseja colocar no inventário:");
		int qtdInstancias = s.nextInt();
		Item[] itens = new Item[qtdInstancias]; //Instância
	
		System.out.println("Digite o "+qtdInstancias+" itens\nNome\tLocal\tValor\tData da Compra");
		for (int i = 0; i < qtdInstancias; i++) {
			itens[i] = new Item();//Objeto
			itens[i].nome = s.next();
			itens[i].local = s.next();
			itens[i].valor = s.nextDouble();
			itens[i].dataCompra = df.parse(s.next());
		}

		System.out.println("Nome\tLocal\tValor\tData Compra\tAnos");
		for (int i = 0; i < qtdInstancias; i++) {
			System.out.println(itens[i].paraString());
		}
		
		double total = 0;
		for (int i = 0; i < qtdInstancias; i++) {
			total += itens[i].valor;
		}
		System.out.println("O total do Inventários é "+total);
	}

}
