package tp.imperative.java;

import java.util.Scanner;

public class TpJava04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Votre valeur (1, 2 ou supérieur à 2): ");
			String str = sc.next();
			
			/*
			float value = Float.parseFloat(str);
			float discount;
			System.out.println("Votre valeur : "+ value +"€");
			
			if (value < 1000) {
				discount=0.0f;
				}	else if (value >=1000 && value< 2000) {
					discount=1.0f;
				}	else if (value >=2000 && value< 5000) {
					discount=3.0f;
				}	else {
					discount=5.0f;
				}
					
			System.out.println("Votre remise est de : "+ discount +"%");
			*/
			int val = Integer.parseInt(str);
			System.out.println("Votre valeur : "+ val +"kg");
			switch (val) {
			case (1) :
			  System.out.println("Votre poids est : petit "); break;
			case (2) :
				  System.out.println("Votre poids est : moyen ");break;
			default :
				  System.out.println("Votre poids est : grand ");
			}
		}

	}

}
