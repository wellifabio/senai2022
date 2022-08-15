#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	int a,b,c,d,e,f;
	printf("Digite seis números inteiros separados por espaço:");
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	scanf("%d",&d);
	scanf("%d",&e);
	scanf("%d",&f);
	
	//Processamento
	if(a > b && a > c && a > d && a > e && a > f){
		printf("O maior número é %d",a);
	}else if(b > a && b > c && b > d && b > e && b > f){
		printf("O maior número é %d",b);
	}else if(c > a && c > b && c > d && c > e && c > f){
		printf("O maior número é %d",c);
	}else if(d > a && d > b && d > c && d > e && d > f){
		printf("O maior número é %d",d);
	}else if(e > a && e > b && e > c && e > d && e > f){
		printf("O maior número é %d",e);
	}else{
		printf("O maior número é %d",f);
	}
}
