package tp.poo.java.tp20to26;

import java.util.LinkedList;

public class Carre extends Rectangle implements Surfacable {

	public Carre(Point pt, int distance) {
		super(pt, distance, distance);
	}

	public void setPt(Point pt) {
		this.point = pt;
	}

	public void setLargeur(int largeur) {
		this.distance = largeur;
	}

	public Point getPointBasGauche() {
		return new Point(point.getX() - distance, point.getY() - distance);
	}

	public Point getPointBasDroit() {
		return new Point(point.getX() + distance, point.getY() - distance);
	}

	public Point getPointHautGauche() {
		return new Point(point.getX() - distance, point.getY() + distance);
	}

	public Point getPointHautDroit() {
		return new Point(point.getX() + distance, point.getY() + distance);
	}

	public double surface() {
		double surf = distance * distance;
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
		if (pTest.getX() <= (point.getX() + distance) && pTest.getX() >= (point.getX() - distance)
				&& pTest.getY() <= (point.getY() + distance) && pTest.getY() >= (point.getY() - distance)) {
			return true;
		} else
			return false;
	}

//	public String toString() {
//		return "[" + FigureUtil.getType(this) + getPointBasGauche() + "," + getPointBasDroit() + ","
//				+ getPointHautGauche() + "," + getPointHautDroit() + ", sidelength = " + getDistance() + "]";
//	}

}