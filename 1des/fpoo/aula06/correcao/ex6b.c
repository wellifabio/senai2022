#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));//Utiliza o relógio do PC para gerar pseudo aleatórios
	int v[100]; //Vetor a ser classificado
	int i, j; //Contadores
	int aux; //Auriliar para fazer trocas e outros
	int encontrado; //Validar se o número gerado é igual a algum outro
	
	
	//Gera 100 números aleatórios de 0 a 1000 e sem duplicatas
	i = 0;
	do{
		//Gerar um número aleatório
		aux = rand() % 1000;
		encontrado = 0;
		//Percorre o vetor comparando o número gerado com todos os outros
		for(j = 0; j < i; j++){
			//se encontrar um igual no vetor transforma o igual a verdadeiro
			if(v[j] == aux)	encontrado = 1;
		}
		if(!encontrado){//Se não encontrado
			v[i] = aux; //Coloca o número no vetor
			i++; //Incrementa um passo
		}
	}while(i<100);
	

	//Processamento - Algoritmo de classificação e troca
	for(i = 0; i < 100; i++){
		for(j = i + 1; j < 100; j++){
			if(v[i] > v[j]){
				aux = v[i];
				v[i] = v[j];
				v[j] = aux;
			}
		}
	}
	
	//Saída com o vetor ordenado
	for(i = 0; i < 100; i++){
		printf("[%d]:%d\n",i,v[i]);
	}
}
