package esimerkkeja;

import java.util.Scanner;

public class AutoOhjelma {
	Auto auto;
	Scanner input = new Scanner(System.in);
	
	public AutoOhjelma() {
		auto = new Auto();		
	}
	
	private void aja() {	
		teeAuto();
		naytaValikko();
	}
	
	private void naytaValikko() {
		boolean jatkuu=true;
		do {
			System.out.println("0. Lopeta:");
			System.out.println("1. Muuta mallia:");
			System.out.println("2. Muuta vuotta:");
			System.out.println("3. Näytä tiedot:");
			System.out.println("4. Näytä merkki ja malli:");
			System.out.println("5. Anna autolle omistaja:");
			System.out.println("6. Vaihda etunimi:");
			System.out.println("7. Vaihda sukunimi:");
			System.out.print("Anna valintasi:");
			switch (input.nextInt()) {
			case 0: 
				jatkuu=false;
				break;
			case 1:
				muutaMalli();
				break;
			case 2:
				muutaVuosi();
				break;
			case 3:
				naytaAuto();
				break;
			case 4:
				naytaMerkkiMalli();
				break;
			case 5:
				annaOmistaja();
				break;
			case 6:
				vaihdaOmistajanNimi("e");
				break;
			case 7:
				vaihdaOmistajanNimi("s");
				break;
			default:
				System.out.println("Valinta ei kelpaa!");
			}			
		} while (jatkuu);
		
	}
	
	private void vaihdaOmistajanNimi(String tyyppi) {
		if(auto.getOmistaja()==null) {
			System.out.println("Omistajaa ei ole olemassa.");
			return;
		}
		input.nextLine();
		if(tyyppi.equalsIgnoreCase("e")) {
			System.out.print("Anna uusi etunimi: ");
			String eNimi = input.nextLine();
			auto.getOmistaja().seteNimi(eNimi);
		}else {
			System.out.print("Anna uusi sukunimi: ");
			String sNimi = input.nextLine();
			auto.getOmistaja().setsNimi(sNimi);
		}		
	}

	private void annaOmistaja() {
		Henkilo omistaja = new Henkilo();
		input.nextLine();
		System.out.print("Anna omistajan etunimi:");
		omistaja.seteNimi(input.nextLine());
		System.out.print("Anna omistajan sukunimi:");
		omistaja.setsNimi(input.nextLine());
		System.out.print("Anna omistajan puhelin:");
		omistaja.setPuhelin(input.nextLine());
		auto.setOmistaja(omistaja);
	}

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

	private void muutaMalli() {
		System.out.print("Anna uusi malli:");
		auto.setMalli(input.nextLine());
	}

	private void muutaVuosi() {
		System.out.print("Anna uusi vuosimalli:");
		auto.setVuosi(input.nextInt());
		input.nextLine();
	}

	private void naytaAuto() {
		System.out.println(auto);	
	}

	private void naytaMerkkiMalli() {
		System.out.println(auto.getMerkki() + " " + auto.getMalli());
	}

	public static void main(String[] args) {
		AutoOhjelma ohjelma = new AutoOhjelma();
		ohjelma.aja();
	}	
}
