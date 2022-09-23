#include<stdio.h>
#include<locale.h>
#include<stdbool.h>
bool eIgual(int n1, int n2); //Assinatura da função
int main(){
	setlocale(LC_ALL,"");
	int n1, n2;
	printf("Digite dois números inteiros: ");
	scanf("%d",&n1);
	scanf("%d",&n2);
	if(eIgual(n1,n2))
		printf("Os números são iguais.");
	else
		printf("Os números são diferentes.");
}
//Função que compara se dois números são iguais
bool eIgual(int n1, int n2){
	if(n1 == n2)
		return true;
	else
		return false;
}

