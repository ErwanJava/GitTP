package tp.poo.java.tp20to26;

import java.util.LinkedList;

public class Segment extends Figure {
	private boolean horizontal;
	private Point end = new Point(0, 0);

	public Segment(Point start, int distance, boolean horizontal) {
		super(start, distance);
		this.setHorizontal(horizontal);

		if (horizontal) {
			end.setX(start.getX() + distance);
			end.setY(start.getY());
		} else {
			end.setX(start.getX());
			end.setY(start.getY() + distance);
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

	public LinkedList<Point> getPoints() {
		LinkedList<Point> listPoints = new LinkedList<Point>();
		listPoints.add(this.getPoint());
		listPoints.add(this.getPointEnd());
		return listPoints;
	}

	public boolean couvre(Point pTest) {
		if (pTest.getX() <= (point.getX() + distance) && pTest.getX() >= (point.getX() - distance)
				&& pTest.getY() <= (point.getY() + distance) && pTest.getY() >= (point.getY() - distance)) {
			return true;
		} else
			return false;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segment other = (Segment) obj;
		return this.getPoint().equals(other.getPoint()) && this.getPointEnd().equals(other.getPointEnd());
	}

	public String toString() {
		return "[" + FigureUtil.getType(this) + getPoint() + " a " + getPointEnd() + ", distance =" + getDistance()
				+ "]";
	}

}
