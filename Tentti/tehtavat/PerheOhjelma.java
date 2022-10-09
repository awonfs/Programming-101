package tehtavat;

import java.util.Scanner;

public class PerheOhjelma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Henkilo isa = new Henkilo();
        System.out.print("Anna isän nimi: ");
        isa.setNimi(input.nextLine());
        System.out.print("Anna isän osoite: ");
        isa.setOsoite(input.nextLine());
        Henkilo aiti = new Henkilo();
        System.out.print("Anna äidin nimi: ");
        aiti.setNimi(input.nextLine());
        System.out.print("Anna äidin osoite: ");
        aiti.setOsoite(input.nextLine());
        Henkilo lapsi = new Henkilo();
        System.out.print("Anna lapsen nimi: ");
        lapsi.setNimi(input.nextLine());
        System.out.print("Anna lapsen osoite: ");
        lapsi.setOsoite(input.nextLine());
        System.out.println("Lapsen isä on " + isa.getNimi() + " ja äiti on " + aiti.getNimi());
        if (isa.getOsoite().equals(aiti.getOsoite())) {
            System.out.println("Perhe asuu samassa osoitteessa");
        } else if (!isa.getOsoite().equals(lapsi.getOsoite()) && aiti.getOsoite().equals(lapsi.getOsoite())) {
            System.out.println("Lapsi ja äiti asuvat samassa osoitteessa");
        } else if (isa.getOsoite().equals(lapsi.getOsoite()) && !aiti.getOsoite().equals(lapsi.getOsoite())) {
            System.out.println("Lapsi ja isä asuvat samassa osoitteessa");
        }
        input.close();
    }
}
