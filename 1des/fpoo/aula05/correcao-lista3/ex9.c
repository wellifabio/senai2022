#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int cont;
	int valores;
	int acumulador = 0;
	//Entrada e Processamento
	for(cont = 0; cont < 15; cont++){
		valores = -1;
		while(valores < 0 || valores > 32767){
			printf("Digite %dº valor: ", cont + 1);
			scanf("%d",&valores);
		}
		acumulador += valores;
	}
	//Saída
	printf("A soma dos 15 valores digitados é %d",acumulador);
}
