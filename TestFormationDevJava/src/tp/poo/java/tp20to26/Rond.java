package tp.poo.java.tp20to26;

import java.util.LinkedList;

public class Rond extends Figure implements Surfacable {
	/*
	 * private Point pt; // cette déclaration est non seulement inutile, mais
	 * ambigue. Attention ! private int radius; //pour le rond, le rayon est
	 * considéré comme équivalent à la longueur distance, // mais attention,
	 * pratique pas très bonne qui risque de perdre les collègues qui vont reprendre
	 */
	public Rond(Point pt, int distance) {
		super(pt, distance);
	}

	public void setPt(Point pt) {
		this.point = pt;
	}

	public int getRadius() { // juste equivalent à getLength() de la classe mère, ne sert à rien !
		return distance;
	}

	public void setRadius(int distance) {
		this.distance = distance;
	}

	public double surface() {
		double surf = distance * distance * pi;
		return surf;
	}

	public LinkedList<Point> getPoints() {
		LinkedList<Point> listPoints = new LinkedList<Point>();
		listPoints.add(this.getPoint());
		return listPoints;
	}

	public boolean couvre(Point pTest) {
		if (pTest.getX() <= (point.getX() + distance) && pTest.getX() >= (point.getX() - distance)
				&& pTest.getY() <= (point.getY() + distance) && pTest.getY() >= (point.getY() - distance)) {
			return true;
		} else
			return false;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rond other = (Rond) obj;
		return this.getPoint().equals(other.getPoint()) && this.getRadius() == other.getRadius();
	}

	
	public String toString() {
		return "[Rond [" + point.getX() + "," + point.getY() + "], radius=" + getRadius() + "]";
	}

}