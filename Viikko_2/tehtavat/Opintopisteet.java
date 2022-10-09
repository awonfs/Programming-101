package tehtavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAXPISTEET = 210;
        int lukukausi = 0, opintopisteet, yhteensä = 0;
        System.out.print("Anna lukukausien määrä: ");
        lukukausi = input.nextInt();
        for (int i = 0; i < lukukausi; i++) {
            System.out.print("Anna " + (i + 1) + ". lukukauden opintopisteesi: ");
            opintopisteet = input.nextInt();
            yhteensä = yhteensä + opintopisteet;
        }
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        int tavoite = lukukausi * 30;
        System.out.println("Sinulla pitäisi olla tähän mennessä " + desimaalit.format(tavoite) + " opintopistettä.");
        System.out.println("Sinulla on " + desimaalit.format(yhteensä) + " opintopistettä.");
        if (yhteensä > tavoite) {
            System.out.println("Olet edellä tavoitteesta.");
            System.out.println(
                    "Tutkinnosta puuttuu vielä " + desimaalit.format((MAXPISTEET - yhteensä)) + " opintopistettä.");
        }
        if (yhteensä < tavoite) {
            System.out.println("Olet jäljessä tavoitteesta.");
            System.out.println(
                    "Tutkinnosta puuttuu vielä " + desimaalit.format((MAXPISTEET - yhteensä)) + " opintopistettä.");
        }
        input.close();
    }
}
