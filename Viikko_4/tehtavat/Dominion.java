import java.util.Scanner;

public class Dominion {

    int laskePisteet(int kirous, int tila, int pitaja, int laani) {
        tila = tila * 2;
        pitaja = pitaja * 3;
        laani = laani * 6;
        int yhteensa = tila + pitaja + laani - kirous;
        return yhteensa;
    };

    public static void main(String[] args) {
        Dominion meto = new Dominion();
        int kirous, tila, pitaja, laani;
        Scanner input = new Scanner(System.in);
        System.out.print("Anna kirouskorttien määrä: ");
        kirous = input.nextInt();
        System.out.print("Anna tilakorttien määrä: ");
        tila = input.nextInt();
        System.out.print("Anna pitäjäkorttien määrä: ");
        pitaja = input.nextInt();
        System.out.print("Anna läänikorttien määrä: ");
        laani = input.nextInt();
        int yhteensa = meto.laskePisteet(kirous, tila, pitaja, laani);
        System.out.print("Pisteiden yhteismäärä on " + yhteensa);
        input.close();
    }

}