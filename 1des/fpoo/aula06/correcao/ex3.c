#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int array[6];
	int i, aux;
	//Entradas para o vetor1
	printf("Usuário, informe 6 valores:");
	for(i = 0; i < 6; i++){
		scanf("%d",&array[i]);
	}
	
	//Processamento (TROCA- Inverter o vetor)
	for(i = 0; i < 6; i+=2){
		aux = array[i];
		array[i] = array[5-i];
		array[5-i] = aux;
	}
	
	//Saída
	for(i = 0; i < 6; i++){
		printf("%d\n",array[i]);	
	}
}
