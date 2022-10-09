import java.time.LocalDate;
import java.util.Scanner;

public class RemonttiOhjelmaMetodeilla {
    Scanner input = new Scanner(System.in);
    Remontti remontti = new Remontti();
    LocalDate nykyinenVuosi = LocalDate.parse("2022-09-18");

    public void teeRemontti() {

        System.out.print("Anna vuosi: ");
        int vuosi = input.nextInt();
        if (vuosi > nykyinenVuosi.getYear()) {
            System.out.println("Vuosi ei voi olla tulevaisuudessa");
        } else {
            input.nextLine();
            System.out.print("Anna kuvaus: ");
            String kuvaus = input.nextLine();
            remontti.setVuosi(vuosi);
            remontti.setKuvaus(kuvaus);
            System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
        }
    };

    public void naytaRemontti() {
        System.out.println("Vuosi: " + remontti.getVuosi());
        System.out.println("Kuvaus: " + remontti.getKuvaus());
    };

    public void muutaRemontti() {
        System.out.print("Anna vuosi: ");
        remontti.setVuosi(input.nextInt());
        input.nextLine();
        System.out.print("Anna kuvaus: ");
        remontti.setKuvaus(input.nextLine());
        System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RemonttiOhjelmaMetodeilla meto = new RemonttiOhjelmaMetodeilla();
        boolean jatkuu = true;
        do {
            System.out.println("1. Tee remontti");
            System.out.println("2. Näytä remonttitiedot");
            System.out.println("3. Muuta remonttia");
            System.out.println("0. Lopetus");
            System.out.print("Anna valintasi (0-3): ");
            switch (input.nextInt()) {
                case 1:
                    meto.teeRemontti();
                    break;
                case 2:
                    meto.naytaRemontti();
                    break;
                case 3:
                    meto.muutaRemontti();
                    break;
                case 0:
                    jatkuu = false;
                    break;
                default:
                    System.out.println("Valinta ei kelpaa!");
            }
        } while (jatkuu);
        input.close();
    }
}
