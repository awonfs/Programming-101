package merkkijono;

import java.util.Scanner;

public class Nimi {

	/*
	 * Tee ohjelma, joka pyyt�� k�ytt�j�lt� nimen k�ytt�en nextLine()-metodia.
	 * K�ytt�j�n antama nimi muodostuu etu- ja sukunimest�, joiden v�liss� on yksi
	 * v�lily�nti. Ohjelma erottaa nimest� etu- ja sukunimen omiin muuttujiinsa ja
	 * n�ytt�� nimet siten, ett� etunimi alkaa suurella alkukirjaimella ja muut
	 * merkit ovat pienell� ja sukunimi on kokonaan suurella.
	 */

	public static void main(String[] args) {
		String kokonimi, etunimi, sukunimi;
		int valilyonninPaikka;

		Scanner input = new Scanner(System.in);

		System.out.print("Kirjoita etu- ja sukunimesi: ");
		kokonimi = input.nextLine();

		// alusta ja lopusta tyhj�t pois
		kokonimi = kokonimi.trim();

		// etsi v�lily�nti
		valilyonninPaikka = kokonimi.indexOf(" ");
		// erota substringill�
		etunimi = kokonimi.substring(0, valilyonninPaikka);
		etunimi = etunimi.trim();
		sukunimi = kokonimi.substring(valilyonninPaikka + 1);
		sukunimi = sukunimi.trim();

		// muuta eka kirjaimet isoiksi, muut pieniksi
		String ekaKirjain = etunimi.substring(0, 1).toUpperCase();
		String loppuNimi = etunimi.substring(1).toLowerCase();
		etunimi = ekaKirjain + loppuNimi;

		// muuta kaikki kirjaimet suuriksi
		sukunimi = sukunimi.toUpperCase();
		input.close();
	}
	
}
