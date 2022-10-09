package tehtavat;

import java.util.Scanner;

public class Testi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        final int tarvittavaIka = 24;
        int ika;
        System.out.print("Anna ikäsi: ");
        ika = input.nextInt();
        if (ika >= tarvittavaIka) {
            System.out.println("Tule sisään!");
        } else {
            System.out.println("Et pääse sisään");
        }
        input.close();
    }
}
