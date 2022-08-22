#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i, tab=30;
	printf("Números pares entre 11 e 250:\n");
	for(i = 11; i < 250; i++){
		if(i % 2 == 0){
			if(i < 100) printf("0");
			printf("%d",i);
			if(tab == i){
				printf("\n");
				tab+=20;
			}else{
				printf("\t");
			}
		}
	}	
}
