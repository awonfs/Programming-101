package tehtavia;

public class Peli {
    private int arvattava  = 73;
    private int arvauksia;
    private boolean valmis = false;
    private Henkilo pelaaja;
    
    public Peli() {
    }

    public Peli(int arvattava, int arvauksia, boolean valmis, Henkilo pelaaja) {
        this.arvattava = arvattava;
        this.arvauksia = arvauksia;
        this.valmis = valmis;
        this.pelaaja = pelaaja;
    }

    public int getArvattava() {
        return arvattava;
    }

    public void setArvattava(int arvattava) {
        this.arvattava = arvattava;
    }

    public int getArvauksia() {
        return arvauksia;
    }

    public void setArvauksia(int arvauksia) {
        this.arvauksia = arvauksia;
    }

    public boolean isValmis() {
        return valmis;
    }

    public void setValmis(boolean valmis) {
        this.valmis = valmis;
    }

    public Henkilo getPelaaja() {
        return pelaaja;
    }

    public void setPelaaja(Henkilo pelaaja) {
        this.pelaaja = pelaaja;
    }

    @Override
    public String toString() {
        return "Peli [arvattava=" + arvattava + ", pelaaja=" + pelaaja + "]";
    }

    
}
