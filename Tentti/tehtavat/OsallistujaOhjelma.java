package tehtavat;

import java.util.Scanner;

public class OsallistujaOhjelma {
    public static void main(String[] args) {
        Osallistuja osallistuja = new Osallistuja();
        Scanner input = new Scanner(System.in);
        System.out.print("Anna osallistujan nimi: ");
        osallistuja.setNimi(input.nextLine());
        System.out.print("Anna kansallisuus: ");
        osallistuja.setKansallisuus(input.nextLine());
        System.out.print("Anna syntymävuosi: ");
        osallistuja.setSyntymavuosi(input.nextInt());
        System.out.println("Nimi: " + osallistuja.getNimi());
        System.out.println("Kansallisuus: " + osallistuja.getKansallisuus());
        System.out.println("Syntymävuosi: " + osallistuja.getSyntymavuosi());
        input.close();

    }
}
