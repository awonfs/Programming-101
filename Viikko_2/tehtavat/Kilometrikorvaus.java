package tehtavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        final double korvausPerKm = 0.46;
        int kilometri, yhteensä = 0;
        do {
            System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
            kilometri = input.nextInt();
            yhteensä = yhteensä + kilometri;
        } while (kilometri !=0);
        input.close();
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        System.out.println("Yhteensä " + yhteensä + " kilometriä");
        System.out.println("Korvaus on " + desimaalit.format((yhteensä * korvausPerKm)) + " euroa");
    }
}
