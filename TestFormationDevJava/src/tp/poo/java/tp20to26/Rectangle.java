package tp.poo.java.tp20to26;

import java.util.LinkedList;

public class Rectangle extends Figure implements Surfacable {
	private int largeur;
	private int longueur;

	public Rectangle(Point pt, int distance, int largeur) {
		super(pt, distance);
		longueur = distance;
		this.largeur = largeur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.distance = largeur;
	}

	public Point getPointBasGauche() {
		return new Point(point.getX() - longueur, point.getY() - largeur);
	}

	public Point getPointBasDroit() {
		return new Point(point.getX() + longueur, point.getY() - largeur);
	}

	public Point getPointHautGauche() {
		return new Point(point.getX() - longueur, point.getY() + largeur);
	}

	public Point getPointHautDroit() {
		return new Point(point.getX() + longueur, point.getY() + largeur);
	}

	public double surface() {
		double surf = longueur * largeur;
		return surf;
	}

	public LinkedList<Point> getPoints() {
		LinkedList<Point> listPoints = new LinkedList<Point>();
		listPoints.add(this.getPointBasGauche());
		listPoints.add(this.getPointBasDroit());
		listPoints.add(this.getPointHautGauche());
		listPoints.add(this.getPointHautDroit());
		return listPoints;
	}

	public boolean couvre(Point pTest) {
		if (pTest.getX() <= (point.getX() + longueur) && pTest.getX() >= (point.getX() - longueur)
				&& pTest.getY() <= (point.getY() + largeur) && pTest.getY() >= (point.getY() - largeur)) {
			return true;
		} else
			return false;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		return this.getPointBasGauche().equals(other.getPointBasGauche())
				&& this.getPointBasDroit().equals(other.getPointBasDroit())
				&& this.getPointHautGauche().equals(other.getPointHautGauche())
				&& this.getPointHautDroit().equals(other.getPointHautDroit());
	}

	public String toString() {
		return "[" + FigureUtil.getType(this) + getPointBasGauche() + "," + getPointBasDroit() + ","
				+ getPointHautGauche() + "," + getPointHautDroit() + ", length =" + getDistance() + ", width ="
				+ getLargeur() + "]";
	}

}
