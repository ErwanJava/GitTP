package tp.poo.java.tp20to26;

import java.util.LinkedList;

public class MainTp22 {
	public static void main(String[] args) {
		// test de la méthode couvre(Point)
		/*
		Dessin tabFig= FigureUtil.genere(1);
		for (Figure f:tabFig.getFigures()) {
			System.out.println("Type de figure :"+ FigureUtil.getType(f));
		}

		LinkedList<Point> listPoints = FigureUtil.getPoints(tabFig);
		for(Point pt : listPoints) {
			pt.affiche();
			}
		Point pTest=FigureUtil.getRandomPoint();
		pTest.affiche();
		System.out.println(tabFig.getFigures().get(0).couvre(pTest));
		*/
		
		// test de la méthode getFigureEn(Point, Dessin)
		
		Dessin tabFig2= FigureUtil.genere(2);
		for (Figure f:tabFig2.getFigures()) {
			System.out.println("Type de figure :"+ FigureUtil.getType(f));
		}

		LinkedList<Point> listPoints2 = FigureUtil.getPoints(tabFig2);
		System.out.println("Coordonnees des figures ");
		for(Point pt : listPoints2) {
			pt.affiche();
			}
		
		Point pTest2=FigureUtil.getRandomPoint();
		System.out.println("Coordonnees du point test ");
		pTest2.affiche();
		
		Figure figEn=FigureUtil.getFigureEn(pTest2, tabFig2);
		if (figEn!=null) {
			System.out.println("Quelle figure couvre le point ? ");
			figEn.affiche();
			}
		else
			System.out.println("Aucune figure ne couvre le point  ");
		
	}
}
