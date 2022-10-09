package tehtavia;

import java.util.Scanner;

public class PeliOhjelma {
    Scanner input = new Scanner(System.in);
    Peli peli = new Peli();
    Henkilo pelaaja = new Henkilo();

    public void teePelaaja() {
        System.out.print("Anna nimesi: ");
        pelaaja.setNimi(input.nextLine());
        peli.setPelaaja(pelaaja);
    };

    public void pelaaPelia() {
        if (pelaaja.getNimi() == "") {
            System.out.println("Peli voi alkaa vasta, kun on asetettu pelaaja");
            return;
        }
        int arvauksesi;
        System.out.print("Anna arvaus: ");
        arvauksesi = input.nextInt();
        while (!peli.isValmis()) {
            if (arvauksesi == peli.getArvattava()) {
                peli.setArvauksia(peli.getArvauksia() + 1);
                System.out.println("Arvasit oikein");
                peli.setValmis(true);
                return;
            }
            if (arvauksesi > peli.getArvattava()) {
                peli.setArvauksia(peli.getArvauksia() + 1);
                System.out.print("Arvaa pienempää: ");
                arvauksesi = input.nextInt();
            } else if (arvauksesi < peli.getArvattava()) {
                peli.setArvauksia(peli.getArvauksia() + 1);
                System.out.print("Arvaa suurempaa: ");
                arvauksesi = input.nextInt();
            }
        }
    };
    
    public void naytaPeli() {
        if (peli.getArvauksia() == 0) {
            System.out.println("Peliä ei ole pelattu");
            return;
        } else {
            System.out.println(peli.getPelaaja().getNimi() + " arvasi " + peli.getArvauksia() + " kertaa numeroa "
                    + peli.getArvattava());
        }

    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jatkuu = true;
        PeliOhjelma ohjelma = new PeliOhjelma();
        do {
            System.out.println("1. Tee pelaaja");
            System.out.println("2. Pelaa");
            System.out.println("3. Näytä peli");
            System.out.println("0. Lopeta");
            System.out.print("Anna valintasi (0-3): ");
            switch (input.nextInt()) {
                case 1:
                    ohjelma.teePelaaja();
                    break;
                case 2:
                    ohjelma.pelaaPelia();
                    break;
                case 3:
                    ohjelma.naytaPeli();
                    break;
                case 0:
                    jatkuu = false;
                    break;
                default:
                    System.out.println("Valintasi ei kelpaa!");
                    break;
            }
        } while (jatkuu);
        input.close();
    }
}
