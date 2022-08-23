#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	int n1 = 32767, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
	int i, n;
	//Entrada e Processamento
	for(i = 0; i < 5; i++){
		n = -1;
		while(n < 0 || n > 32767){
			printf("Digite o %dº número: ",i + 1);
			scanf("%d",&n);
		}
		if(i == 4){
			if(n > n4) n5 = n;
			else if(n > n3){
				n5 = n4;
				n4 = n;
			}else if(n > n2){
				n5 = n4;
				n4 = n3;
				n3 = n;
			}else if(n > n1){
				n5 = n4;
				n4 = n3;
				n3 = n2;
				n2 = n;
			}else{
				n5 = n4;
				n4 = n3;
				n3 = n2;
				n2 = n1;
				n1 = n;				
			}
		}else if(i == 3){
			if(n > n3) n4 = n;
			else if(n > n2){
				n4 = n3;
				n3 = n;
			}else if(n > n1){
				n4 = n3;
				n3 = n2;
				n2 = n;
			}else{
				n4 = n3;
				n3 = n2;
				n2 = n1;
				n1 = n;				
			}
		}else{
			if(i == 2){
				if(n > n1 && n < n3) n2 = n;
				else if(n > n3) n2 = n3;
				else if(n < n1) n2 = n1;
			}
			if(n < n1) n1 = n;
			if(n > n3) n3 = n;
		}
	}
	//Saída
	printf("%d %d %d %d %d", n1, n2, n3, n4, n5);
}

