#include<stdio.h>
#include<locale.h>
int fatorial(int x);
int main(){
	setlocale(LC_ALL,"");
	int num;
	printf("Digite um número inteiro positivo: ");
	scanf("%d",&num);
	printf("%d! = %d",num,fatorial(num));
}
int fatorial(int x){
	if(x == 0 || x == 1)
		return  1;
	else
		return x * fatorial(x - 1);
}
