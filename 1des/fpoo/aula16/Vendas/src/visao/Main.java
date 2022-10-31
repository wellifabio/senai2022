package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Venda;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Venda> vendas = new ArrayList<>();
	static int menu = 0;

	public static void main(String[] args) {
		while (menu != 5) {
			System.out.println("\n1.Cadastrar vendas");
			System.out.println("2.Consultar vendas");
			System.out.println("3.Alterar venda");
			System.out.println("4.Excluir venda");
			System.out.println("5.Terminar programa");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Produto\tQuantidade\tPreço:");
				create();
				break;
			case 2:
				System.out.println("Produto\tQuantidade\tPreço\tSubTotal:");
				read();
				break;
			case 3:
				System.out.print("Digite qual item quer alterar:");
				update(scan.nextInt());
				break;
			case 4:
				System.out.print("Digite qual item quer excluir:");
				delete(scan.nextInt());
				break;
			case 5:
				System.out.println("Obrigado por utilizar nosso sistema. Tchaw.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
	
	public static void create() {
		Venda v = new Venda();
		v.setProduto(scan.next());
		v.setQuantidade(scan.nextInt());
		v.setPreco(scan.nextFloat());
		vendas.add(v);
	}
	
	public static void read() {
		float total = 0;
		for(Venda v: vendas) {
			System.out.println(v.toString());
			total += v.subTotal();
		}
		System.out.printf("Total = %.2f\n",total);
	}
	
	public static void update(int indice) {
		if(indice >= 0 && indice < vendas.size()) {
			System.out.println(vendas.get(indice).toString());
			Venda v = new Venda();
			v.setProduto(scan.next());
			v.setQuantidade(scan.nextInt());
			v.setPreco(scan.nextFloat());
			vendas.set(indice,v);
			System.out.println("Venda alterada.");
		}else
			System.out.println("Ítem inválido.");
	}

	public static void delete(int indice) {
		if(indice >= 0 && indice < vendas.size()) {
			vendas.remove(indice);
			System.out.println("Venda excluída.");
		}else
			System.out.println("Ítem inválido.");
	}                      
}
