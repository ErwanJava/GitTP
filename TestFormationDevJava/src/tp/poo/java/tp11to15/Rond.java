package tp.poo.java.tp11to15;

public class Rond extends Figure implements Surfacable {
	/*private Point pt;		// cette déclaration est non seulement inutile, mais ambigue. Attention !
	private int radius;		//pour le rond, le rayon est considéré comme équivalent à la longueur distance, 
	// mais attention, pratique pas très bonne qui risque de perdre les collègues qui vont reprendre
	*/
	public Rond(Point pt, int distance) {
		super(pt,distance);
	}

	public void setPt(Point pt) {
		this.pt = pt;
	}

	public int getRadius() {		// juste equivalent à getLength() de la classe mère, ne sert à rien !
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