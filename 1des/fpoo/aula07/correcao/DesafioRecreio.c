#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
int main(){
	setlocale(LC_ALL,"");
	char nome[5][10];
	int i,aux,aux2[10],i2,cont;
	int notas[5],notas2[5];
	
	
	//entrada nomes
	for(i=0;i<5;i++){
		printf("%d - Digite o nome do aluno:\n",i+1);
		scanf("%s",&nome[i]);
	//entrada notas
		printf("Digite a sua nota (0 a 10):");
		scanf("%d",&notas[i]);
		printf("\n------------------------\n");
		notas2[i]=notas[i];
		
		if(notas[i]<0 || notas[i]>10){
			printf("Digite um valor válido de 0 a 10\n");
			break;
		}
	}
	
	
	//processamento - algoritmo de troca em vetor
	for(i2=0;i2<5;i2++){
		for(i=0;i<5;i++){
			if(notas[i]<notas[i2]){
			
				aux=notas[i];
				notas[i]=notas[i2];
				notas[i2]=aux;
				
				strcpy(aux2, nome[i]);
				strcpy(nome[i], nome[i2]);
				strcpy(nome[i2], aux2);
				
			}
		}		
	}
	
	
	for(i=0;i<5;i++){
		if(notas2[i]==notas[i])cont++;
	}
	
	
	//saida
	for(i=0;i<5;i++){
		printf("\n%dºlugar - %s. sua nota é : %d\n",i+1,nome[i],notas[i]);
	}
	printf("Nao trocaram = %d",cont);
}
