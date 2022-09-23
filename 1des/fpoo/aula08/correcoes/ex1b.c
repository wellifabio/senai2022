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
//Função que converte um número inteiro em binário
void decBin(int n){
	int bin = 0, digitos = 1;
	while(n > 0){
		bin += (n % 2) * digitos;
		digitos *= 10;
		n /= 2;
	}
	printf("%d",bin);
}
