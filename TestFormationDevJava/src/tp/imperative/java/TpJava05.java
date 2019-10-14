package tp.imperative.java;

import java.util.Scanner;

public class TpJava05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try (Scanner sc = new Scanner(System.in)){
			System.out.println("Votre valeur (entière): ");
			String str = sc.next();
			int val = Integer.parseInt(str);
			int x=1;
			do {
				System.out.println(x+"\n");
				x++;
			} while (x <= val);
		}
		
	}

}
