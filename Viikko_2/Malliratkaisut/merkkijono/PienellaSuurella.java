package merkkijono;

import java.util.Scanner;

public class PienellaSuurella {

	/*
	 * Tee ohjelma, jolla voidaan valita, n�ytet��nk� annettu teksti suurilla vai
	 * pienill� kirjaimilla.
	 */

	public static void main(String[] args) {
		String teksti, nayttaminen;

		Scanner input = new Scanner(System.in);

		System.out.print("Kirjoita teksti: ");
		teksti = input.nextLine();

		System.out.print("N�ytet��nk� suurella vai pienell�: ");
		nayttaminen = input.nextLine();

		// Onko k�ytt�j�n antaman merkkijonon sis�lt�n� "pienell�"
		// Voidaan laittaa my�s
		// if (nayttaminen.equals("pienell�")) {
		if (nayttaminen.equals("pienellä") == true) {
			teksti = teksti.toLowerCase();
		} else if (nayttaminen.equals("suurella") == true) {
			teksti = teksti.toUpperCase();
		}

		System.out.println("Teksti on " + nayttaminen + " " + teksti);
		input.close();
	}

}
