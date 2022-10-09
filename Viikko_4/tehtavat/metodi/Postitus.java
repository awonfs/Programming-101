package metodi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Postitus {

	public double kysyJaLaskePainot() {
		double paino, yhteispaino = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Anna paino (-1 lopettaa): ");
		paino = input.nextDouble();

		// Kun paino on erisuuri kuin -1
		while (paino != -1) {
			// Lasketaan yhteispainoon annettu paino, jos paino on suurempi kuin
			// 0
			if (paino > 0) {
				yhteispaino = yhteispaino + paino;
			}

			System.out.println("Anna paino (-1 lopettaa): ");
			paino = input.nextDouble();
			input.close();
		}

		return yhteispaino;
	}

	public void naytaPostituskulut(double yhteispaino) {
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Yhteispaino on " + desimaalit.format(yhteispaino) + " kiloa.");

		if (yhteispaino > 100) {
			System.out.println("Postituskulut on 19,00 euroa.");
		} else if (yhteispaino >= 20) {
			System.out.println("Postituskulut on 14,00 euroa.");
		} else {
			System.out.println("Postituskulut on 8,10 euroa.");
		}
	}

	public static void main(String[] args) {
		// T�ytyy luoda Postitus luokan olio, jotta metodeja voidaan kutsua
		Postitus ohjelma = new Postitus();

		// Kutsutaan metodia, palauttaa double tyyppisen arvon
		double yhteispaino = ohjelma.kysyJaLaskePainot();
		// Kutsutaan metodia, ei palauta mit��n, vied��n parametrina double tyyppisen
		// luvun arvo
		ohjelma.naytaPostituskulut(yhteispaino);
	}

}
