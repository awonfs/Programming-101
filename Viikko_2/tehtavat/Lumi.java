package tehtavat;

import java.util.Scanner;

public interface Lumi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nimi = "";
        int lkm = 0, lumeja = 0;
        while (nimi.equals("LOPPU") == false) {
            System.out.print("Anna nimi: ");
            nimi = input.nextLine();
            if (nimi.equals("LOPPU") == true) {
            } else if (nimi.equalsIgnoreCase("lumi")) {
                lumeja++;
                lkm++;
            } else {
                lkm++;
            }
        }
        System.out.println("Nimiä oli " + lkm + "kappaletta.");
        System.out.println("Nimi Lumi esiintyi " + lumeja + " kertaa.");
        input.close();
    }
}
