package tehtävät;

import java.util.Scanner;

public class Rekisterinumerot {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        final int MAX = 20;
        int lkm = 0;
        String auto;
        String [] rekisteriNro = new String [MAX];
        System.out.print("Anna rekisterinumero: ");
        auto = input.nextLine();
        while (!auto.equals("-") && lkm < MAX ) {
            rekisteriNro[lkm] = auto;
            lkm++;
            if(lkm < MAX){
                System.out.print("Anna rekisterinumero: ");
                auto = input.nextLine();
            } else {
                System.out.println("Lista on täynnä :(");
            }
        }
        for (int i = 0; i < lkm; i++) {
            System.out.print(rekisteriNro[i] + " ");
        }
        input.close();
    }
}
