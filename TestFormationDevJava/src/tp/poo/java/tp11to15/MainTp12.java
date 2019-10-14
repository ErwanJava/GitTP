package tp.poo.java.tp11to15;


public class MainTp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt= FigureUtil.getRandomPoint();
		pt.affiche();
		int length = FigureUtil.getRandomLength();

		CarreV0 square= new CarreV0(pt, length);
		square.affiche();
		CarreV1 square2= new CarreV1(pt, length);
		square2.affiche();
		RectangleV0 rect= new RectangleV0(pt, length, length+10);
		rect.affiche();
		RectangleV0 square3= new CarreV1(pt, length+10);
		square3.affiche();
	}

}
