package tp.poo.java.tp10;

public class Rectangle {
	private Point pt;
	private int largeur;
	private int longueur;
	
	public Rectangle(Point pt, int largeur, int longueur) {
		super();
		this.pt = pt;
		this.largeur = largeur;
		this.longueur = longueur;
	}
	public Point getPt() {
		return pt;
	}
	public void setPt(Point pt) {
		this.pt = pt;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
	public Point getPointBasGauche() {
		return new Point(pt.getX()-largeur,pt.getY()-longueur);
	}
	
	public Point getPointBasDroit() {
		return new Point(pt.getX()+largeur,pt.getY()-longueur);
	}
	
	public Point getPointHautGauche() {
		return new Point(pt.getX()-largeur,pt.getY()+longueur);
	}
	
	public Point getPointHautDroit() {
		return new Point(pt.getX()+largeur,pt.getY()+longueur);
	}
	
	@Override
	public String toString() {
		return "[Rect " + getPointBasGauche() + "," + getPointBasDroit() + ","+ getPointHautGauche() + "," + getPointHautDroit() + "]";
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	

}
