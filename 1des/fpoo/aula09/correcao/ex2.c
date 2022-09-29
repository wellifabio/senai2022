#include<stdio.h>
#include<locale.h>
#include<time.h>
void sorteio(char nomes[10][10], int quantos);
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	char nomes[10][10];
	int i, quantos;
	printf("Digite 10 nomes:\n");
	for(i = 0; i < 10; i++){
		scanf("%s",&nomes[i]);
	}
	printf("Digite quantos deseja sortear:\n");
	scanf("%d",&quantos);
	sorteio(nomes, quantos);
}

void sorteio(char nomes[10][10], int quantos){
	int i, n;
	printf("Os nomes sorteados foram:\n");
	for(i = 0; i < quantos; i++){
		printf("%s\n",nomes[i]);
	}
}
