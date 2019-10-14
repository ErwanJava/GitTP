package tp.poo.java.tp11to15;

import tp.poo.java.tp11to15.Point;

public class CarreV0 {
	private Point pt;
	private int sideLength;
	
	public CarreV0(Point pt, int cote) {
		this.pt=pt;
		this.sideLength=cote;
	}
	
	public Point getPt() {
		return pt;
	}
	public void setPt(Point pt) {
		this.pt = pt;
	}
	public int getLargeur() {
		return sideLength;
	}
	public void setLargeur(int largeur) {
		this.sideLength = largeur;
	}

	public Point getPointBasGauche() {
		return new Point(pt.getX()-sideLength,pt.getY()-sideLength);
	}
	
	public Point getPointBasDroit() {
		return new Point(pt.getX()+sideLength,pt.getY()-sideLength);
	}
	
	public Point getPointHautGauche() {
		return new Point(pt.getX()-sideLength,pt.getY()+sideLength);
	}
	
	public Point getPointHautDroit() {
		return new Point(pt.getX()+sideLength,pt.getY()+sideLength);
	}
	
	@Override
	public String toString() {
		return "[Carre " + getPointBasGauche() + "," + getPointBasDroit() + ","+ getPointHautGauche() + "," + getPointHautDroit()+", sidelength = "+sideLength + "]";
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	

}
