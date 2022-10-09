import java.text.DecimalFormat;
import java.util.Scanner;

public class Lahjavero {

    double laskeVero(double arvo) {
        double vero = 0;
        double maara = 0;
        final int MINIMI = 5000;
        final int MAX = 1000000;
        if(arvo < MINIMI) {
            maara = 0;
        } else if (arvo > MINIMI && arvo < 25000) {
            vero = arvo - 100;
            maara = arvo - vero;
        } else if (arvo > 25000 && arvo < 55000) {
            vero = arvo - (1700 + 0.1 * 5000) ;
            maara = arvo - vero;
        } else if (arvo > 55000 && arvo < 200000) {
            vero = arvo - (4700 + 0.12 * 5000);
            maara = arvo - vero;
        } else if (arvo > 200000 && arvo < MAX) {
            vero = arvo - 22100;
            maara = arvo - vero;
        } else if (arvo > MAX) {
            vero = arvo - 142100;
            maara = arvo - vero;
        }
        return maara;
      }
    public static void main(String[] args) {
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        Scanner input = new Scanner (System.in);
        Lahjavero meto = new Lahjavero();
        double arvo;
        System.out.print("Anna lahjan suuruus: ");
        arvo = input.nextDouble();
        double vero = meto.laskeVero(arvo);
        System.out.println("Lahjavero on " + desimaalit.format(vero) + " euroa");
        input.close();
        
    }
}
