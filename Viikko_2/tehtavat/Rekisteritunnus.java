package tehtavat;

import java.util.Scanner;

public class Rekisteritunnus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rekisteriNro;
        System.out.print("Anna rekisterinumero: ");
        rekisteriNro = input.nextLine();
        if (rekisteriNro.matches("[A-ZÅÄÖa-zåäö]{2,3}-[1-9][0-9]{0,2}")) {
            System.out.println("Rekisterinumero on kelvollinen");
        } else {
            System.out.println("Rekisterinumero ei ole kelvollinen");
        }
        input.close();
    }
}
