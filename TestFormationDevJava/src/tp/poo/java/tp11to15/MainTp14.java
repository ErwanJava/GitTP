package tp.poo.java.tp11to15;

public class MainTp14 {

	public static void main(String[] args) {
		Point pt= FigureUtil.getRandomPoint();
		pt.affiche();
		int length = FigureUtil.getRandomLength();
		System.out.println(length);
		
		Figure rnd = new Rond(pt, length);
		rnd.affiche();
		
		Rond rnd2 = new Rond(pt, length);
		rnd2.affiche();
		
		Carre square= new Carre(pt, length);
		square.affiche();
		
		Rectangle rect= new Rectangle(pt, length, length+10);
		rect.affiche();

	}

}
