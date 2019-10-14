package tp.poo.java.tp11to15;

public abstract class Figure {
	
	protected Point pt;
	protected int distance;
	
	public Figure(Point pt, int l) {
		this.pt = pt;
		this.distance = l;
	}
	
	public int getX() {
		return this.getX();
	}
	
	public int getY() {
		return this.getY();
	}
	
	public Point getPoint() {
		return this.pt;
	}
	
	public int getLength() {
		return this.distance;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return this.getX() == other.getX() && this.getY() == other.getY();
	}

	@Override
	public String toString() {
		return "Figure with coordinates:";
	}

	public void affiche() {
		System.out.println(this.toString());
	}

	

}
