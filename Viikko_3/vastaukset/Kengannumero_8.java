

import java.util.Scanner;

public class Kengannumero_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Anna keng�nnumerosi: ");
 
		// K�ytt�j�n sy�te ei v�ltt�m�tt� ole numero
		try {
			int numero = input.nextInt();
			System.out.println("Keng�nnumero on luku");
		} catch (Exception e) {
			System.out.println("Keng�nnumero ei ole luku");
		}

	}

}
