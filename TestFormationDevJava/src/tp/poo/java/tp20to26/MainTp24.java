package tp.poo.java.tp20to26;
import java.time.*;

public class MainTp24 {

	public static void main(String[] args) {
		
		//test de la méthode distance
		Point p1= new Point(30,40);
		Point p0= new Point(0,0);
		System.out.println("distance de P à l'origine = "+p1.distance(p0));
		//test de la méthode distanceOrigin
		
		// test des dates pour le cours
		LocalDateTime today= LocalDateTime.now();
		System.out.println("date d'aujourd'hui : "+today);
		LocalDateTime birthDate=LocalDateTime.of(1974, 03, 25, 23, 45);
		System.out.println("date de naissance : "+birthDate);
		Duration ageHours = Duration.between(birthDate, today);
		System.out.println("age en heures : "+ageHours);
		Period age = Period.between(birthDate.toLocalDate(), today.toLocalDate());
		System.out.println("age : "+age);
		
	}

}
