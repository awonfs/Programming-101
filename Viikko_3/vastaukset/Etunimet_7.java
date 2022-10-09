

public class Etunimet_7 {


	public static void main(String[] args) {
		String[] tiedot = { "Maria,199 618", "Helena,124 591", "Anneli,122 495", "Johanna,112 472", "Juha,45 067",
				"Timo,44 991", "Matti,43 517", "Kari,40 622", "Mikko,38 765" };

		for (int i = 0; i < tiedot.length; i++) {
			String[] tieto = tiedot[i].split(",");
			System.out.println(tieto[0] + " " + tieto[1] + " kpl");
		}

	}

}
