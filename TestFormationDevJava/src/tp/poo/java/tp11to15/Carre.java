package tp.poo.java.tp11to15;

public class Carre extends Figure implements Surfacable {
	
	public Carre(Point pt, int distance) {
		super(pt,distance);
	}
	public void setPt(Point pt) {
		this.pt = pt;
	}
	public void setLargeur(int largeur) {
		this.distance = largeur;
	}

	public Point getPointBasGauche() {
		return new Point(pt.getX()-distance,pt.getY()-distance);
	}
	
	public Point getPointBasDroit() {
		return new Point(pt.getX()+distance,pt.getY()-distance);
	}
	
	public Point getPointHautGauche() {
		return new Point(pt.getX()-distance,pt.getY()+distance);
	}
	
	public Point getPointHautDroit() {
		return new Point(pt.getX()+distance,pt.getY()+distance);
	}
	
	public double surface() {
		double surf=distance*distance;
		return surf;
	}
	
	public String toString() {
		return "["+FigureUtil.getType(this) + getPointBasGauche() + "," + getPointBasDroit() + ","+ getPointHautGauche() + "," + getPointHautDroit()+", sidelength = "+getLength() + "]";
	}
	



}
