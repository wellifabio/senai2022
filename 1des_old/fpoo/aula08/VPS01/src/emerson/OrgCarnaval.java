package emerson;

/*
*Organização do Carnaval do Rio de Jaqueiro.
*Você foi contratado para desenvolver soluções para a equipe organizadora do carnaval do Rio de Jaqueiro, para isso deve desenvolver um programa que solucione os quatro requisitos a seguir.O programa deve contar com uma estrutura de menu (Utilizando Switch/Case), onde o usuário selecione o problema a ser resolvido;
(1 Horas Extras, 2 Apuração, 3 Matérias Primas, 4 Blocos, 5 Sair)
*/
import java.io.IOException;
import java.util.Scanner;

public class OrgCarnaval {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int menu = 0;
		while (menu != 5) {
			System.out.println("###########Menu de calculos###########");
			System.out.println("1-Horas extras\n2-Apuração\n3-Matérias Primas\n4-Bloco\n5-Sair");
			menu = read.nextInt();
			switch (menu) {
			case 1:
				/*
				 * A escola de samba unidos do JAVA está com dificuldade para gerenciar o
				 * pagamento de seus funcionários, devido ao aumento das horas extras. Para
				 * auxiliá-los crie um algoritmo que receba o total de horas e horas extras
				 * trabalhadas no mês e informe o valor do salário reajustado. Leve em
				 * consideração que todos recebem em média R$ 5,625 por hora trabalhada e que a
				 * hora extra vale 75% a mais do valor original.
				 */
				System.out.print("Informe a quantidade de horas normais trabalhadas no mês: ");
				double hn = read.nextDouble(); // hn = hora normal
				System.out.print("Informe a quantidade de horas excedidas trabalhadas no mês: ");
				double he = read.nextDouble(); // he = hora extra

				double hec = (5.625 * he) * 75 / 100 + (5.625 * he); // hec = hora extra calculada
				System.out.printf("Valor de Horas Extras a receber: %.3f\n", hec);
				double total = 5.625 * hn + hec;
				System.out.printf("Salário total a receber: %.3f\n", total);
				break;
			case 2:
				/*
				 * A academia de artes carnavalescas precisa de um sistema que armazene o nome
				 * das escolas de samba concorrentes e os pontos obtidos nas categorias:
				 * bateria, samba-enredo e fantasias, e no final da apuração informe o nome da
				 * escola, a média dos pontos obtidos e a escola campeã. Sabe-se que 5 escolas
				 * de samba estão competindo e que os pontos de cada categoria vão de 0 a 10.
				 */
				System.out.println("Quantas escolas vão ser avaliadas? ");
				int escola = read.nextInt();
				String[] nome = new String[escola];
				int[] nota = new int[escola];
				int[] bateria = new int[escola];
				int[] sambaenredo = new int[escola];
				int[] fantasia = new int[escola];

				for (int i = 0; i < escola; i++) {
					System.out.print("Nome da escola: " + i);
					nome[i] = read.next();
					System.out.print("Informe os pontos obtidos por categaoria\nBateria: ");
					bateria[i] = read.nextInt();
					System.out.print("Samba Enredo: ");
					sambaenredo[i] = read.nextInt();
					System.out.print("Fantasia: ");
					fantasia[i] = read.nextInt();

					int tn = sambaenredo[i] + fantasia[i] + bateria[i]; // tn = total das notas obtidas.
					System.out.println("pontos obtidos: " + tn);

				}

				break;
			case 3:
				/*
				 * A escola Rosas de Café está passando por problemas financeiros e precisa da
				 * sua ajuda. Atualmente foi verificado que estão gastando além do estimado com
				 * as matérias-primas utilizadas nas fantasias. Antes de tomar qualquer decisão
				 * estratégica precisam identificar onde está o maior gasto. Receba do usuário a
				 * quantidade utilizada em quilo dos materiais, seu valor e o valor estimado
				 * para ser utilizado e informe a relação dos materiais e se o valor está
				 * excedendo o valor previsto. Sabe-se que as matérias-primas são: Lantejoulas,
				 * Penas de Avestruz do Himalaia e tecido de seda Húngara (Mostrar as matérias
				 * primas mais caras primeiro - ordem decrescente).
				 */

				break;
			case 4:
				/*
				 * Para organizar o desfile da escola Imperatriz HTML, será necessário separar
				 * as pessoas nos blocos que irão se apresentar. Receba do usuário o total de pe
				 */
				break;
			default:
				break;
			}
		}
	}
}