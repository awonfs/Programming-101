package tehtävät;

import java.util.Scanner;
import java.time.LocalDate;

public class Erapaiva {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String pvm;
        LocalDate eraPvm;
        System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
        pvm = input.nextLine();
        try {
            eraPvm = LocalDate.parse(pvm);
            System.out.println("Eräpäivä on " + eraPvm.plusDays(14));
        } catch (Exception e) {
            System.out.println("Laskun päivämäärä on virheellinen");
        }
        input.close();
    }
}
