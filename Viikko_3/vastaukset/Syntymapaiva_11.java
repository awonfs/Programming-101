

import java.time.LocalDate;
import java.util.Scanner;

public class Syntymapaiva_11 {
	/*
	 * Tee ohjelma, joka kysyy syntym�p�iv�si merkkijonona ja muuntaa sen
	 * LocalDate-luokan olioksi. Selvit� sen j�lkeen k�ytt�j�n syntym�vuosi. Kerro,
	 * jos se on tulevaisuudessa.
	 * 
	 */

	public static void main(String[] args) {
		LocalDate spaiva; // P�iv�m��r� muuttuja
		String paiva; // K�ytt�j�lt� kysytt�v� p�iv�m��r�
		Scanner input = new Scanner(System.in);

		System.out.print("Anna syntym�p�iv�si (vvvv-kk-pp): ");
		paiva = input.nextLine();

		// Koska k�ytt�j�n antama sy�te ei v�ltt�m�tt� ole p�iv�m��r�ksi kelpaava, tehd��n poikkeuslohko
		try {
			// Muutetaan merkkijono p�iv�m��r�ksi. 
			// Jos parse ei onnistu siirryt��n catch-lohkoon
			spaiva = LocalDate.parse(paiva);
			
			// Otetaan vuosi
			int vuosi = spaiva.getYear();

			// Otetaan nykyinen vuosi
			int nytVuosi = LocalDate.now().getYear();

			// Jos syntym�p�iv�n vuosi on suurempi kuin nykyinen vuosi
			if (vuosi > nytVuosi) {
				System.out.println("Syntym�vuosi ei voi olla tulevaisuudessa ");
			} else {
				System.out.println("Syntym�vuosi on " + vuosi);
			}
		} catch (Exception error) {
			System.out.println("Syntym�p�iv� on virheellinen");
		}

	}

}
