package cvicenie5;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obyvatel defaultny = new Obyvatel("Adam", 180, 90);
		Obyvatel klon = defaultny;
		System.out.println(defaultny.getMeno());
		defaultny.setMeno("Eva");
		System.out.println(defaultny.getMeno());
		System.out.println(klon.getMeno());
		
		Clovek typek = new Clovek("Adam", 1997);
		typek.vypisInformacie(typek);
		
		Scanner vstup = new Scanner(System.in);
		int i = 0;
		while(vstup.hasNext()) {  // NEFUNGUJE !
			ArrayList<O> osoby = new ArrayList<O>();
			O osoba = new O(vstup.next(), vstup.nextInt());
			osoby.add(osoba);
			
			i++;
			System.out.printf("Aktualny pocet instancii: %d", osoby.size());
		}
	}

}
