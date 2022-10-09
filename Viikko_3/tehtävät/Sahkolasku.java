package tehtävät;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Tee ohjelma Sahkolasku, joka näyttää puolen vuoden ajalta sähkölaskun suuruuden. Ohjelma
kysyy kilowattitunnin hinnan euroina ja kunkin kuukauden (6 kappaletta) kulutuksen
kilowattitunteina. Lopuksi ohjelma näyttää kuukausittaisen sähkönkulutuksen kilowatteina sekä */

public class Sahkolasku {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        double hinta;
        int [] sahkoLukema = new int [6];
        System.out.print("Anna kilowatin hinta euroina: ");
        hinta = input.nextDouble();
        for (int i = 0; i < 6; i++) {
            System.out.print("Anna kuukauden " + (i+1) + " sähkölukema: " );
            sahkoLukema[i] = input.nextInt();
        }
        System.out.println("1. kuukauden kulutus: " + sahkoLukema[0] + "kwh " + desimaalit.format((sahkoLukema[0] * hinta)) + "euroa");
        System.out.println("2. kuukauden kulutus: " + sahkoLukema[1] + "kwh " + desimaalit.format((sahkoLukema[1] * hinta)) + "euroa");
        System.out.println("3. kuukauden kulutus: " + sahkoLukema[2] + "kwh " + desimaalit.format((sahkoLukema[2] * hinta)) + "euroa");
        System.out.println("4. kuukauden kulutus: " + sahkoLukema[3] + "kwh " + desimaalit.format((sahkoLukema[3] * hinta)) + "euroa");
        System.out.println("5. kuukauden kulutus: " + sahkoLukema[4] + "kwh " + desimaalit.format((sahkoLukema[4] * hinta)) + "euroa");
        System.out.println("6. kuukauden kulutus: " + sahkoLukema[5] + "kwh " + desimaalit.format((sahkoLukema[5] * hinta)) + "euroa");
        input.close();
    }
}
