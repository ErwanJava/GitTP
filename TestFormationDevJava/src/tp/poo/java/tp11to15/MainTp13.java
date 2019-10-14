package tp.poo.java.tp11to15;

public class MainTp13 {

	public static void main(String[] args) {
		Point pt= FigureUtil.getRandomPoint();
		Point pt2= FigureUtil.getRandomPoint();
		
		System.out.println("The point pt2 is equal to pt ? " + pt2.equals(pt));
		
		pt2=pt;
		System.out.println("The point pt2 is equal to pt ? " + pt2.equals(pt));
		

	}

}
