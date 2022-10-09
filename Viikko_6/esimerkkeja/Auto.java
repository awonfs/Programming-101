package esimerkkeja;

public class Auto {
	private String rekNo;
	private String merkki, malli;
	private int vuosi;
	private Henkilo omistaja;
	
	public Auto() { //new Auto();
		
	}
	
	public Auto(String rekNo) { //new Auto("ABC-123");
		this.rekNo = rekNo;		
	}
	
	public Auto(String rekNo, Henkilo omistaja) { //new Auto("ABC-123");
		this.rekNo = rekNo;	
		this.omistaja = omistaja;
	}

	public Auto(String rekNo, String merkki, String malli, int vuosi) {
		this.rekNo = rekNo;
		this.merkki = merkki;
		this.malli = malli;
		this.vuosi = vuosi;
	}

	public String getRekNo() {
		return rekNo;
	}

	public void setRekNo(String rekNo) {
		this.rekNo = rekNo;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}

	public Henkilo getOmistaja() {
		return omistaja;
	}

	public void setOmistaja(Henkilo omistaja) {
		this.omistaja = omistaja;
	}

	@Override
	public String toString() {
		return "Auto [rekNo=" + rekNo + ", merkki=" + merkki + ", malli=" + malli + ", vuosi=" + vuosi + ", omistaja="
				+ omistaja + "]";
	}	
}
