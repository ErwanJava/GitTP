package tp.poo.java.tp10;

public class Point {
	private int x;
	private int y;
	
	public Point(int abs, int ord) {
		super();
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
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	public void affiche() {
		System.out.println("The point has coordinates: "+ this.toString());
	}
	

}
