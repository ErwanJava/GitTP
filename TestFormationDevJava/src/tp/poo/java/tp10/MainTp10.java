package tp.poo.java.tp10;

public class MainTp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point origin = new Point(0,0);
		System.out.println(origin.toString());
		origin.affiche();
		
		
		Rond circleOrigin = new Rond(origin, 10);
		circleOrigin.affiche();
		
		Rectangle rectOrigin = new Rectangle(origin, 30,40);
		rectOrigin.affiche();

	}

}
