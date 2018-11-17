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
	
	public abstract void IzgubiPrtljag(Let let);

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
