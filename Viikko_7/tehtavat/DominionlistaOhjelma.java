package tehtavat;

import java.util.ArrayList;
import java.util.Scanner;

public class DominionlistaOhjelma {
    Scanner input = new Scanner(System.in);
    ArrayList<String> pelaajat = new ArrayList<>();

    private void kysyPelaajat() {
        System.out.print("Montako pelaajia on: ");
        int pelaajia = input.nextInt();
        input.nextLine();
        for (int i = 0; i < pelaajia; i++) {
            Dominion dominion = new Dominion();
            System.out.print("Anna pelaajan nimi: ");
            dominion.setNimi(input.nextLine());
            pelaajat.add(dominion.getNimi());
        }
    }

    private void pelaa() {

        System.out.print("Kuka sai pisteitä: ");
        String pelaaja = input.nextLine();
        if (pelaajat.contains(pelaaja)) {
            pelaajat.get(pelaajat.indexOf(pelaaja));
            System.out.print("K=Kirous, T=Tila, P=Pitäjä, L=Lääni: ");
            switch (input.next().toUpperCase()) {
                case "K":
                    
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("Pelaajaa ei ole");
        }

    }

    public static void main(String[] args) {
        DominionlistaOhjelma ohjelma = new DominionlistaOhjelma();
        ohjelma.kysyPelaajat();
        System.out.println(ohjelma.pelaajat);
        ohjelma.pelaa();
    }

}
