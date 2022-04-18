package visoes;

import modelos.Casa;
import modelos.CasaBuilder;

public class Cliente {
	
	private static Casa casa1;
	private static Casa casa2;
	private static Casa casa3;
	private static CasaBuilder builder;

	public static void main(String[] args) {
		
		builder = new CasaBuilder();
		casa1 = builder.getCasa();
		casa2 = builder.getCasa();
		casa3 = new Casa(1,"Edicula",3,(float)2.6);
		
		System.out.println(casa1);
		System.out.println(casa2);
		System.out.println(casa3);
		

	}

}
