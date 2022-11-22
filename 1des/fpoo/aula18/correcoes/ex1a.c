#include<stdio.h>
#include<locale.h>

int main(){
	setlocale(LC_ALL,"");
	char nome[15];
	int idade;

	printf("Digite o nome e idade de uma pessoa:\n");
	scanf("%s",&nome);
	scanf("%d",&idade);

	if(idade < 10)
		printf("%s\t%d\tCriança\n",nome,idade);
	else if(idade < 20)
		printf("%s\t%d\tJovem\n",nome,idade);
	else if(idade < 60)
		printf("%s\t%d\tAdulto\n",nome,idade);
	else
		printf("%s\t%d\tIdoso\n",nome,idade);

	return 0;
}
