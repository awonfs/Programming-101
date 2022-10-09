package tehtävät;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        int lampoTila, lkm = 0;
        int[] asteet = new int[MAX];
        System.out.print("Anna lämpötila: ");
        lampoTila = input.nextInt();
        while (lampoTila != -999 && lkm < MAX) {
            asteet[lkm] = lampoTila;
            lkm++;
            if (lkm < MAX) {
                System.out.print("Anna lämpötila: ");
                lampoTila = input.nextInt();
            } else {
                System.out.println("Ei enää lämpötiloja.");
            }
        }
        System.out.print("Annoit lämpötilat: ");
        Arrays.sort(asteet, 0, lkm);
        for (int i = 0; i < lkm; i++) {
            System.out.print(asteet[i] + " ");
        }
        input.close();
    }
}
