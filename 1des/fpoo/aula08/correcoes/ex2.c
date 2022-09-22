#include<stdio.h>
#include<locale.h>
float paraFahrenheit(float celsius);
int main(){
	setlocale(LC_ALL,"");
	float c, f;
	printf("Digite a temperatua em graus Celsius: ");
	scanf("%f",&c);
	f = paraFahrenheit(c);
	printf("Temperatura em Cº%.1f em Fº%.1f",c,f);
}
float paraFahrenheit(float celsius){
	return celsius * 9 / 5 + 32;
}
