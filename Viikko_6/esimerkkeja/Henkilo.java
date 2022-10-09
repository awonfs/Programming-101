package esimerkkeja;

public class Henkilo {
	private String eNimi, sNimi, puhelin;

	public Henkilo() {
		
	}

	public Henkilo(String eNimi, String sNimi, String puhelin) {
		this.eNimi = eNimi;
		this.sNimi = sNimi;
		this.puhelin = puhelin;
	}

	public String geteNimi() {
		return eNimi;
	}

	public void seteNimi(String eNimi) {
		this.eNimi = eNimi;
	}

	public String getsNimi() {
		return sNimi;
	}

	public void setsNimi(String sNimi) {
		this.sNimi = sNimi;
	}

	public String getPuhelin() {
		return puhelin;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	@Override
	public String toString() {
		return "Henkilo [eNimi=" + eNimi + ", sNimi=" + sNimi + ", puhelin=" + puhelin + "]";
	}
	
}
