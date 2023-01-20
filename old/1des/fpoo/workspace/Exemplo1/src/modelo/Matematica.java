package modelo;

public class Matematica {

	public static void main(String[] args) {
		int v1 = 13;
		int v2 = 3;
		int e = (int) Math.pow(v1, v2);
		float raiz = (float) Math.sqrt(e);
		
		System.out.printf("%d + %d = %d\n",v1,v2,v1+v2);
		System.out.printf("%d - %d = %d\n",v1,v2,v1-v2);
		System.out.printf("%d x %d = %d\n",v1,v2,v1*v2);
		System.out.printf("%d / %d = %d\n",v1,v2,v1/v2);
		System.out.printf("O resto é %d\n",v1%v2);
		System.out.printf("%d elevado a %d é %d\n",v1,v2,e);
		System.out.printf("A raiz de %d é %.2f\n",e,raiz);
	}
}
