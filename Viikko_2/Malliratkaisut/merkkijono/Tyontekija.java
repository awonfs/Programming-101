package merkkijono;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tyontekija {

	public static void main(String[] args) {
		int numero;
		String nimi, tyonkuva;
		double palkka;

		System.out.print("Annan henkil�numero: ");
		Scanner input = new Scanner(System.in);
		numero = input.nextInt();

		System.out.print("Anna nimi: ");
		// Poistetaan luvun j�tt�m� rivinvaihto
		input.nextLine();
		nimi = input.nextLine();
		nimi = nimi.trim();
		nimi = nimi.toUpperCase();

		System.out.print("Anna palkka: ");
		palkka = input.nextDouble();

		System.out.print("Anna ty�kuva: ");
		// Poistetaan luvun j�tt�m� rivinvaihto
		input.nextLine();
		tyonkuva = input.nextLine();
		tyonkuva = tyonkuva.trim();

		System.out.println("Numero: " + numero);
		System.out.println("Nimi: " + nimi);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Palkka: " + desimaalit.format(palkka));
		System.out.println("Ty�nkuva: " + tyonkuva);
		input.close();
	}

}
