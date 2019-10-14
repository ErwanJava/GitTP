package tp.poo.java.tp11to15;

public class MainTp15 {

	public static void main(String[] args) {
		Point pt= FigureUtil.getRandomPoint();
		pt.affiche();
		int length = FigureUtil.getRandomLength();
		System.out.println(length);
	
		Segment sgmt = new Segment(pt, length,true);
		sgmt.affiche();

		Segment sgmt2 = new Segment(pt, length,false);
		sgmt2.affiche();
		
		Segment sgmt3 = FigureUtil.getRandomSegment();
		sgmt3.affiche();
		
		Rond rnd2 = new Rond(pt, length);
		rnd2.affiche();
		System.out.println("surface d'un rond :"+rnd2.surface());
		
		Carre square= new Carre(pt, length);
		square.affiche();
		System.out.println("surface d'un cercle :"+square.surface());
		
		Rectangle rect= new Rectangle(pt, length, length+10);
		rect.affiche();
		System.out.println("surface d'un rectangle :"+rect.surface());

		
		
	}

}
