package tehtavat;

import java.util.ArrayList;
import java.util.Scanner;

public class OsallistujalistaSovellus {
    Scanner input = new Scanner(System.in);
    ArrayList<Osallistuja> osallistujat = new ArrayList<Osallistuja>();

    private void kaynnista() {
        boolean jatkuu = true;
        do {
            System.out.println("1 = Lisää osallistuja");
            System.out.println("2 = Näytä kaikki osallistujat");
            System.out.println("3 = Näytä kansallisuudella");
            System.out.println("4 = Muuta osallistujan nimeä");
            System.out.println("0 = Lopeta");
            System.out.print("Anna valintasi (0-5): ");
            switch (input.nextInt()) {
                case 1:
                    Osallistuja osallistuja = new Osallistuja();
                    input.nextLine();
                    System.out.print("Anna osallistujan nimi: ");
                    osallistuja.setNimi(input.nextLine());
                    System.out.print("Anna kansallisuus: ");
                    osallistuja.setKansallisuus(input.nextLine());
                    System.out.print("Anna syntymävuosi: ");
                    osallistuja.setSyntymavuosi(input.nextInt());
                    osallistujat.add(osallistuja);
                    break;
                case 2:
                    for (int i = 0; i < osallistujat.size(); i++) {
                        System.out.println("Nimi: " + osallistujat.get(i).getNimi());
                        System.out.println("Kansallisuus: " + osallistujat.get(i).getKansallisuus());
                        System.out.println("Syntymävuosi: " + osallistujat.get(i).getSyntymavuosi());
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Anna kansallisuus: ");
                    String kansallisuus = input.nextLine();
                    for (int i = 0; i < osallistujat.size(); i++) {
                        if (osallistujat.get(i).getKansallisuus().equals(kansallisuus)) {
                            System.out.println("Nimi: " + osallistujat.get(i).getNimi());
                            System.out.println("Kansallisuus: " + osallistujat.get(i).getKansallisuus());
                            System.out.println("Syntymävuosi: " + osallistujat.get(i).getSyntymavuosi());
                        }
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.print("Anna muutettavan osallistujan nimi: ");
                    String nimi = input.nextLine();
                    for (int i = 0; i < osallistujat.size(); i++) {
                        if (osallistujat.get(i).getNimi().equals(nimi)) {
                            System.out.print("Anna osallistujan uusi nimi: ");
                            osallistujat.get(i).setNimi(input.nextLine());
                        }
                    }
                    break;
                case 0:
                    jatkuu = false;
                    break;

                default:
                    break;
            }
        } while (jatkuu);
    };

    public static void main(String[] args) {
        OsallistujalistaSovellus ohjelma = new OsallistujalistaSovellus();
        ohjelma.kaynnista();
    }
}
