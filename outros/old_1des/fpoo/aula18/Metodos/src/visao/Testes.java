package visao;

import modelo.Excel;

public class Testes {

	public static void main(String[] args) {
		Excel mat = new Excel();
		double vals[] = { 10, 45, 18, 3.5, 78, 95, 15.35 };
		System.out.println(mat.soma(vals));
		System.out.println(mat.media(vals));
		System.out.println(mat.maximo(vals));
		System.out.println(mat.minimo(vals));
		System.out.println(mat.hoje());
		System.out.println(mat.hojeSimples());
		System.out.println(mat.agora());
		System.out.println(mat.agoraAmPm());
	}

}
