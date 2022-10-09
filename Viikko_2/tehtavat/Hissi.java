package tehtavat;

import java.util.Scanner;

public class Hissi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAXPAINO = 240;
        int yhteensä = 0, paino;
        do {
            System.out.print("Paljonko painat: ");
            paino = input.nextInt();
            yhteensä = yhteensä + paino;
            if (paino == 0 || yhteensä > MAXPAINO) {
            } else {
                System.out.println("Tule kyytiin.");
            }
        } while (yhteensä < MAXPAINO && paino != 0);
        if (paino == 0) {
        } else {
            System.out.println("Hissi on jo täynnä. Odota seuraavaa hissiä.");
        }
        input.close();
    }
}
