package ljudi;

import java.util.Random;

public class Putnik extends Covek{
	boolean noFly;
	
	public Putnik(String ime, String prezime, int kilaza) {
		super(ime, prezime, kilaza);
		noFly = genNoFly();
	}
	
	public boolean genNoFly() {
		Random rn = new Random();
		int randVal = rn.nextInt(9 - 1 + 1) + 1;
		// 30% sanse za no fly
		if(randVal <= 3)
			return true;
		else 
			return false;
	}
	
	
	public boolean isNoFly() {
		return noFly;
	}
}
