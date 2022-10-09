package tehtavat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {
    public static void main(String[] args) {
        Scanner nro = new Scanner(System.in);
        Scanner nimi = new Scanner(System.in);
        Scanner hinta = new Scanner(System.in);
        Scanner kuvaus = new Scanner(System.in);
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        int tuoteNro;
        double tuoteHinta;
        String tuoteNimi, tuoteKuvaus;
        System.out.print("Anna tuotenumero: ");
        tuoteNro = nro.nextInt();
        System.out.print("Anna tuotteen nimi: ");
        tuoteNimi = nimi.nextLine();
        System.out.print("Anna tuotteen hinta: ");
        tuoteHinta = hinta.nextDouble();
        System.out.print("Anna tuotteen kuvaus: ");
        tuoteKuvaus = kuvaus.nextLine();
        System.out.println("Numero: " + tuoteNro);
        System.out.println("Nimi: " + tuoteNimi.trim().toUpperCase());
        System.out.println("Hinta: " + desimaalit.format(tuoteHinta));
        if (tuoteKuvaus == " ") {
        } else {
            System.out.println("Kuvaus: " + tuoteKuvaus.trim());
        }
        nro.close();
        nimi.close();
        hinta.close();
        kuvaus.close();
    }
}