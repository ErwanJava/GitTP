package tp.poo.java.lotr;

public class Character {
	
	private Race race;
	private String name;
	private Gender gender;
	private int height;
	private boolean good;
	
	public Character(String name, Gender gender, Race race, int height, boolean good) {
		super();
		this.race = race;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.good=good;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public Boolean getGood() {
		return good;
	}
	public void setGood(Boolean good) {
		this.good = good;
	}

}
