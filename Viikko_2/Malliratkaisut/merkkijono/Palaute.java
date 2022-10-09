package merkkijono;

import java.util.Scanner;

public class Palaute {

	/*
	 * Tee ohjelma, joka kysyy k�ytt�j�lt� palautteen. T�m�n j�lkeen ohjelma kertoo
	 * palautteen pituuden. Jos palautteessa on ?-merkki, ohjelma kertoo, ett�
	 * kysymykseen vastataan mahdollisimman pian. Muuten ohjelma kertoo, ett�
	 * palaute on otettu vastaan.
	 */

	public static void main(String[] args) {
		String palaute;

		Scanner input = new Scanner(System.in);

		System.out.print("Kirjoita palautteesi: ");
		palaute = input.nextLine();

		System.out.println("Palautteesi pituus oli " + palaute.length() + " merkki�.");

		// Tutkitaan, onko merkkijonossa ? merkki�
		// indexOf palauttaa osamerkkijonon (?) paikan merkkojonossa tai -1, jos sit� ei
		// ole
		if (palaute.indexOf("?") != -1) {
			System.out.println("Kysymykseesi vastataan mahdollisimman pian.");
		} else {
			System.out.println("Palautteesi on otettu vastaan.");
		}
		input.close();
	}

}
