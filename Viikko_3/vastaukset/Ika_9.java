

import java.util.Scanner;

public class Ika_9 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Anna ik�si (0-120): ");

		// Koska annettu sy�te ei v�ltt�m�tt� ole kokonaisluku
		try {
			// Jos ei anneta kokonaislukua, laukeaa poikkeus
			int ika = input.nextInt();
			if (ika >= 0 && ika <= 120) {
				System.out.println("Ik� on v�lilt� 0-120");
			} else {
				System.out.println("Ik� pit�� olla v�lilt� 0-120");
			}
		// Jos halutaan yksil�id� kiinni otettava poikkeus
		} catch (Exception InputMismatchException) {
			System.out.println("Ik� pit�� olla kokonaisluku" );
		} 	
		/* T�ll� otetaan kiinni kaikki poikkeukset
		catch (Error e) {
		  System.out.println("Ik� pit�� olla kokonaisluku");
		}
		*/
	}

}
