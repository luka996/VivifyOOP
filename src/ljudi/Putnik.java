package ljudi;

import java.util.Random;

import let.Let;

public class Putnik extends Covek{
	boolean noFly;
	
	Let let;
	
	public Let getLet() {
		return let;
	}

	public void setLet(Let let) {
		this.let = let;
	}

	public Putnik(String ime, String prezime) {
		super(ime, prezime);
		// kilazu postavljamo na nasumicno generisanu vrednost u intervalu 20 - 100
		this.setKilaza(this.genKilazu());
		// noFly postavljamo na nasumicno generisanu vrednost u skladu sa verovatnocom da je putnik na listi 30%
		noFly = genNoFly();
	}
	
	private boolean genNoFly() {
		Random rn = new Random();
		int randVal = rn.nextInt(9 - 1 + 1) + 1;
		// 30% sanse za no fly
		if(randVal <= 3)
			return true;
		else 
			return false;
	}
	
	public int genKilazu() {
		Random rn = new Random();
		int randVal = rn.nextInt(100 - 20 + 1) + 20;
		return randVal;
	}
	
	public boolean isNoFly() {
		return noFly;
	}
}
