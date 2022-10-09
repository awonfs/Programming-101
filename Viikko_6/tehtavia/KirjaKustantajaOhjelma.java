package tehtavia;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kirja kirja = new Kirja();
        Kustantaja kustantaja = new Kustantaja();
        kirja.setNimi("Java-ohjelmointi");
        kirja.setIsbn("978-952-14-3556-0");
        kirja.setHinta(65.50);
        kirja.setVuosi(2018);
        System.out.print("Kustantajan nimi: ");
        kustantaja.setNimi(input.nextLine());
        System.out.print("Kustantajan osoite: ");
        kustantaja.setOsoite(input.nextLine());
        System.out.print("Kustantajan puhelin: ");
        kustantaja.setPuhelin(input.nextLine());
        kirja.setKustantaja(kustantaja);
        System.out.print("Kirjan " + kirja.getNimi() + " Kustantaja on " + kirja.getKustantaja().getNimi());
        input.close();
    }
}
