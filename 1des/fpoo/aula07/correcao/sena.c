#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int sena[60];
	int i, alinha = 10;
	for(i = 1; i <= 60; i++){
		if(i < 10) printf("[0%d]",i);
		else printf("[%d]",i);
		if(i == alinha){
			printf("\n");
			alinha+=10;
		}
	}
}
