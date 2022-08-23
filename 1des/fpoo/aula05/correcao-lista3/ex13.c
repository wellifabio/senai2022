#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	int n1 = 32767, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
	int i, n;
	for(i = 0; i < 5; i++){
		n = -1;
		while(n < 0 || n > 32767){
			printf("Digite o %dº número: ",i + 1);
			scanf("%d",&n);
		}
		if(n < n1){
			n1 = n;
		}
		if(n > n5){
			n5 = n;
		}
	}
	printf("%d %d %d %d %d",n1,n2,n3,n4,n5);
}

