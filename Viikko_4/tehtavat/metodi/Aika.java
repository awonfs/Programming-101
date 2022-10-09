package metodi;

import java.util.Scanner;

public class Aika {

	public String kysyMinuutit() {
		Scanner input = new Scanner(System.in);
		String minuutit;

		System.out.print("Anna aika minuutteina: ");
		minuutit = input.nextLine();
		input.close();
		return minuutit;
	}

	public boolean tarkastaMinuutit(String minuutit) {
		if (minuutit.matches("\\d+")) {
			return true;
		} else {
			return false;
		}
	}
	public String muutaAjaksi(String minuutit) {
		String aika;
		int tunti, min;

		tunti = Integer.parseInt(minuutit) / 60;
		min = Integer.parseInt(minuutit) - (tunti * 60);

		if (min < 10) {
			aika = tunti + ":0" + min;
		} else {
			aika = tunti + ":" + min;
		}

		return aika;

	}

	public void naytaKellonaika(String kellonaika) {
		System.out.println("Tunteina ja minuutteina " + kellonaika);
	}

	public static void main(String[] args) {
		// On luotava luokan olio, jotta metodeja voidaan kutsua
		Aika ohjelma = new Aika();

		String minuutit;
		String kellonaika;

		minuutit = ohjelma.kysyMinuutit();

		if (ohjelma.tarkastaMinuutit(minuutit) == true) {
			kellonaika = ohjelma.muutaAjaksi(minuutit);
			ohjelma.naytaKellonaika(kellonaika);
		} else {
			System.out.println("Ei kelpaa luvuksi");
		}
	}

}
