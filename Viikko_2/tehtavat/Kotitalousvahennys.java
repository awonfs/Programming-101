package tehtavat;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Tee ohjelma Kotitalousvahennys, joka laskee käyttäjän saaman kotitalousvähennyksen
määrän. Työkorvausten euromääriä kysytään niin kauan, kunnes käyttäjä antaa korvauksen
määräksi nolla. Kotitalousvähennyksen määrä on 40 % työkorvauksesta.
Kotitalousvähennyksen enimmäismäärä on 2 250 euroa. Vähennyksen omavastuu on 100
euroa. Kotitalousvähennys lasketaan työkorvausten summa * 40 / 100.0 - 100 */

public class Kotitalousvahennys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double korvaus, yhteensä = 0, vähennys;
        final int OMAVASTUU = 100;
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        do {
            System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
            korvaus = input.nextDouble();
            if (korvaus >= 2250) {
                vähennys = 2250;
            } else {
                yhteensä = yhteensä + korvaus;
            }
        } while (korvaus != 0);
        vähennys = yhteensä * 40 / 100.0 - OMAVASTUU;
        if (vähennys <= 0) {
            vähennys = 0;
        }
        if (yhteensä >= 2250) {
            vähennys = 2250;
        }
        System.out.print("Kotitalousvähennyksen määrä on " + desimaalit.format(vähennys) + " euroa");
        input.close();
    }
}
