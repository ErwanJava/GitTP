package tp.poo.java.tp11to15;

public class MainTp11 {

	public static void main(String[] args) {
		Point pt= FigureUtil.getRandomPoint();
		pt.affiche();
		Rond rnd = FigureUtil.getRandomRond();
		rnd.affiche();
		Rectangle rect = FigureUtil.getRandomRectangle();
		rect.affiche();
		System.out.println(FigureUtil.getType(rect));
		

	}

}
