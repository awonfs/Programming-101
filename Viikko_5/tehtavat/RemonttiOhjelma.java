import java.time.LocalDate;
import java.util.Scanner;

public class RemonttiOhjelma {
    public static void main(String[] args) {
        LocalDate nykyinenVuosi = LocalDate.parse("2022-09-18");
        Scanner input = new Scanner(System.in);
        System.out.print("Anna vuosi: ");
        int vuosi = input.nextInt();
        if (vuosi > nykyinenVuosi.getYear()) {
            System.out.println("Vuosi ei voi olla tulevaisuudessa");
        } else {
            input.nextLine();
            System.out.print("Anna kuvaus: ");
            String kuvaus = input.nextLine();

            Remontti remontti = new Remontti();
            remontti.setVuosi(vuosi);
            remontti.setKuvaus(kuvaus);

            System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
            input.close();
        }
    }

}
