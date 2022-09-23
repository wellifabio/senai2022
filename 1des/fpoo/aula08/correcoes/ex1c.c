#include<stdio.h>
#include<locale.h>
int decBin(int n); //Assinatura da função
int main(){
	setlocale(LC_ALL,"");
	int num;
	printf("Digite o número inteiro que será convertido em binario: ");
	scanf("%d",&num);
	printf("O número %d em binário é ",decBin(num));
}
//Função que converte um número inteiro em binário usando recursividade
int decBin(int n){
	if(n == 0)
		return 0;
	else
		return n % 2 + 10 * decBin(n / 2);
}
