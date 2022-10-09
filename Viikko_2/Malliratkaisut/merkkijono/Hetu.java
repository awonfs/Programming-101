package merkkijono;

import java.util.Scanner;

public class Hetu {
	/*
	 * Tee ohjelma, mik� kysyy hetun, tarkastaa sen oikeellisuuden muodoltaan sek�
	 * kertoo syntym�vuoden. Hetun v�limerkki kertoo syntym�vuosisadan: A = 2000 - =
	 * 1900 + = 1800
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String hetu;

		System.out.print("Anna hetu: ");
		hetu = input.nextLine();

		// Tutkitaan, onko hetu haluttua muotoa
		if (!hetu.matches("\\d{6}[A+-]\\d{3}[A-Z0-9]")) {
			System.out.println("Hetu ei ole kelvollinen");
		} else {
			// Otetaan hetusta se osa, joka kertoo syntym�vuoden
			String vuosiStr = hetu.substring(4, 6);
			
			// Muunnetaan merkkijono luvuksi laskemista varten
			int vuosi = Integer.parseInt(vuosiStr);

			// Otetaan hetussa oleva v�limerkki
			String valimerkki = hetu.substring(6, 7);

			// Tukitaan, mik� v�limerkki on ja sen mukaan otetaan vuosista
			if (valimerkki.equals("A")) {
				vuosi = vuosi + 2000;
			} else if (valimerkki.equals("-")) {
				vuosi = vuosi + 1900;
			} else if (valimerkki.equals("+")) {
				vuosi = vuosi + 1800;
			}

			System.out.println("Vuosi on " + vuosi);
		}
		input.close();
	}

}
