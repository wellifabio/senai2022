#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	//Contar até 10 com o laço WHILE
	int i = 1;
	while(i <= 10){
		printf("%d\n",i);
		i++;
	}
}
