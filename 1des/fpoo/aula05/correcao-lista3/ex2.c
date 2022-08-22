#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i;
	for(i = 199; i > 1; i--){
		printf("%d ",i);
	}
}

/*

	int i, tab=190;
	for(i = 199; i > 1; i--){
		if(i<100) printf("0");
		if(i<10) printf("0");
		printf("%d",i);
		if(tab == i) {
			printf("\n");
			tab-=10;
		}
		else printf("\t");
	}
	
*/
