#include<stdio.h>
#include<locale.h>
#include<time.h>
void sorteio(char nomes[10][10], int quantos);
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	char nomes[10][10];
	int i, quantos;
	printf("Digite 10 nomes:\n");
	for(i = 0; i < 10; i++){
		scanf("%s",&nomes[i]);
	}
	printf("Digite quantos deseja sortear:\n");
	scanf("%d",&quantos);
	sorteio(nomes, quantos);
}
//Sortear sem duplicados
void sorteio(char nomes[10][10], int quantos){
	int i = 0, j, n[quantos];
	int encontrado;
	//Preenche um vetor com números aleatórios não repetidos
	do{
		n[i] = rand() % quantos;
		if(i == 0) i++;
		else{
			encontrado = 0;
			for(j = 0; j < i; j++){
				if(n[i] == n[j])
					encontrado = 1;
			}
			if(!encontrado) i++;
		}
	}while(i < quantos);
	
	printf("Os nomes sorteados foram:\n");
	for(i = 0; i < quantos; i++){
		printf("%s\n",nomes[n[i]]);
	}
}
