package ljudi;

import java.util.Random;

public class Pilot extends Covek{
	private boolean posedujeLicencu;
	
	public Pilot(String ime, String prezime, int kilaza) {
		super(ime,prezime,kilaza);
		// nasumicno postavljamo vrednost za validnost licence(u skladu sa 5% verovatnocom za invalidnost)
		this.posedujeLicencu = genValidnostLicence();
	}
	
	public boolean isPosedujeLicencu() {
		return posedujeLicencu;
	}

	public boolean genValidnostLicence() 
	{
		Random rn = new Random();
		int randVal = rn.nextInt(100 - 1 + 1) + 1;
		// 5% sanse da pilot nema licencu
		if(randVal<=5) {
			return false;
		}
		return true;
	}
}
