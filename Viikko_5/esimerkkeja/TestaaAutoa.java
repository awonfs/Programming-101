package esimerkkeja;

public class TestaaAutoa {

	public static void main(String[] args) {
		Auto auto = new Auto("ABC-123");
		auto.setMerkki("Opel");
		auto.setMalli("Astra");
		auto.setVuosi(2010);
		System.out.println(auto);
		
		Auto auto_2 = new Auto("BBB-222", "BMW", "X3", 2015);
		System.out.println(auto_2);
		auto_2.setVuosi(2014);
		System.out.println(auto_2);
		auto_2.setVuosi(auto_2.getVuosi()+1);
		System.out.println(auto_2);

	}

}
