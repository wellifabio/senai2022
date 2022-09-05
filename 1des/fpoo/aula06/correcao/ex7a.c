#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char nome[5][30];
	
	printf("Digite o nome da 1ª pessoa: ");
	scanf("%s",&nome[0]);
	printf("Digite o nome da 2ª pessoa: ");
	scanf("%s",&nome[1]);
	printf("Digite o nome da 3ª pessoa: ");
	scanf("%s",&nome[2]);
	printf("Digite o nome da 4ª pessoa: ");
	scanf("%s",&nome[3]);
	printf("Digite o nome da 5ª pessoa: ");
	scanf("%s",&nome[4]);

	printf("%s\n",nome[0]);
	printf("%s\n",nome[1]);
	printf("%s\n",nome[2]);
	printf("%s\n",nome[3]);
	printf("%s\n",nome[4]);
}
