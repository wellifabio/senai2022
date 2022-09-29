#include<stdio.h>
#include<locale.h>
#include<time.h>
void sorteio(char nomes[10][10]);
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	char nomes[10][10];
	int i;
	printf("Digite 10 nomes:\n");
	for(i = 0; i < 10; i++){
		scanf("%s",nomes[i]);
	}
	sorteio(nomes);
}

void sorteio(char nomes[10][10]){
	int n = rand() % 10;
	printf("O nome sorteado foi %s",nomes[n]);
}
