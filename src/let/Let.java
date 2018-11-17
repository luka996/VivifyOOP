package let;

import java.util.ArrayList;

import ljudi.Putnik;
import prtljag.Prtljag;

public class Let {
	private String naziv; 
	private int kapacitet;
	private ArrayList<Putnik> spisakPutnika = new ArrayList<Putnik>();
	private ArrayList<Prtljag> listaIzgubljenihPrtljaga = new ArrayList<Prtljag>();
	int tezinaIzgubljenihPrtljaga= 0;
	
	public void ukrcajPutnika(Putnik putnik) {
		if(!spisakPutnika.contains(putnik) && putnik.isNoFly() == false) {
			this.spisakPutnika.add(putnik);
			putnik.setLet(this);
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public ArrayList<Putnik> getSpisakPutnika() {
		return spisakPutnika;
	}

	public void setSpisakPutnika(ArrayList<Putnik> spisakPutnika) {
		this.spisakPutnika = spisakPutnika;
	}
	
	public void dodajIzgubljeniPrtljag(Prtljag izgubljeniPrtljag) {
		if(!listaIzgubljenihPrtljaga.contains(izgubljeniPrtljag) && izgubljeniPrtljag.getVlasnikPrtljaga().isNoFly() == false)
			listaIzgubljenihPrtljaga.add(izgubljeniPrtljag);
		this.tezinaIzgubljenihPrtljaga+= izgubljeniPrtljag.getTezinaPrtljaga();
	}
}
