//PROGRAMA EXEMPLO QUE CALCULA MÉDIA DE DIVERSOS VALORES UTILIZANDO ALOCAÇÃO DINÂMINCA DE MEMÓRIA
#include <stdio.h>
#include <stdlib.h>

int *aloca(int num)
{
 int count,
  *numbers;
 
 numbers = (int *)malloc(num*sizeof(int));
 
 for(count=0 ; count < num ; count++)
 {
  printf("Numero [%d]: ", count+1);
  scanf("%d", &numbers[count]);
 }
 
 return numbers;
}

float media(int *numbers, int num)
{
 float media=0.0;
 int count;
 
 for(count=0 ; count<num ; count++)
  media += numbers[count];
 
 return media/num;
}

void exibe(int *numbers, int num)
{
 int count;
 
 for(count=0 ; count < num ; count++)
  printf("%3d", numbers[count]);
}

int main(void)
{
 int num=1,
  *numeros;
 
 while(num)
 {
  printf("Media de quantos numeros [0 para sair]: ");
  scanf("%d", &num);
  
  if(num > 0)
  {
   numeros = aloca(num);
   exibe(numeros,num);
   printf("\nA media destes numeros eh: %.2f\n", media(numeros, num) );
   free(numeros);
  }
 }

 return 0;
}


/*Exemplos de códigos de ALOCAÇÃO DINÂMICA DE MEMÓRIA 


//Exemplo de alocação de memória básico para uma string

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    char *nome = (char *) malloc(21*sizeof(char));
 
    printf("Digite seu nome: ");
    gets(nome);
 
    printf("%s\n", nome);
 
    return 0;
}

//Exemplo de alocação e devolução Infinita de memória

#include <stdio.h>
#include <stdlib.h>

void aloca()
{
 int *ptr;
 ptr = (int *) malloc(100);
 
 free(ptr); //Retire esta linha de comando e ao executar este programa seu computador irá travar
}

int main(void)
{
 while(1)
  aloca();

 return 0;
}

Vamos criar um programa simples, que irá pedir uma senha e armazenar num local que foi previamente alocado.
Então você usa essa senha como quiser, e como é um bom programador, irá usar a free() para liberar a memória que foi usada, até mesmo por questões de segurança.

Porém, ao contrário do que muitos pensam (e aí que mora o perigo), ao liberar a memória você não vai apagar os dados existentes nela, você vai apenas dizer ao seu computador "Hey, esse bloco de bytes aqui, já usei, então você pode pegar para fazer outra coisa".

Mas as informações ainda estão lá. E como obter o que tem lá?
Através do ponteiro que ainda aponta para lá. Ou seja, a free() não vai mudar o endereço armazenado no ponteiro, ele ainda vai continuar apontando para sua senha mesmo após aquele bloco de memória ter sido liberado.

Veja o código do programa:

#include <stdio.h>
#include <stdlib.h>


int main(void)
{
 char *senha;
 
 senha = (char *) malloc(21*sizeof(char));
 printf("Digite sua senha [ate 20 caracteres]: ");
 scanf("%[^\n]s", senha);
 
 printf("Senha: %s\n", senha);
 printf("Endereço antes da free(): %d\n", &senha);
 
 free(senha);
 
 printf("Endereço depois da free(): %d\n", &senha);

 return 0;
}

Ou seja, o ponteiro maroto continua apontando pro local da memória que está minha senha, e alguém poderá usar de uma maneira bem maléfica caso eu não tenha gravado outra coisa por cima desse bloco de memória. Como nos proteger, então?

Uma boa prática de segurança é que sempre que for 'liberar' seus ponteiros, fazer eles apontarem para NULL.
Ou seja, faça:
ptr=NULL;

Sempre que usar a free(), pois embora tenha liberado a memória para outro uso, o ponteiro continuará apontando para aquele endereço de memória.
Assim, o ponteiro não vai mais te dedurar.

*/
