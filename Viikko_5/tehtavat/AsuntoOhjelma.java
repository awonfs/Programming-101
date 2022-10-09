import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntoOhjelma {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        System.out.print("Anna asunnon tyyppi: ");
        String tyyppi = input.nextLine();
        System.out.print("Anna osoite: ");
        String osoite = input.nextLine();
        System.out.print("Anna pinta-ala: ");
        double pintaAla = input.nextDouble();
        System.out.print("Anna hinta: ");
        double hinta = input.nextDouble();
        input.nextLine();
        System.out.print("Anna kuvaus: ");
        String kuvaus = input.nextLine();
        input.close();
        Asunto asunto = new Asunto();
        asunto.setTyyppi(tyyppi);
		asunto.setOsoite(osoite);
		asunto.setPintaAla(pintaAla);
        asunto.setHinta(hinta);
		asunto.setKuvaus(kuvaus);

        System.out.println("Tyyppi: " + asunto.getTyyppi());
        System.out.println("Osoite: " + asunto.getOsoite());
        System.out.println("Pinta-ala: " + desimaalit.format(asunto.getPintaAla()));
        System.out.println("Hinta: " + desimaalit.format(asunto.getHinta()) + " euroa");
        System.out.println("Kuvaus: " + asunto.getKuvaus());
        
    }
}
