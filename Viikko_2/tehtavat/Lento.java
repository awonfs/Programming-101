package tehtavat;

/* Tee ohjelma Lento, jolla voidaan selvittää lennon numerosta, onko kyseessä Finnairin lento.
Jos lennon numeron alussa on merkit AY, kyseessä on Finnairin lento. Jos kyseessä on Finnairin
lento, selvitetään lisäksi, onko kyseessä kaukolento, kotimaan lento vai Venäjän lento. Jos lennon
kolmas merkki on numero 1, kyseessä on kaukolento, numero 2-6 kotimaan lento, numero 7
Venäjän lento. */

import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lento;
        System.out.print("Anna lennon numero: ");
        lento = input.nextLine().toUpperCase();
        String alku = lento.substring(0, 2);

        if (alku.equals("AY")) {
            int numero = Integer.parseInt(lento.substring(2, 3));
            if (numero < 7 && numero != 1) {
                System.out.println("Kotimaan lento");
            } else if (numero == 1) {
                System.out.println("Kaukolento");
            } else {
                System.out.println("Venäjän lento");
            }
        }

        if (!alku.equals("AY")) {
            System.out.println("Ei ole Finnairin lento");
        }

        input.close();
    }
}
