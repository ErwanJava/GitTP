package tp.poo.java.tp20to26;

import java.util.LinkedList;

public class MainTp23 {

	public static void main(String[] args) {
		// Vérification des méthodes equals des objets
		Dessin tabFig2 = FigureUtil.genere(4);
		tabFig2.add(tabFig2.getFigures().get(2));
		tabFig2.add(tabFig2.getFigures().get(3));

		for (Figure f : tabFig2.getFigures()) {
			System.out.println("Type de figure :"+ FigureUtil.getType(f)); 
			System.out.println("Figure : " + f);

		}
		//générait des StackOverflowError à cause d'une méthode récursive dans Point.getPoint()
		LinkedList<Point> listPoints2 = FigureUtil.getPoints(tabFig2);
		System.out.println("Coordonnees des figures ");
		for (Point pt : listPoints2) {
			pt.affiche();
		}
		System.out.println("taille de la liste : " + tabFig2.getFigures().size());

		// test des egalites
		System.out.println("La figure 1 est égale à la figure 2 ? "
				+ tabFig2.getFigures().get(0).equals(tabFig2.getFigures().get(1)));
		System.out.println("La figure 1 est égale à la figure 5 ? "
				+ tabFig2.getFigures().get(0).equals(tabFig2.getFigures().get(4)));
		System.out.println("La figure 1 est égale à la figure 1 ? "
				+ tabFig2.getFigures().get(0).equals(tabFig2.getFigures().get(0)));
		System.out.println("La figure 4 est égale à la figure 6 ? "
				+ tabFig2.getFigures().get(3).equals(tabFig2.getFigures().get(5)));
		System.out.println("La figure 2 est égale à la figure 6 ? "
				+ tabFig2.getFigures().get(2).equals(tabFig2.getFigures().get(5)));
		System.out.println("La figure 2 est égale à la figure 5 ? "
				+ tabFig2.getFigures().get(2).equals(tabFig2.getFigures().get(4)));

	}

}
