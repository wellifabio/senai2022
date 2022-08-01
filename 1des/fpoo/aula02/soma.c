#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	int a,b,c,d;
	printf("Digite um número inteiro: ");
	scanf("%d",&a);
	printf("Digite outro número inteiro: ");
	scanf("%d",&b);
	printf("Digite outro número inteiro: ");
	scanf("%d",&c);
	d = a + b + c;
	printf("A soma dos três números é %d",d);	
}

