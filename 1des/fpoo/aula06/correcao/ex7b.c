#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char nome[5][30];
	int i;
	
	for(i = 0; i < 5; i++){
		printf("Digite o nome da %dª pessoa: ", i + 1);
		scanf("%s",&nome[i]);
	}

	for(i = 0; i < 5; i++)
		printf("%s\n",nome[i]);
}
