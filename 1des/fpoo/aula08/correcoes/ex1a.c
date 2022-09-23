#include<stdio.h>
#include<locale.h>
void decBin(int n); //Assinatura da função
int main(){
	setlocale(LC_ALL,"");
	int num;
	printf("Digite o número inteiro que será convertido em binario: ");
	scanf("%d",&num);
	printf("O número %d em binário é ",num);
	decBin(num);
}
//Função que converte um número inteiro em binário utilizando VETOR
void decBin(int n){
	int v[50];
	int i = 0, j;
	if(n == 0) printf("0");
	while(n > 0){
		v[i] = n % 2;
		i++;
		n = n / 2;
	}
	for(j = i -1; j >= 0; j--)
		printf("%d",v[j]);
}
