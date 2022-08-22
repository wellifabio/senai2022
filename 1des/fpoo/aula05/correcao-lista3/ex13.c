#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	int a,b,c,d,e;
	int n1, n2, n3, n4, n5;
	int i, n, menor = 32767, maior = 0;
	for(i = 0; i < 5; i++){
		n = -1;
		while(n < 0 || n > 32767){
			printf("Digite o %dº número: ",i + 1);
			scanf("%d",&n);
		}
		if(n < menor){
			menor = n;
		}
		if(n > maior){
			maior = n;
		}
		if(i == 0) a = n;
		if(i == 1) b = n;
		if(i == 2) c = n;
		if(i == 3) d = n;
		if(i == 4) e = n;
	}
	n1 = menor;
	n5 = maior;
	printf("%d %d %d %d %d",n1,n2,n3,n4,n5);
}

