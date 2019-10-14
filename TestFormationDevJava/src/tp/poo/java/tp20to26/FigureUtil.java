package tp.poo.java.tp20to26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
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
		Point pt = new Point((int)(Math.random()*100),(int)(Math.random()*100));
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
		int choice = (int)(Math.random()*4); //renvoie un int entre 0 et 3
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

/*	Methode retravaillee ensuite avec les List
	protected static Point[] getPoints(Figure... tabFig) {
		// on commence par trouver le nb de points pour chq fig et donc la taille totale du tableau de points
		int nbPts=0;
		for (Figure fig: tabFig) {
			nbPts+=fig.getPoints().length; 
		}
		System.out.println("nb points "+nbPts);
		//on construit le tableau de points et on le remplit avec les coordonnees existantes
		Point[] listPoints= new Point[nbPts];
		int index=0;
		
		for (Figure fig: tabFig) {
			for(int i=0;i<fig.getPoints().length;i++) {
				listPoints[index]=fig.getPoints()[i]; 
				index++;
			}
			
		}
	return listPoints;
			
	}
	*/
	protected static Dessin genere(int x){
		Dessin listFigure= new Dessin();
		for (int i=0; i<x;i++) {
				Figure fig=getRandomFigure();
				if (!listFigure.add(fig)) return null; // comme le if est execute, l'instruction add marche quoi qu'il en soit
		} 
		return listFigure;
	}
	
	// On choisit une LinkedList parce qu'on préserve l'ordre si besoin ensuite pour le dessin 
	protected static LinkedList<Point> getPoints(Dessin tabFig) {
		LinkedList<Point> listPoints= new LinkedList<Point>();
		
		for (Figure fig: tabFig.getFigures()) {
				listPoints.addAll(fig.getPoints());
		}
			
		return listPoints;
			
	}
	
	protected static Figure getFigureEn(Point pTest, Dessin dess) {
		Iterator<Figure> iter = dess.getFigures().iterator();
		Figure fig =null ;
		boolean isCovered = false;
		while(iter.hasNext() && !isCovered) {
			fig=iter.next();
			if(fig.couvre(pTest)) {
				isCovered = true;
			}
		} 
		if(isCovered)
			return fig;
		else return null;
		
	}
	
}


