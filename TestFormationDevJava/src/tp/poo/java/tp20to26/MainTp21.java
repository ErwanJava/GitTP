package tp.poo.java.tp20to26;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainTp21 {
	public static void main(String[] args) {

	Dessin tabFig= FigureUtil.genere(4);
	for (Figure f:tabFig.getFigures()) {
		System.out.println("Type de figure :"+ FigureUtil.getType(f));
	}

	LinkedList<Point> listPoints = FigureUtil.getPoints(tabFig);
	for(Point pt : listPoints) {
		pt.affiche();
		}
	}
}
