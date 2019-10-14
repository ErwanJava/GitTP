package tp.poo.java.tp11to15;

public class Segment extends Figure {
	private boolean horizontal;
	private Point end = new Point(0,0);
	
	public Segment(Point start, int length, boolean horizontal) {
		super(start, length);
		this.setHorizontal(horizontal);
		
		if (horizontal) {
			end.setX(start.getX()+length);
			end.setY(start.getY());
		}
		else {
			end.setX(start.getX());
			end.setY(start.getY()+length);
		} 
	}
		
	public boolean getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	public Point getPointEnd() {
		return end;
	}
	
	public String toString() {
		return "["+FigureUtil.getType(this) + getPoint() + " a " + getPointEnd() +", length ="+getLength()+ "]";
	}

	

}
