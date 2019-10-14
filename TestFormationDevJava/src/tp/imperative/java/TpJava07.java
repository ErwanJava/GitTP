package tp.imperative.java;

import java.util.Scanner;

public class TpJava07 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Votre valeur (entière): ");
			int val = sc.nextInt(); // valeur entrée par l'utilisateur

			System.out.println("Les " + val + " nombres premiers sont: ");

			int loops = 1; // nb de boucles pour atteindre val
			int premier = 3; // nb qui est testé s'il est premier
			System.out.println(2); // on gère le cas particulier de 2

			do {
				boolean estPremier=true;
				int diviseur = 2; // diviseur qui teste le nb premier
				while (diviseur < premier) {
					if (premier % diviseur == 0) {
						estPremier=false;
					}
					diviseur++;
				}
				if (estPremier) {
					System.out.println(premier);
					loops++;
				}
				premier++;
			} while (loops < val);
		}
	}

}
