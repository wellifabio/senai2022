#include<stdio.h>
#include<locale.h>
#include<time.h>
int qualEoMaior(int n1, int n2); //Assinatura da função
int qualEoMaiorVetor(int vetor[10]); //Assinatura da função
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	
	int n1, n2;
	printf("Digite dois números inteiros: ");
	scanf("%d",&n1);
	scanf("%d",&n2);
	printf("O maior número é %d\n",qualEoMaior(n1,n2));
	
	int i, v[10];
	for(i = 0; i < 10; i++){
		v[i] = rand() % 100;
		printf("%d\n",v[i]);
	}
	printf("O maior número é %d\n",qualEoMaiorVetor(v));
}
//Função que compara dois valores e retorna o maior
int qualEoMaior(int n1, int n2){
	if(n1 > n2)
		return n1;
	else
		return n2;
}
//Função que compara 10 valores e retorna o maior
int qualEoMaiorVetor(int vetor[10]){
	int maior = 0, i;
	for(i = 0; i < 10; i++)
		if(maior < vetor[i])
			maior = vetor[i];
	return maior;
}
