package metodi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsunnonMyynti {

	// Metodi kysyy asunnon myyntihinnan ja palauttaa sen return-lausellaa
	public double kysyMyyntihinta() {
		double myyntihinta;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna asunnon myyntihinta: ");
		myyntihinta = input.nextDouble();
		input.close();	
		return myyntihinta;
	}

	// Metodi laskee palkkion ja palauttaa sen return-lausella
	// Metodiin menee parametrina myyntihinta, mist� palkkio lasketaan
	public double laskePalkkio(double myyntihinta) {
		final double PALKKIO = 3.44;
		final double MINPALKKIO = 2214.00;

		double palkkio = myyntihinta * (PALKKIO / 100.0);
		if (palkkio < MINPALKKIO) {
			palkkio = MINPALKKIO;
		}

		return palkkio;
	}

	public static void main(String[] args) {
		// Luokasta tehd��n olio, jolla voidaan kutsua metodeja
		AsunnonMyynti ohjelma = new AsunnonMyynti();

		double myyntihinta, palkkio;
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		// Kutsutaan metodeja
		myyntihinta = ohjelma.kysyMyyntihinta();
		palkkio = ohjelma.laskePalkkio(myyntihinta);
		System.out.println("Myyntipalkkio on " + desimaalit.format(palkkio));
	}
}
