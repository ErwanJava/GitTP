package tp.poo.java.tp10;

public class Rond {
	private Point pt;
	private int radius;
	
	public Rond(Point pt, int radius) {
		super();
		this.pt = pt;
		this.radius = radius;
	}

	public Point getPt() {
		return pt;
	}

	public void setPt(Point pt) {
		this.pt = pt;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Rond [" + pt.getX() +","+ pt.getY() + "], radius=" + radius ;
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	
	

}
