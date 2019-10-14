package tp.poo.java.tp11to15;

public class Rectangle extends Figure implements Surfacable {
	private int largeur;
	private int longueur;
	
	public Rectangle (Point pt, int distance, int largeur) {
		super(pt, distance);
		longueur =distance;
		this.largeur=largeur;
	}
	
	public int getLargeur() {
		return largeur;
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
		double surf=longueur*largeur;
		return surf;
	}
	
	public String toString() {
		return "["+FigureUtil.getType(this) + getPointBasGauche() + "," + getPointBasDroit() + ","+ getPointHautGauche() + "," + getPointHautDroit() +", length ="+getLength()+", width ="+getLargeur()+ "]";
	}


}
