#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	//Contar até 10 com o laço FOR
	int i;
	for(i = 1; i <= 10; i++){
		printf("%d\n",i);
	}
}
