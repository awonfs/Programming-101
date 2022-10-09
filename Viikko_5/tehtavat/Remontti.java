

public class Remontti {
    private int vuosi;
    private String kuvaus;

    public Remontti() {
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

    @Override
    public String toString() {
        return "Remontti [kuvaus=" + kuvaus + ", vuosi=" + vuosi + "]";
    }

}
