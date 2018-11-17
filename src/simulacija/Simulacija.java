package simulacija;

import ljudi.Pilot;
import ljudi.Putnik;

public class Simulacija {

	public static void main(String[] args) {
		Putnik miroslav = new Putnik("Miroslav", "Peranovic");
		System.out.println(miroslav.getKilaza());
		Pilot djordje = new Pilot("Djordje","Grubacic",90);
	}

}
