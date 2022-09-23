#include<stdio.h>
#include<locale.h>
void retangulo(int x, int y, char c);
int main(){
	setlocale(LC_ALL,"");
	int l, a;
	char c;
	printf("Digite a largura, altura e caracter do retângulo:\n");
	scanf("%d",&l);
	scanf("%d",&a);
	c = getch();
	retangulo(l, a, c);
}
//Função que desenha um retângulo
void retangulo(int x, int y, char c){
	int i, j;
	for(i = 0; i < y; i++){
		for(j = 0; j < x; j++){
			if(i == 0)	printf("%c",c);
			else if(j == 0)printf("%c",c);
			else if(j == x - 1)printf("%c",c);
			else if(i == y - 1)printf("%c",c);
			else printf(" ");
		}
		printf("\n");
	}
}
