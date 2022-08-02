/*
Desenvolva um programa que leia a velocidade de um carro (km/h)
e a distância a ser percorrida (km) por ele.
Calcule e apresente na tela, quanto tempo (horas) será necessário
para o carro percorrer a distância informada.
*/

#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int velocidade, distancia;
	float tempo;
	//Entradas
	printf("Digite a velocidade do carro em km/h: ");
	scanf("%d",&velocidade);
	printf("Digite a distância em km: ");
	scanf("%d",&distancia);
	//Processamento
	tempo = (float) distancia / velocidade;
	//Saída
	printf("Esta distância será percorrida em %.1f horas",tempo);
}
