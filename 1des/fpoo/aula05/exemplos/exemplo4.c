#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	int continuar = 1;
	float media;
	//Programa que leia duas notas e encontre a média
	//O programa deve perguntar ao usuário se deseja continuar
	while(continuar == 1){
		int nota1 = -1, nota2 = -1;
		while(nota1 < 0 || nota1 > 100){
			printf("Digite a primeira nota entre 0 e 100:");
			scanf("%d",&nota1);
		}
		while(nota2 < 0 || nota2 > 100){
			printf("Digite a segunda nota entre 0 e 100:");
			scanf("%d",&nota2);
		}
		media = (float) (nota1 + nota2) / 2;
		printf("A média é %.1f\n",media);
	
		printf("Deseja continuar \n[1. sim][2. não]\n");
		scanf("%d", &continuar);
	}
}
