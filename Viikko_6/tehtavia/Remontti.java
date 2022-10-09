package tehtavia;

public class Remontti {
    private int vuosi;
    private String kuvaus;
    private Henkilo tekija;

    public Remontti() {
    }
    
    public Remontti(int vuosi, String kuvaus, Henkilo tekija) {
        this.vuosi = vuosi;
        this.kuvaus = kuvaus;
        this.tekija = tekija;
    }

    public int getVuosi() {
        return vuosi;
    }

    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Henkilo getTekija() {
        return tekija;
    }

    public void setTekija(Henkilo tekija) {
        this.tekija = tekija;
    }

    @Override
    public String toString() {
        return "Remontti [kuvaus=" + kuvaus + ", tekija=" + tekija + ", vuosi=" + vuosi + "]";
    }
}
