package tp.imperative.java;

import java.util.Scanner;

public class TpJava06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Votre valeur (entière): ");
			int val = sc.nextInt();
			float result = 1;
			for (int i = 1; i <= val; i++) {
				result *= i;
			}
			System.out.println("La factorielle de votre valeur est: " + result);
		}
	}

}
