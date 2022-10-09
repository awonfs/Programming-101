package tehtavat;

public class Dominion {
    private String nimi;
    private int kirous, tila, pitaja, laani;

    public Dominion() {
    }

    public Dominion(String nimi, int kirous, int tila, int pitaja, int laani) {
        this.nimi = nimi;
        this.kirous = kirous;
        this.tila = tila;
        this.pitaja = pitaja;
        this.laani = laani;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getKirous() {
        return kirous;
    }

    public void setKirous(int kirous) {
        this.kirous = kirous;
    }

    public int getTila() {
        return tila;
    }

    public void setTila(int tila) {
        this.tila = tila;
    }

    public int getPitaja() {
        return pitaja;
    }

    public void setPitaja(int pitaja) {
        this.pitaja = pitaja;
    }

    public int getLaani() {
        return laani;
    }

    public void setLaani(int laani) {
        this.laani = laani;
    }

    @Override
    public String toString() {
        return "Dominion [nimi=" + nimi + ", kirous=" + kirous + ", tila=" + tila + ", pitaja=" + pitaja + ", laani="
                + laani + "]";
    }

}
