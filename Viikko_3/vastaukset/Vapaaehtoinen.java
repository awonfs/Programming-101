

import java.util.Scanner;

public class Vapaaehtoinen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lkm;
		String [] nimet;
		System.out.print("Anna osallistujien lukum��r�: ");
		lkm=input.nextInt();
		input.nextLine();
		nimet = new String[lkm];
		for(int i=0;i<lkm;i++) {
			System.out.print("Anna "+(i+1)+".osallistujan nimi: ");
			nimet[i]=input.nextLine();
		}
		int valittuIndex = (int)(Math.random() * lkm);
		System.out.println("Valituksi tuli " + nimet[valittuIndex]);
		input.close();
	}

}
