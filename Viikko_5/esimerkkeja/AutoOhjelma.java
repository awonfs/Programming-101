package esimerkkeja;

import java.util.Scanner;

public class AutoOhjelma {
	Auto auto;
	Scanner input = new Scanner(System.in);
	
	private void teeAuto() {
		System.out.print("Anna rekisterinumero:");
		String rekNo = input.next();
		input.nextLine();
		System.out.print("Anna merkki:");
		String merkki = input.nextLine();
		System.out.print("Anna malli:");
		String malli = input.nextLine();
		System.out.print("Anna vuosimalli:");
		int vuosi = input.nextInt();
		input.nextLine();
		auto = new Auto(rekNo, merkki, malli, vuosi);		
	}
	
	private void naytaAuto() {
		System.out.println(auto);		
	}
	private void muutaVuosi() {
		System.out.print("Anna uusi vuosimalli:");
		auto.setVuosi(input.nextInt());
		input.nextLine();
	}
	private void muutaMalli() {
		System.out.print("Anna uusi malli:");
		auto.setMalli(input.nextLine());
		
	}
	private void naytaMerkkiMalli() {
		System.out.println(auto.getMerkki() + " " + auto.getMalli());
	}
	public static void main(String[] args) {
		AutoOhjelma ohjelma = new AutoOhjelma();
		Scanner input = new Scanner(System.in);
		ohjelma.teeAuto();
		boolean jatkuu=true;
		do {
			System.out.println("0. Lopeta:");
			System.out.println("1. Muuta mallia:");
			System.out.println("2. Muuta vuotta:");
			System.out.println("3. Näytä tiedot:");
			System.out.println("4. Näytä merkki ja malli:");
			System.out.print("Anna valintasi:");
			switch (input.nextInt()) {
			case 0: 
				jatkuu=false;
				break;
			case 1:
				ohjelma.muutaMalli();
				break;
			case 2:
				ohjelma.muutaVuosi();
				break;
			case 3:
				ohjelma.naytaAuto();
				break;
			case 4:
				ohjelma.naytaMerkkiMalli();
				break;
			default:
				System.out.println("Valinta ei kelpaa!");
			}
		} while (jatkuu);
		input.close();
	}

	

	

	



	

	

}
