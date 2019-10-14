package tp.poo.java.tp11to15;

public class Point {
	private int x;
	private int y;
	private static final int INIT_X = 25;
	private static final int INIT_Y = 25;
	
	public Point() {
		super();
		x=INIT_X;
		y=INIT_Y;
	}
	
	public Point(int abs, int ord) {
		x=abs;
		y=ord;
	}
		
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
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
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	public void affiche() {
		System.out.println("The point has coordinates: "+ this.toString());
	}
	

}
