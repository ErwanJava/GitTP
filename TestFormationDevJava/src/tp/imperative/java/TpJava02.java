package tp.imperative.java;

public class TpJava02 {

	public static void main(String[] args) {
		/**/
		// conversion d'entier en flottant
		int nb = 1234;
		float nb2=nb;
		System.out.println(nb);
		System.out.println(nb2);
		
		int nb3 = 123456789;
		float nb4=nb3;
		System.out.println(nb3);
		System.out.println(nb4 +"\n\n");

		// calcul limites 
		float x=15f;
		float z=0f;
		float y= -123f; 
		float a= x/z;
		float b= y/z;
		float c = a/b;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
	}

}
