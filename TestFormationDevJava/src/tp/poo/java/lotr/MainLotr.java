package tp.poo.java.lotr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainLotr {

	public static void main(String[] args) {
		//ex de la classe Optional
		String prenom = "Jacques";
		Optional<String> optionalPrenom = Optional.empty();
		optionalPrenom = Optional.of("Jacques");
		
		if (optionalPrenom.isPresent()) {
			String lePrenom = optionalPrenom.get();
		}
		optionalPrenom.orElse("");
		
		List<Party> parties= initialize();
		
		//pour illustrer optional avec un stream :
		parties.parallelStream().filter(p->p.getMembers().isEmpty()).findFirst();
		
		//Recup les groupes contenant au moins une femme
		
		// Recup les groupes dont la taille tot ne depasse pas 600 cm
		
		// recup les groupes avec au moins un perso dont la gentillesse n'est pas en accord avec sa race
		
		//Récup dans une liste tous les personnages avec une taille sup à la moyenne de leur race
		
		//

	}
	
	private static List<Party> initialize(){
		List<Party> parties= new ArrayList<>();
		Character gandalf= new Character("Gandalf", Gender.MALE, Race.MAIAR, 200, true);
		Character frodo= new Character("Frodo", Gender.MALE, Race.HOBBIT, 120, true);
		Character sam= new Character("Sam", Gender.MALE, Race.HOBBIT, 110, true);
		Character gimli= new Character("Gimli", Gender.MALE, Race.DWARF, 80, true);
		
		List<Character> fellowshipMembers= Arrays.asList(gandalf, frodo, sam, gimli);
		Party fellowship = new Party("The fellowship of the ring", gandalf, fellowshipMembers);
		parties.add(fellowship);
		
		Character sauron = new Character("Sauron", Gender.MALE, Race.MAIAR, 240, false);
		Character orc1 = new Character("Emile-Louis", Gender.FEMALE, Race.ORC, 160, false);
		Character orc2 = new Character("Guy-Georges", Gender.MALE, Race.ORC, 170, false);
		Character uruk1 = new Character("Giselle", Gender.FEMALE, Race.URUK, 230, false);
		
		List<Character> theBadGuyMembers= Arrays.asList(sauron, orc1, orc2, uruk1);
		Party theBadGuys = new Party("Sauron's army", sauron, theBadGuyMembers);
		parties.add(theBadGuys);
		
		return parties;
		
	}

}
