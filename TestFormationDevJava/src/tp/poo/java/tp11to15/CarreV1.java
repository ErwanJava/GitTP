package tp.poo.java.tp11to15;
import tp.poo.java.tp11to15.Point;
import tp.poo.java.tp11to15.RectangleV0;

public class CarreV1 extends RectangleV0 {
	
	
	public CarreV1(Point pt, int cote) {
		super(pt,cote,cote);
	}

	public String toString() {
		return "["+FigureUtil.getType(this) + getPointBasGauche() + "," + getPointBasDroit() + ","+ getPointHautGauche() + "," + getPointHautDroit()+", sidelength = "+getLargeur() + "]";
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
}
