#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int v[50];
	int i, num, onde = -1;
	//Gerar os números aleatórios para o vetor
	for(i = 0; i < 50; i++){
		v[i] = rand() % 100;
		printf("[%d]%d\n",i,v[i]);
	}
	//Entrada
	printf("Digite um número inteiro\n");
	scanf("%d",&num);
	//Processamento
	for(i = 0; i < 50; i++){
		if(v[i] == num){
			onde = i;
			break;
		}
	}
	//Saída
	if(onde != -1) printf("Encontrei na posição %d", onde);
	else printf("Não encontrei");
	
	//Desafio 1 (Mostrar todas as posições em que o número for encontrado caso seja repetido)
	//Desafio 2 (Não permitir números repetidos)
}

