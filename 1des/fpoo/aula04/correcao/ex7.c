#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	int a,b,c,d,e;
	printf("Digite cinco números inteiros separados por espaço ou enter: ");
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	scanf("%d",&d);
	scanf("%d",&e);
	
	//Processamento
	if(a < b && a < c && a < d && a < e){
		printf(" %d",a);
		if(b < c && b < d && b < e){
			printf(" %d",b);
			if(c < d && c < e){
				printf(" %d",c);
				if(d < e){
					printf(" %d %d", d, e);	
				}else{
					printf(" %d %d", e, d);	
				}
			}else if (d < c && d < e){
				printf(" %d",d);
				if(c < e){
					printf(" %d %d", c, e);	
				}else{
					printf(" %d %d", e, c);	
				}
			}else{
				printf(" %d",e);
				if(c < d){
					printf(" %d %d", c, d);	
				}else{
					printf(" %d %d", d, c);	
				}
			}
		}else if(c < b && c < d && c < e){
			printf(" %d",c);
			if(b < d && b < e){
				printf(" %d",b);
				if(d < e){
					printf(" %d %d", d, e);	
				}else{
					printf(" %d %d", e, d);	
				}
			}else if (d < b && d < e){
				printf(" %d",d);
				if(b < e){
					printf(" %d %d", b, e);	
				}else{
					printf(" %d %d", e, b);	
				}
			}else{
				printf(" %d",e);
				if(b < d){
					printf(" %d %d", b, d);	
				}else{
					printf(" %d %d", d, b);	
				}
			}		
		}else if(d < b && d < c && d < e){
			printf(" %d",d);
			if(c < b && c < e){
				printf(" %d",c);
				if(b < e){
					printf(" %d %d", b, e);	
				}else{
					printf(" %d %d", e, b);	
				}
			}else if (b < c && d < e){
				printf(" %d",b);
				if(c < e){
					printf(" %d %d", c, e);	
				}else{
					printf(" %d %d", e, c);	
				}
			}else{
				printf(" %d",e);
				if(c < b){
					printf(" %d %d", c, b);	
				}else{
					printf(" %d %d", b, c);	
				}
			}
		}else{
			printf(" %d",e);
			if(c < d && c < b){
				printf(" %d",c);
				if(d < b){
					printf(" %d %d", d, b);	
				}else{
					printf(" %d %d", b, d);	
				}
			}else if (d < c && d < b){
				printf(" %d",d);
				if(c < b){
					printf(" %d %d", c, b);	
				}else{
					printf(" %d %d", b, c);	
				}
			}else{
				printf(" %d",b);
				if(c < d){
					printf(" %d %d", c, d);	
				}else{
					printf(" %d %d", d, c);	
				}
			}			
		}
	}else if(b < a && b < c && b < d && b < e){
		printf(" %d",b);
		if(a < c && a < d && a < e){
			printf(" %d",a);
			if(c < d && c < e){
				printf(" %d",c);
				if(d < e){
					printf(" %d %d", d, e);	
				}else{
					printf(" %d %d", e, d);	
				}
			}else if (d < c && d < e){
				printf(" %d",d);
				if(c < e){
					printf(" %d %d", c, e);	
				}else{
					printf(" %d %d", e, c);	
				}
			}else{
				printf(" %d",e);
				if(c < d){
					printf(" %d %d", c, d);	
				}else{
					printf(" %d %d", d, c);	
				}
			}
		}else if(c < a && c < d && c < e){
			printf(" %d",c);
			if(a < d && a < e){
				printf(" %d",a);
				if(d < e){
					printf(" %d %d", d, e);	
				}else{
					printf(" %d %d", e, d);	
				}
			}else if (d < a && d < e){
				printf(" %d",d);
				if(a < e){
					printf(" %d %d", a, e);	
				}else{
					printf(" %d %d", e, a);	
				}
			}else{
				printf(" %d",e);
				if(a < d){
					printf(" %d %d", a, d);	
				}else{
					printf(" %d %d", d, a);	
				}
			}		
		}else if(d < a && d < c && d < e){
			printf(" %d",d);
			if(c < a && c < e){
				printf(" %d",c);
				if(a < e){
					printf(" %d %d", a, e);	
				}else{
					printf(" %d %d", e, a);	
				}
			}else if (a < c && d < e){
				printf(" %d",a);
				if(c < e){
					printf(" %d %d", c, e);	
				}else{
					printf(" %d %d", e, c);	
				}
			}else{
				printf(" %d",e);
				if(c < a){
					printf(" %d %d", c, a);	
				}else{
					printf(" %d %d", a, c);	
				}
			}
		}else{
			printf(" %d",e);
			if(c < d && c < a){
				printf(" %d",c);
				if(d < a){
					printf(" %d %d", d, a);	
				}else{
					printf(" %d %d", a, d);	
				}
			}else if (d < c && d < a){
				printf(" %d",d);
				if(c < a){
					printf(" %d %d", c, a);	
				}else{
					printf(" %d %d", a, c);	
				}
			}else{
				printf(" %d",a);
				if(c < d){
					printf(" %d %d", c, d);	
				}else{
					printf(" %d %d", d, c);	
				}
			}			
		}
	}else if(c < a && c < b && c < d && c < e){
		printf("%d",c);
		if(b < a && b < d && b < e){
			printf(" %d",b);
			if(a < d && a < e){
				printf(" %d",a);
				if(d < e){
					printf(" %d %d", d, e);	
				}else{
					printf(" %d %d", e, d);	
				}
			}else if (d < a && d < e){
				printf(" %d",d);
				if(a < e){
					printf(" %d %d", a, e);	
				}else{
					printf(" %d %d", e, a);	
				}
			}else{
				printf(" %d",e);
				if(a < d){
					printf(" %d %d", a, d);	
				}else{
					printf(" %d %d", d, a);	
				}
			}
		}else if(a < b && a < d && a < e){
			printf(" %d",a);
			if(b < d && b < e){
				printf(" %d",b);
				if(d < e){
					printf(" %d %d", d, e);	
				}else{
					printf(" %d %d", e, d);	
				}
			}else if (d < b && d < e){
				printf(" %d",d);
				if(b < e){
					printf(" %d %d", b, e);	
				}else{
					printf(" %d %d", e, b);	
				}
			}else{
				printf(" %d",e);
				if(b < d){
					printf(" %d %d", b, d);	
				}else{
					printf(" %d %d", d, b);	
				}
			}		
		}else if(d < b && d < a && d < e){
			printf(" %d",d);
			if(a < b && a < e){
				printf(" %d",a);
				if(b < e){
					printf(" %d %d", b, e);	
				}else{
					printf(" %d %d", e, b);	
				}
			}else if (b < a && d < e){
				printf(" %d",b);
				if(a < e){
					printf(" %d %d", a, e);	
				}else{
					printf(" %d %d", e, a);	
				}
			}else{
				printf(" %d",e);
				if(a < b){
					printf(" %d %d", a, b);	
				}else{
					printf(" %d %d", b, a);	
				}
			}
		}else{
			printf(" %d",e);
			if(a < d && a < b){
				printf(" %d",a);
				if(d < b){
					printf(" %d %d", d, b);	
				}else{
					printf(" %d %d", b, d);	
				}
			}else if (d < a && d < b){
				printf(" %d",d);
				if(a < b){
					printf(" %d %d", a, b);	
				}else{
					printf(" %d %d", b, a);	
				}
			}else{
				printf(" %d",b);
				if(a < d){
					printf(" %d %d", a, d);	
				}else{
					printf(" %d %d", d, a);	
				}
			}			
		}		
	}else if(d < a && d < b && d < c && d < e){
		printf("%d",d);
		if(b < c && b < a && b < e){
			printf(" %d",b);
			if(c < a && c < e){
				printf(" %d",c);
				if(a < e){
					printf(" %d %d", a, e);	
				}else{
					printf(" %d %d", e, a);	
				}
			}else if (a < c && a < e){
				printf(" %d",a);
				if(c < e){
					printf(" %d %d", c, e);	
				}else{
					printf(" %d %d", e, c);	
				}
			}else{
				printf(" %d",e);
				if(c < a){
					printf(" %d %d", c, a);	
				}else{
					printf(" %d %d", a, c);	
				}
			}
		}else if(c < b && c < a && c < e){
			printf(" %d",c);
			if(b < a && b < e){
				printf(" %d",b);
				if(a < e){
					printf(" %d %d", a, e);	
				}else{
					printf(" %d %d", e, a);	
				}
			}else if (a < b && a < e){
				printf(" %d",a);
				if(b < e){
					printf(" %d %d", b, e);	
				}else{
					printf(" %d %d", e, b);	
				}
			}else{
				printf(" %d",e);
				if(b < a){
					printf(" %d %d", b, a);	
				}else{
					printf(" %d %d", a, b);	
				}
			}		
		}else if(a < b && a < c && a < e){
			printf(" %d",a);
			if(c < b && c < e){
				printf(" %d",c);
				if(b < e){
					printf(" %d %d", b, e);	
				}else{
					printf(" %d %d", e, b);	
				}
			}else if (b < c && a < e){
				printf(" %d",b);
				if(c < e){
					printf(" %d %d", c, e);	
				}else{
					printf(" %d %d", e, c);	
				}
			}else{
				printf(" %d",e);
				if(c < b){
					printf(" %d %d", c, b);	
				}else{
					printf(" %d %d", b, c);	
				}
			}
		}else{
			printf(" %d",e);
			if(c < a && c < b){
				printf(" %d",c);
				if(a < b){
					printf(" %d %d", a, b);	
				}else{
					printf(" %d %d", b, a);	
				}
			}else if (a < c && a < b){
				printf(" %d",a);
				if(c < b){
					printf(" %d %d", c, b);	
				}else{
					printf(" %d %d", b, c);	
				}
			}else{
				printf(" %d",b);
				if(c < a){
					printf(" %d %d", c, a);	
				}else{
					printf(" %d %d", a, c);	
				}
			}			
		}		
	}else{
		printf("%d",e);
		if(b < c && b < d && b < a){
			printf(" %d",b);
			if(c < d && c < a){
				printf(" %d",c);
				if(d < a){
					printf(" %d %d", d, a);	
				}else{
					printf(" %d %d", a, d);	
				}
			}else if (d < c && d < a){
				printf(" %d",d);
				if(c < a){
					printf(" %d %d", c, a);	
				}else{
					printf(" %d %d", a, c);	
				}
			}else{
				printf(" %d",a);
				if(c < d){
					printf(" %d %d", c, d);	
				}else{
					printf(" %d %d", d, c);	
				}
			}
		}else if(c < b && c < d && c < a){
			printf(" %d",c);
			if(b < d && b < a){
				printf(" %d",b);
				if(d < a){
					printf(" %d %d", d, a);	
				}else{
					printf(" %d %d", a, d);	
				}
			}else if (d < b && d < a){
				printf(" %d",d);
				if(b < a){
					printf(" %d %d", b, a);	
				}else{
					printf(" %d %d", a, b);	
				}
			}else{
				printf(" %d",a);
				if(b < d){
					printf(" %d %d", b, d);	
				}else{
					printf(" %d %d", d, b);	
				}
			}		
		}else if(d < b && d < c && d < a){
			printf(" %d",d);
			if(c < b && c < a){
				printf(" %d",c);
				if(b < a){
					printf(" %d %d", b, a);	
				}else{
					printf(" %d %d", a, b);	
				}
			}else if (b < c && d < a){
				printf(" %d",b);
				if(c < a){
					printf(" %d %d", c, a);	
				}else{
					printf(" %d %d", a, c);	
				}
			}else{
				printf(" %d",a);
				if(c < b){
					printf(" %d %d", c, b);	
				}else{
					printf(" %d %d", b, c);	
				}
			}
		}else{
			printf(" %d",a);
			if(c < d && c < b){
				printf(" %d",c);
				if(d < b){
					printf(" %d %d", d, b);	
				}else{
					printf(" %d %d", b, d);	
				}
			}else if (d < c && d < b){
				printf(" %d",d);
				if(c < b){
					printf(" %d %d", c, b);	
				}else{
					printf(" %d %d", b, c);	
				}
			}else{
				printf(" %d",b);
				if(c < d){
					printf(" %d %d", c, d);	
				}else{
					printf(" %d %d", d, c);	
				}
			}			
		}		
	}
}
