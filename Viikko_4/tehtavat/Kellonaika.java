import java.util.Scanner;

public class Kellonaika {


    String kysyKellonaika(){
        Scanner input = new Scanner(System.in);
        String aika;
        System.out.print("Anna kellonaika muodossa tt:mm: ");
        aika = input.nextLine();
        input.close();
        return aika;
    };

    boolean tarkastaKellonaika(String kellonaika){
        if (kellonaika.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")){
            System.out.println("Kellonaika on oikein");
            return true;
        } else {
            System.out.println("Kellonaika on väärin");
            return false;
        }
    };

    public static void main(String[] args) {
        Kellonaika meto = new Kellonaika();
        String kellonaika = meto.kysyKellonaika();
        meto.tarkastaKellonaika(kellonaika);
    }
}
