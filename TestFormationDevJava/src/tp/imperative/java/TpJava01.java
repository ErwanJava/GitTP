package tp.imperative.java;
import java.util.Arrays;

public class TpJava01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* */
		System.out.println("Hello world!");
		 
		for (int i =0; i<3; i++)
		{
			System.out.println(("args["+i+"] => "+args[i]));
		}
		
		long x= 165415415415415l;
		
		//Conversion en maj via la valeur ASCII décimale d'un caractère
		char a = 'a';
		char upperA= (char) (a-32);
		System.out.println(upperA);
		
		char[] tc= {'t','y','u','i'};
		int[] ti= {1,2,3,4};
		System.out.println(tc);
		for (int tt:ti) System.out.println(tt);
	}

}
