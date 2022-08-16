# Laços de Repetição
- for => para
	- Ex1: (para i = 1 até 10 passo 1)
	- Saída: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	- Ex2: (para i = 1 até 10 passo 2)
	- Saída: 1, 3, 5, 7, 9
- while => enquanto
	- Sempre é necessário um contador
	- Ele pode ser executado 0 vezes
	- Ex1:
		- i = 3
		- enquanto i < 10
		- i = i + 1;
		- Saída: 3, 4, 5, 6, 7, 8, 9
	- Ex2:
		- i = 5
		- enquanto i < 3
		- i = i + 1
		- Saída: Nula (0 vezes)
# Fluxogramas
- Exemplo 1
<img src="fluxograma1.png">
- Exemplo 2
<img src="fluxograma2.png">

# Algoritmo de TROCA

variavel copo1 = uva;
variavel copo2 = laranja;
variavel auxiliar;

auxiliar = copo1;
copo1 = copo2;
copo2 = auxiliar;

- Com variáveis simples
int x = 10, y = 3, aux;
aux = x;
x = y;
y = aux;
