package tehtävät;

public class PeltipoliisiYlinopeus {
    public static void main(String[] args) {
        final int YLINOPEUS = 84;
        String[] peltipoliisi = { "ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83" };
        for (int i = 0; i < peltipoliisi.length; i++) {
            String[] tiedot = peltipoliisi[i].split(";");
            int nopeus = Integer.parseInt(tiedot[1]);
            if (nopeus > YLINOPEUS) {
                System.out.println(tiedot[0] + " " + tiedot[1]);
            }
        }
    }
}
