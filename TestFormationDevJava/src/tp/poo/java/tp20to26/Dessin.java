package tp.poo.java.tp20to26;

import java.util.ArrayList;

public class Dessin {

	// choix vers ArrayList parce que sans clé, avec doublon, sans ordre ni tri
	protected ArrayList<Figure> listFigure= new ArrayList<Figure>();
	
	public Dessin() {
		
	}
	
	public boolean add(Figure fig) {
		if(fig != null) {
			listFigure.add(fig);
			return true;
		} else 
			return false;
			
	}
	// pas besoin d'iterator, parce que la liste va etre construite au fur et a mesure des appels de .add()
	public ArrayList<Figure> getFigures(){
		return listFigure;
	}

}
