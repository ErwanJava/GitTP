package tp.poo.java.tp20to26;

import java.util.LinkedList;

public abstract class Figure {
	
	protected Point point;
	protected int distance;
	protected int nbPoints;
	
	public Figure(Point pt, int l) {
		this.point = pt;
		this.distance = l;
	}
	
	public Point getPoint() {
		return this.point;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	abstract public LinkedList<Point> getPoints();
	
	public double distanceOrigine() {
		Point origin= new Point();
		double distanceOrigin=100000; 
		for(Point point : this.getPoints()) {
			if(point.distance(origin)<distanceOrigin)
				distanceOrigin = point.distance(origin);
		}
		return distanceOrigin;
	}
	public abstract boolean equals(Object obj);
	
	abstract boolean couvre(Point pTest); 

	@Override
	public String toString() {
		return "Figure with coordinates:";
	}

	public void affiche() {
		System.out.println(this.toString());
	}

}

