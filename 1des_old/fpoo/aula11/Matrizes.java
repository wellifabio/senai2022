package modelos;

import java.io.IOException;
import java.util.Random;

public class Matrizes {

	static Random rand = new Random();
	
	public static void main(String[] args) throws IOException{
		System.out.println("Vetor estático de 27");
		vetor();
		System.out.println("\nVetor dinâmico de 10");
		vetor(10);
		System.out.println("\nMatriz estática 3 por 9");
		matriz();
		System.out.println("Matriz dinâmica 5 por 5");
		matriz(5,5);
		System.out.println("Matriz 3D dinâmica 3,3,3");
		matriz3d(3,3,3);
	}

	static void vetor() {
		int x[] = new int[27];
		for(int i = 0; i < 27; i++)
			x[i] = rand.nextInt(100);
		for(int i = 0; i < 27; i++)
			System.out.print(x[i]+"\t");
	}
	
	static void vetor(int t) {
		int x[] = new int[t];
		for(int i = 0; i < t; i++) {
			x[i] = rand.nextInt(100);
			System.out.print(x[i]+"\t");
		}
	}
	
	static void matriz() {
		int x[][] = new int[3][9];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 9; j++)
				x[i][j] = rand.nextInt(100);

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++)
				System.out.print(x[i][j]+"\t");
			System.out.println();
		}
	}
	
	static void matriz(int l, int c) {
		int x[][] = new int[l][c];
		for(int i = 0; i < l; i++)
			for(int j = 0; j < c; j++)
				x[i][j] = rand.nextInt(100);

		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++)
				System.out.print(x[i][j]+"\t");
			System.out.println();
		}
	}
	
	static void matriz3d(int x, int y, int z) {
		int m3[][][] = new int[x][y][z];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				for(int k = 0; k < z; k++) {
					m3[i][j][k] = rand.nextInt(1000);
					System.out.print(m3[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
