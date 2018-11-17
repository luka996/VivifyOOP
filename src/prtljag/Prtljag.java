package prtljag;

import let.Let;
import ljudi.Putnik;

public abstract class Prtljag {	
	protected Putnik vlasnikPrtljaga;
	protected int tezinaPrtljaga;
	
	public Prtljag(Putnik vlasnikPrtljaga, int tezinaPrtljaga) {
		this.vlasnikPrtljaga = vlasnikPrtljaga;
		this.tezinaPrtljaga = tezinaPrtljaga;
	}
	
	public abstract void nasumicnoIzgubiPrtljag();
	
	public abstract void IzgubiPrtljag();

	public Putnik getVlasnikPrtljaga() {
		return vlasnikPrtljaga;
	}

	public void setVlasnikPrtljaga(Putnik vlasnikPrtljaga) {
		this.vlasnikPrtljaga = vlasnikPrtljaga;
	}

	public int getTezinaPrtljaga() {
		return tezinaPrtljaga;
	}

	public void setTezinaPrtljaga(int tezinaPrtljaga) {
		this.tezinaPrtljaga = tezinaPrtljaga;
	}
	
}
