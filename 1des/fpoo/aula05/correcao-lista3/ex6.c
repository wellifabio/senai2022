#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i;
	int acumulado = 0;
	for(i = 0; i < 100; i++){
		acumulado += i;
	}
	printf("A soma dos valores entre 0 e 100 é %d", acumulado);
}
