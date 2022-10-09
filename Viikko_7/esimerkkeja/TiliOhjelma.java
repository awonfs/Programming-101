package esimerkkeja;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TiliOhjelma {
	Scanner input = new Scanner(System.in);
	ArrayList<Tili> tilit = new ArrayList<Tili>();
	DecimalFormat des = new DecimalFormat("0.00");
		
	private void aja() {
		teeTileja();
		naytaValikko();		
	}
	private void naytaValikko() {
		boolean jatkuu=true;
		do {
			System.out.println("1. Tee tili");
			System.out.println("2. Otto");
			System.out.println("3. Pano");
			System.out.println("4. Näytä tili");
			System.out.println("5. Näytä kaikki tilit");
			System.out.println("6. Poista tili");
			System.out.println("0. Lopeta");
			System.out.print("Anna valintasi: ");
			switch (input.nextInt()) {
			case 1:
				teeTili();
				break;
			case 2:
				teeOtto();
				break;
			case 3:
				teePano();
				break;
			case 4:
				naytaTili();
				break;
			case 5:
				naytaKaikkiTilit();
				break;
			case 6:
				poistaTili();
				break;
			case 0:
				jatkuu=false;
				break;
			default:
				System.out.println("Valinta ei kelpaa!");
			}
		} while (jatkuu);		
	}
		
	private int etsiTili() {
		input.nextLine();
		int paluuArvo=-1;
		System.out.print("Anna tilinumero: ");
		String numero = input.next();
		for(int i=0;i<tilit.size();i++) {
			if(tilit.get(i).getNumero().equalsIgnoreCase(numero)){
				paluuArvo=i;
				break;
			}
		}
		if(paluuArvo==-1) {
			System.out.println("Tiliä ei ole numerolla " + numero);
		}
		return paluuArvo;
	}
	
	private void teeTili() {
		Tili tili = new Tili();
		input.nextLine();
		System.out.print("Anna tilinumero: ");
		tili.setNumero(input.nextLine());
		System.out.print("Anna alkusaldo: ");
		tili.setSaldo(input.nextDouble());
		tilit.add(tili);		
	}
	private void teeOtto() {
		int idx = etsiTili();
		if(idx==-1) {			
			return;
		}
		System.out.print("Oton määrä:");
		double maara = input.nextDouble();
		if(tilit.get(idx).otto(maara)) {
			System.out.print("Tilin saldo oton jälkeen ");
			System.out.print(des.format(tilit.get(idx).getSaldo()) + "\n");
		}else {
			System.out.println("Otto ei onnistunut.");
		}
	}
	private void teePano() {
		int idx = etsiTili();
		if(idx==-1) {			
			return;
		}
		System.out.print("Anna panon määrä:");
		tilit.get(idx).pano(input.nextDouble());
		System.out.println("Pano tehty");
		
	}
	private void naytaTili() {
		int idx = etsiTili();
		if(idx==-1) {			
			return;
		}
		System.out.println("Tilinumero: "+tilit.get(idx).getNumero());
		System.out.println("Saldo: "+tilit.get(idx).getSaldo());
		
	}
	private void naytaKaikkiTilit() {
		for(Tili tili: tilit) {
			System.out.println("Tilinumero: "+tili.getNumero());
			System.out.println("Saldo: "+tili.getSaldo());
		}			
	}
	private void poistaTili() {
		int idx = etsiTili();
		if(idx==-1) {			
			return;
		}
		String numero = tilit.get(idx).getNumero();
		tilit.remove(idx);
		System.out.println("Tili poistettiin numerolla " + numero );
		
	}
	private void teeTileja() {
		tilit.add(new Tili("11111", 1000.0));
		tilit.add(new Tili("22222", 2000.0));
		tilit.add(new Tili("33333", 3000.0));
		tilit.add(new Tili("44444", 4000.0));		
	}
	public static void main(String[] args) {
		TiliOhjelma ohjelma = new TiliOhjelma();
		ohjelma.aja();
	}	

}
