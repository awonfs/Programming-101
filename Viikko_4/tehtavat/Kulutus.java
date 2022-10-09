import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {
    Scanner input = new Scanner(System.in);

    int kysyKilometrit() {
        int ajettuMaara = 0;
        System.out.print("Anna ajetut kilometrit: ");
        ajettuMaara = input.nextInt();
        return ajettuMaara;
    };

    double kysyTankkaus() {
        double tankattuMaara = 0.0;
        System.out.print("Anna tankattu määrä: ");
        tankattuMaara = input.nextDouble();
        return tankattuMaara;
    };

    double laskeKulutus(int kilometrit, double tankattu) {
        double kulutus = tankattu / kilometrit * 100;
        return kulutus;
    };

    void naytaKulutus(double kulutus) {
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        System.out.println("Kulutus/100km on " + desimaalit.format(kulutus) + " litraa");
    };

    public static void main(String[] args) {
        
        Kulutus meto = new Kulutus();
        int kilometrit = meto.kysyKilometrit();
        double tankattu = meto.kysyTankkaus();
        double kulutus = meto.laskeKulutus(kilometrit, tankattu);
        meto.naytaKulutus(kulutus);
        

    }

}
