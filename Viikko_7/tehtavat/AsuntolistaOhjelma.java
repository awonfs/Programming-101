package tehtavat;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AsuntolistaOhjelma {
    Scanner input = new Scanner(System.in);
    ArrayList<Asunto> asunnot = new ArrayList<>();
    DecimalFormat des = new DecimalFormat("0.00");

    public static void main(String[] args) {
        AsuntolistaOhjelma ohjelma = new AsuntolistaOhjelma();
        ohjelma.naytaValikko();
    }

    void naytaValikko() {
        boolean jatkuu = true;
        do {
            System.out.println("1. Lisää asunto");
            System.out.println("2. Näytä asunnot");
            System.out.println("0. Lopetus");
            System.out.print("Anna valintasi (0-2): ");
            switch (input.nextInt()) {
                case 1:
                    lisaaAsunto();
                    break;
                case 2:
                    naytaAsunnot();
                    break;
                case 0:
                    jatkuu = false;
                    break;
                default:
                    System.out.println("Valinta ei kelpaa!");
            }
        } while (jatkuu);
    }

    private void lisaaAsunto() {
        Asunto asunto = new Asunto();
        input.nextLine();
        System.out.print("Anna asunnon tyyppi: ");
        asunto.setTyyppi(input.nextLine());
        System.out.print("Anna osoite: ");
        asunto.setOsoite(input.nextLine());
        System.out.print("Anna pinta-ala: ");
        asunto.setPintaAla(input.nextDouble());
        System.out.print("Anna hinta: ");
        asunto.setHinta(input.nextDouble());
        input.nextLine();
        System.out.print("Anna kuvaus: ");
        asunto.setKuvaus(input.nextLine());
        asunnot.add(asunto);
        boolean eiOleNolla = true;
        do {
            Remontti remontti = new Remontti();
            System.out.print("Anna remontti vuosi (0 lopettaa): ");
            remontti.setVuosi(input.nextInt());
            input.nextLine();
            if (remontti.getVuosi() == 0) {
                eiOleNolla = false;
            } else {
                System.out.print("Anna remontin kuvaus: ");
                remontti.setKuvaus(input.nextLine());
                asunto.getRemontit().add(remontti);
            }
        } while (eiOleNolla);

    }

    private void naytaAsunnot() {
        for (Asunto asunto : asunnot) {
            System.out.println("Tyyppi: " + asunto.getTyyppi());
            System.out.println("Osoite: " + asunto.getOsoite());
            System.out.println("Pinta-ala: " + des.format(asunto.getPintaAla()));
            System.out.println("Hinta: " + des.format(asunto.getHinta()) + " euroa");
            System.out.println("Kuvaus: " + asunto.getKuvaus());
            System.out.println("Remontit:");
            for (Remontti remontti : asunto.getRemontit()) {
                System.out.println(remontti.getVuosi() + " " + remontti.getKuvaus());
            }
        }
    }

}
