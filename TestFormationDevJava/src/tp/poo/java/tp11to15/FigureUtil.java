package tp.poo.java.tp11to15;

import java.util.Random;

/* Tentative de travailler sur deux packages simultanément, mais comme les noms de classes sont les mêmes, 
 * ça embrouille à la compilation et à la compréhension. Solution choisie, on duplique 
import tp.poo.java.tp10.Point;
import tp.poo.java.tp10.Rectangle;
import tp.poo.java.tp10.Rond;
*/

public class FigureUtil {
	
	public static int getRandomLength() {
		int length = (int)(Math.random()*50);
		return length;
	}
	public static Point getRandomPoint() {
		Point pt = new Point((int)(Math.random()*50),(int)(Math.random()*50));
		return pt;
	}
	
	public static Rond getRandomRond() {
		Point pt = getRandomPoint();
		int r = (int)(Math.random()*50);
		Rond rnd= new Rond(pt, r);
		return rnd;
	}
	public static Carre getRandomCarre() {
		Point pt = getRandomPoint();
		int r = (int)(Math.random()*50);
		Carre sqr= new Carre(pt, r);
		return sqr;
	}
	
	public static Rectangle getRandomRectangle() {
		Point pt = getRandomPoint();
		int largeur = (int)(Math.random()*50);
		int longueur = (int)(Math.random()*50);
		Rectangle rect= new Rectangle(pt, largeur, longueur);
		return rect;
	}
	
	public static Segment getRandomSegment() {
		Point start = getRandomPoint();
		int l = (int)(Math.random()*50);
		Random rd = new Random();
		boolean bool = rd.nextBoolean();
		Segment sgm= new Segment(start, l, bool);
		return sgm;
	}

	
	public static String getType(Object o) {
		return o.getClass().getSimpleName();
	}
	
	protected static Figure getRandomFigure() {
		//Choix aleatoire de la figure
		int choice = (int)(Math.random()*3); //renvoie un int entre 0 et 2
		switch (choice) {
		case(0) : 
			return getRandomRond();
		case(1) : 
			return getRandomCarre();
		case(2) : 
			return getRandomRectangle();
		case(3) : 
			return getRandomSegment();
		default :							// oblige pour le fonctionnement de switch
			return null;			
		}
	}
	
	protected static Surfacable getRandomSurfacable() {
		//Choix aleatoire de la figure
		int choice = (int)(Math.random()*3); //renvoie un int entre 0 et 2
		switch (choice) {
		case(0) : 
			return getRandomRond();
		case(1) : 
			return getRandomCarre();
		case(2) : 
			return getRandomRectangle();
		default :							// oblige pour le fonctionnement de switch
			return null;			
		}
		
	}
	


}
