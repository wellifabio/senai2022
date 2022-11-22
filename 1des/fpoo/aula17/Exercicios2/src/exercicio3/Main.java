package exercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	//Variáveis como Atributos
	static BufferedReader br;
	static BufferedWriter bw;
	static ArrayList<Veiculo> vs = new ArrayList<>();
	static double media = 0;
	static double maisCaro = 0, maisBarato = 9999999;
	static int indiceCaro = -1, indiceBarato = -1;
	static int novo = 0, velho = 2022;
	static int indiceNovo = -1, indiceVelho = -1;
	
	//Método principal/main
	public static void main(String[] args) {
		
		try {
			br = new BufferedReader(new FileReader("./bd/dados2.csv"));
			String linha = br.readLine(); //Lê a primeira linha
			System.out.println(new Veiculo().rotulos());
			linha = br.readLine(); //Lê a segunda linha
			while (linha != null) {//Lê as outras linhas
				Veiculo v = new Veiculo(linha);
				System.out.println(v); //Usando o toString para mostrar a linha
				vs.add(v); //Adiciono o veículo a lista
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i = 0;
		for(Veiculo v: vs) {
			media += v.getValor(); //Acumulador
			if(maisCaro < v.getValor()) {
				indiceCaro = i;
				maisCaro = v.getValor();
			}
			if(maisBarato > v.getValor()) {
				indiceBarato = i;
				maisBarato = v.getValor();
			}
			if(novo < v.getAno()) {
				indiceNovo = i;
				novo = v.getAno();
			}
			if(velho > v.getAno()) {
				indiceVelho = i;
				velho = v.getAno();
			}
			i++; //Contador
		}
		
		media /= vs.size(); //Divide o acumulador pelo tamanho da lista
		//Mostra os resultados na tela
		System.out.printf("A media de valores dos veículos é %.2f\n",media);
		System.out.println("O veículo mais caro é:");
		System.out.println(vs.get(indiceCaro));
		System.out.println("O veículo mais barato é:");
		System.out.println(vs.get(indiceBarato));
		System.out.println("O veículo mais novo é:");
		System.out.println(vs.get(indiceNovo));
		System.out.println("O veículo mais velho é:");
		System.out.println(vs.get(indiceVelho));
		
		//Salva os relatórios em um arquivo
		try {
			bw = new BufferedWriter(new FileWriter("./bd/relatorio.txt"));
			bw.write(new Veiculo().rotulos()+"\n");
			for(Veiculo v: vs) {
				bw.write(v.toString()+"\n");
			}
			bw.write(String.format("A media de valores dos veículos é %.2f\n",media));
			bw.write("O veículo mais caro é:\n");
			bw.write(vs.get(indiceCaro).toString()+"\n");
			bw.write("O veículo mais barato é:\n");
			bw.write(vs.get(indiceBarato).toString()+"\n");
			bw.write("O veículo mais novo é:\n");
			bw.write(vs.get(indiceNovo).toString()+"\n");
			bw.write("O veículo mais velho é:\n");
			bw.write(vs.get(indiceVelho).toString()+"\n");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
