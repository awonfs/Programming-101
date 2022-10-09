package merkkijono;

import java.util.Scanner;

public class Sananlasku {

	public static void main(String[] args) {
		String sananlasku;
		int lkm = 0, kirjaimia = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna sananlasku: ");
		sananlasku = input.nextLine();

		// while (sananlasku.equals("LOPPU") != true) {
		// Toisteena niin kauan kuin sananlasku ei ole LOPPU
		while (! sananlasku.equals("LOPPU")) {
			// Lis�t��n sananlaskujen m��r��
			lkm = lkm + 1;
			
			// Lis�t��n sananlaskuissa olevaa merkkien m��r��
			kirjaimia = kirjaimia + sananlasku.length();

			System.out.print("Anna sananlasku: ");
			sananlasku = input.nextLine();
		}

		System.out.println("Sananlaskuja oli " + lkm + " kappaletta.");
		System.out.println("Sananlaskuissa oli merkkej� yhteens� " + kirjaimia);
		input.close();
	}

}
