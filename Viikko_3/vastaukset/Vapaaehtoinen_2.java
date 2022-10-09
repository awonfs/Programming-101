

import java.util.Arrays;

public class Vapaaehtoinen_2 {

	public static void main(String[] args) {
		String [] nimet = {"eka","toka","kolmas","nelj�s", "1", "2", "3"};
		int valittuIndex = (int)(Math.random() * nimet.length);
		System.out.println("Valituksi tuli " + nimet[valittuIndex]);
		Arrays.sort(nimet, 0, 3);
		for(int i=0;i<nimet.length;i++) {
			System.out.println(nimet[i]);
		}
	}

}
