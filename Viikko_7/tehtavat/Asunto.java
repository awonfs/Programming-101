package tehtavat;

import java.util.ArrayList;

public class Asunto {
    private String tyyppi, osoite, kuvaus;
    private double pintaAla, hinta;
    private ArrayList<Remontti> remontit = new ArrayList<>();

    public Asunto() {
    }

    public Asunto(String tyyppi, String osoite, String kuvaus, double pintaAla, double hinta,
            ArrayList<Remontti> remontit) {
        this.tyyppi = tyyppi;
        this.osoite = osoite;
        this.kuvaus = kuvaus;
        this.pintaAla = pintaAla;
        this.hinta = hinta;
        this.remontit = remontit;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public String getOsoite() {
        return osoite;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public double getPintaAla() {
        return pintaAla;
    }

    public double getHinta() {
        return hinta;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public void setPintaAla(double pintaAla) {
        this.pintaAla = pintaAla;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public String toString() {
        return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", kuvaus=" + kuvaus + ", pintaAla=" + pintaAla
                + ", hinta=" + hinta + ", remontit=" + remontit + "]";
    }

    public ArrayList<Remontti> getRemontit() {
        return remontit;
    }

    public void setRemontit(ArrayList<Remontti> remontit) {
        this.remontit = remontit;
    }

}
