package tp.poo.java.tp11to15;

public class Rond extends Figure implements Surfacable {
	/*private Point pt;		// cette d�claration est non seulement inutile, mais ambigue. Attention !
	private int radius;		//pour le rond, le rayon est consid�r� comme �quivalent � la longueur distance, 
	// mais attention, pratique pas tr�s bonne qui risque de perdre les coll�gues qui vont reprendre
	*/
	public Rond(Point pt, int distance) {
		super(pt,distance);
	}

	public void setPt(Point pt) {
		this.pt = pt;
	}

	public int getRadius() {		// juste equivalent � getLength() de la classe m�re, ne sert � rien !
		return distance;
	}

	public void setRadius(int distance) {
		this.distance = distance;
	}
	
	public double surface() {
		double surf=distance*distance*pi;
		return surf;
	}

	@Override
	public String toString() {
		return "[Rond [" + pt.getX() +","+ pt.getY() + "], radius=" + distance + "]" ;
	}
	
	
	

}