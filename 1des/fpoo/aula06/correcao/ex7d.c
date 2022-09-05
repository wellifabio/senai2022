#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char nome[5][15];
	char aux[15];
	int i, j;
	
	//Entrada usando string = vetor de caracteres
	for(i = 0; i < 5; i++){
		printf("Digite o nome da %dª pessoa: ", i + 1);
		scanf("%s",&nome[i]);
	}
	
	//Processamento - Algoritmo de classificação e troca
	//Utilizando o strcmp
	for(i = 0; i < 5; i++){
		for(j = i + 1; j < 5; j++){
			if(strcmp(nome[i],nome[j])>0){
				strcpy(aux, nome[i]);
				strcpy(nome[i], nome[j]);
				strcpy(nome[j], aux);
			}
		}
	}
	
	//Saída
	for(i = 0; i < 5; i++)
		printf("%s\n",nome[i]);
}
