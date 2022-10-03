#include<stdio.h>
#include<locale.h>
void triangulo(int a, int b, int c);

int main(){
	setlocale(LC_ALL,"");
	float a[8], b[8], c[8];
	int i;	
	//Entrada
	printf("Digite as medidas A, B e C dos 8 triângulos:\n");
	for(i = 0; i < 8; i++)
		do{
			printf("Triangulo %d Lados A B C:",i + 1);
			scanf("%f %f %f", &a[i], &b[i], &c[i]);
		}while(a[i] <= 0 || b[i] <= 0 || c[i] <= 0);
	//Processamento e Saída
	for(i = 0; i < 8; i++)
		triangulo(a[i], b[i], c[i]);
}

void triangulo(int a, int b, int c){
	if(a == b && b == c)
		printf("Equilátero\n");
	else if(a != b && a != c && b != c)
		printf("Escaleno\n");
	else printf("Isósceles\n");
}

