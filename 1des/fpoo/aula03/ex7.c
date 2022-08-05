#include <stdio.h>
#include <locale.h>

int main() {
	
	setlocale(LC_ALL, "Portuguese");
	
	float alqueires, caminhoes, voltas, totalalqueires, totalcaminhao;
	
	printf("\nUm caminhão consegue transportar 18 toneladas de laranjas em uma viagem que faz entre a fazenda e a fábrica de suco de laranja. Um alqueire de terra produz em média 250 toneladas de laranjas. Faça um programa que leia quantos caminhões e quantos alqueires uma fazenda produtora de laranjas possui, calcule e apresente na tela quantas viagens de caminhão serão necessárias para transportar toda a colheita de laranjas.");

	printf("\n\nDigite a quantidade de alqueires de a fazendo possui: ");
	scanf("%d", &alqueires);
	
	printf("Digite a quantidade de caminhões de a fazendo possui: ");
	scanf("%d", &caminhoes);
	
	totalalqueires = alqueires * 250;
	totalcaminhao = caminhoes * 18;
	
	voltas= totalalqueires/totalcaminhao;
	
	printf(" O total de voltas será %.2f", voltas);
	return 0;
}
