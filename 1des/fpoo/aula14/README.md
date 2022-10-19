# FPOO x SOP (Orientação a Objetos)
	- Vetores (vários elementos/variáveis/objetos)
		- Estáticos (Sempre possuem o mesmo comprimento que foram definidos)
		- Não é possível adicionar novos itens ou excluir
		- Possui no mínimo 1 elemento
	- Listas (Vetores dinâmicos)
		- É um vetor dinâmico
		- É possível adicionar, alterar ou excluir ítens da lista
		- Possui as 4 funcionalidades <b>CRUD (Create, Read, Update, Delete)</b>
		- Em Java utilizamos a classe ArrayList com seus quatro métodos
			- .add() //Para adicionar um elemento à lista
			- .get() //Para pegar/ler um elemento à lista
			- .set() //Para alterar/configurar um elemento da lista
			- .remove() //Para remover um elemento da lista
		- Possui no mínimo 0 elementos
# Atividade 1 (Java x Excel)
- O Sr. Osmar Motta, planeja abrir uma loja de ferramentas.<br/> Para isso fez alguns orçamentos de preços dos produtos que deseja vender
<br/>Também fez estimativas de quantidades de produtos que precisa para iniciar o negócio.
<br/>Para ajudar o Sr. Osmar crie a uma solução orientada a objeto e também uma planilha que mostre as seguintes estatísticas:
	- 1. Calcule os subtotais (preço x quantidade)
	- 2. Calcule o total das vendas
	- 3. Obtenha a média de preços dos produtos
	- 4. Aponte o produto mais barado.
	- 5. Aponte o produto mais caro.
	- 6. Aponte o produto mais vendido.
- Diagrama de Classes:
<br/><img src="./uml_dc_vendas.png">
- Tabela com dados de teste para a planilha e o programa:
<table>
	<tr><th>Produto</th><th>Quantidade</th><th>Preço</th><th>Subtotal()</th></tr>
	<tr><td>Alicate</td><td>5</td><td>15,5</td><td></td></tr>
	<tr><td>Martelo</td><td>3</td><td>25,5</td><td></td></tr>
	<tr><td>Serrote</td><td>2</td><td>35,5</td><td></td></tr>
	<tr><td>Turquesa</td><td>2</td><td>18,0</td><td></td></tr>
	<tr><td>ChaveFenda</td><td>12</td><td>8,99</td><td></td></tr>
	<tr><td>ChaveBoca</td><td>8</td><td>8,99</td><td></td></tr>
	<tr><td>ChavePhilips</td><td>10</td><td>8,99</td><td></td></tr>
	<tr><td>Furadeira</td><td>4</td><td>350,5</td><td></td></tr>
	<tr><td>Lixadeira</td><td>2</td><td>255,9</td><td></td></tr>
	<tr><td>SerraMarmore</td><td>3</td><td>435,5</td><td></td></tr>
</table>

# Atividade 2 (Java x Excel)
- Após receber sua ajuda tecnológica, o Sr. Osmar decidiu empreender e abrir o seu comércio
<br/> foi até o Paraguai e comprou muitas mercadorias, porém agora precisa de uma planilha
<br/> para controlar seus investimentos e saber se terá lucro com os preços e quantidades que estimou.
<br/> Continue ajudando-o com um programa que:
	- 1. Calcule o investimento que o sr. Osmar fez em cada compra (precoCompra * qtdComprada)
	- 2. Calcule o faturamento que o sr. Osmar teve em cada venda (precoVenda * qtdVendida)
	- 3. Calcule o lucro em dinheiro para cada operação que o Sr. osmar teve (faturamento - investimento).
	- 4. Calcule o lucro em porcentagem para cada operação que o Sr. osmar teve
	- 5. Calcule o Investimento total do sr Osmar.
	- 6. Calcule o faturamento total do sr Osmar.
	- 7. Calcule e aponte se até o momento o Sr. Osmar está no lucro ou prejuíso em dinheiro e em porcentagem.

- Diagrama de Classes:
<br/><img src="./uml_dc_comercio.png">
- Tabela com dados de teste para a planilha e o programa:
<table>
	<tr><th>Produto</th><th>qtdComprada</th><th>qtdVendida</th><th>precoCompra</th><th>precoVenda</th><th>investimento</th><th>faturamento</th><th>lucro R$</th><th>lucro %</th></tr>
	<tr><td>Alicate</td><td>10</td><td>7</td><td>11,16</td><td>15,5</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>Martelo</td><td>10</td><td>6</td><td>13,77</td><td>25,5</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>Serrote</td><td>5</td><td>3</td><td>14,20</td><td>35,5</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>Turquesa</td><td>5</td><td>5</td><td>12,78</td><td>18</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>ChaveFenda</td><td>50</td><td>35</td><td>4,94</td><td>8,99</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>ChaveBoca</td><td>50</td><td>28</td><td>4,41</td><td>8,99</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>ChavePhilips</td><td>50</td><td>32</td><td>5,03</td><td>8,99</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>Furadeira</td><td>10</td><td>6</td><td>80,62</td><td>350,5</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>Lixadeira</td><td>5</td><td>3</td><td>102,36</td><td>255,9</td><td></td><td></td><td></td><td></td></tr>
	<tr><td>SerraMarmore</td><td>5</td><td>4</td><td>191,62</td><td>435,5</td><td></td><td></td><td></td><td></td></tr>
</table>