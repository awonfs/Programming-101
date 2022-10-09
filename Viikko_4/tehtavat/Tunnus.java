import java.util.Scanner;

public class Tunnus {

    String teeTunnus(String etu, String suku){
        etu = etu.substring(0, 3).toLowerCase();
        suku = suku.substring(0, 3).toLowerCase();
        String tunnus = suku + etu;
        return tunnus;
    };
    public static void main(String[] args) {
        Tunnus meto = new Tunnus();
        String etuNimi;
        String sukuNimi;
        Scanner input = new Scanner (System.in);
        System.out.print("Anna sukunimi: ");
        sukuNimi = input.nextLine();
        System.out.print("Anna etunimi: ");
        etuNimi = input.nextLine();
        String kauttajaTunnus = meto.teeTunnus(etuNimi, sukuNimi);
        System.out.println("Tunnus on " + kauttajaTunnus);
        input.close();
    }
}


