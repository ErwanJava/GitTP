package tp.poo.java.tp20to26;

import java.util.ArrayList;
import java.util.LinkedList;

import tp.poo.java.tp11to15.Segment;

public class MainTp20 {

	public static void main(String[] args) {
		Point pt= FigureUtil.getRandomPoint();
		pt.affiche();
		int length = FigureUtil.getRandomLength();
		System.out.println(length);
		Figure fig = FigureUtil.getRandomFigure();
		/*
		Point[] listPoints=fig.getPoints(); // ne fonctionne plus suite au changement de Point[] à LinkedList 
		System.out.println("Type de figure et taille du tableau de points :"+ FigureUtil.getType(fig) + ","+listPoints.length);
		for (Point p:listPoints) 
			System.out.println("coordonnees des points x=" + p.getX() +", y= "+p.getY());
		Figure fig1=FigureUtil.getRandomFigure();
		Figure fig2=FigureUtil.getRandomFigure();
		Figure fig3=FigureUtil.getRandomFigure();
		
		Figure[] tabFig= {fig1,fig2,fig3};
		for (Figure f:tabFig) {
			System.out.println("Type de figure :"+ FigureUtil.getType(f));
		}
		
		*/
	}

}
