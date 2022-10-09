package tehtavat;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nimet = new ArrayList<String>();
        ArrayList<Integer> syntymavuodet = new ArrayList<Integer>();

        nimet.add("Eetu");
        nimet.add("Inga");
        nimet.add("Loki");
        nimet.add("Vili");

        for (int i = 0; i < nimet.size(); i++) {
            System.out.print("Hei " + nimet.get(i) + ", anna syntymävuotesi: ");
            syntymavuodet.add(input.nextInt());
        }

        for (int i = 0; i < nimet.size(); i++) {
            System.out.println(nimet.get(i) + " on syntynyt vuonna " + syntymavuodet.get(i));
        }
        input.close();
    }
}
