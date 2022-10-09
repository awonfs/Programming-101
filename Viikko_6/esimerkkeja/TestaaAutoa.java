package esimerkkeja;

public class TestaaAutoa {

	public static void main(String[] args) {
		Auto auto = new Auto();
		System.out.println(auto);
		auto.setRekNo("ABC-123");
		System.out.println(auto);
		Henkilo om = new Henkilo();
		om.seteNimi("Pekka");
		om.setsNimi("Puupää");
		om.setPuhelin("+358501234567");
		auto.setOmistaja(om);
		System.out.println(auto);
		
		Auto auto_2 = new Auto("BBB-222", om);
		System.out.println(auto_2);
		
		System.out.print(auto.getOmistaja().geteNimi());
		System.out.print(" " + auto.getOmistaja().getsNimi() + "\n");
		
		auto.getOmistaja().seteNimi("Pertti");
		System.out.println(auto.getOmistaja());
		System.out.println(auto_2.getOmistaja());
		
	}
}
