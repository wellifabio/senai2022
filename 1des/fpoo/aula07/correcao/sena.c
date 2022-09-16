#include <locale.h>
#include <time.h>
#include <stdio.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int vetor[6];
	int i = 0, alinha= 10, aux, encontrado, n;
	//Sortear 6 números aleatórios não repetidos
	do{
		aux=rand() % 60 + 1;	
		encontrado=0;
		for(n=0; n<i; n++)
			if( vetor[n] == aux)
				encontrado = 1;
		if(!encontrado){
			vetor[i]= aux;
			i++;
		}
	}while(i < 6);
	//Mostrar os 60 numeros em 6 linhas e "ocultar [  ]" os sorteados
	encontrado = 0;
	for(i=1; i<=60; i++){
		//Percorrendo o vetor de 6 dezenas sorteadas e se encontrar mostra [  ]
		for(n=0; n<6; n++){
			if(vetor[n] == i){
				printf("[  ]");
				encontrado = i;
				break;
			}
		}
		//Mostra o número se não for encontrado no vetor
		if(encontrado!=i && i<10) {	
			printf("[0%d]", i);
		}else if(encontrado!=i && i>=10) {
			printf("[%d]",i);
		}
		if(i==alinha){
			printf("\n");
			alinha+=10;
		}
	}
	//Mostra as seis dezenas sorteadas
	printf("\n");
	for(i = 0; i < 6; i++)
		printf("(%d)",vetor[i]);	
}
