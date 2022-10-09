package tehtavat;

import java.util.Scanner;

public class Osallistumismaksu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Osallistuja (OS) / Katsoja (KA): ");
        String osallistuja = input.nextLine();
        if (osallistuja.equals("OS")) {
            System.out.print("Nuoret (NU) / Aikuiset (AI): ");
            String ikaluokka = input.nextLine();
            if (ikaluokka.equals("NU")) {
                System.out.println("Maksu on 10,00 euroa");
            } else {
                System.out.println("Maksu on 20,00 euroa");
            };
        } else if (osallistuja.equalsIgnoreCase("KA")) {
          System.out.print("Ikä: ");
            int ika = input.nextInt();
            if (ika <18){
                System.out.println("maksu on 8,00 euroa");
            } else if (ika >= 18){
                System.out.println("maksu on 12,50 euroa");
            }
        };
        input.close();
    }
}
