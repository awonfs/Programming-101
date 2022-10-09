package tehtavia;
import java.util.Scanner;

public class RemonttiTekijaOhjelma {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Remontti remontti = new Remontti();
        Henkilo tekija = new Henkilo();
        System.out.print("Anna vuosi: ");
        remontti.setVuosi(input.nextInt());
        System.out.print("Anna kuvaus: ");
        input.nextLine();
        remontti.setKuvaus(input.nextLine());
        System.out.print("Anna tekijän nimi: ");
        tekija.setNimi(input.nextLine());
        System.out.print("Anna tekijän osoite: ");
        tekija.setOsoite(input.nextLine());
        remontti.setTekija(tekija);
        System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
        System.out.println("Remontin teki " + remontti.getTekija().getNimi());
        input.close();
        
    }
}
