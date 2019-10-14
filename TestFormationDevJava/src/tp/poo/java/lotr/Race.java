package tp.poo.java.lotr;

public enum Race {
	ELF(true, 200, 10),
	HUMAN (true, 170, 70),
	HOBBIT(true, 100, 40),
	DWARF(true, 120, 80),
	ENT(true, 400, 2000),
	ORC(false, 140, 80),
	URUK(false, 190, 120),
	MAIAR (false,200,200);
	
	private boolean good;
	private int averageHeight;
	private int averageStrength;
	
	private Race(boolean good, int averageHeight, int averageStrength) {
		this.good = good;
		this.averageHeight= averageHeight;
		this.averageStrength = averageStrength;
	}
	
	public boolean isGood() {
		return good;
	}

	public int getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}

	public int getAverageStrength() {
		return averageStrength;
	}

	public void setAverageStrength(int averageStrength) {
		this.averageStrength = averageStrength;
	}
	

}
