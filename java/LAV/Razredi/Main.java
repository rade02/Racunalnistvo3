package razredi;

public class Main {

	public static void main(String[] args) {
		
		Znamke z1 = new Znamke("Slovenija", 2018, "gore", 0.9);	//s konstruktorjem, ki smo ga mi ustvarili --> vanj pošljemo argumente, ki se zapišejo v parametre
		//Znamke z2 = new Znamke();	//s klicom privzetega konstruktorja (ko še nismo definirali našega konstruktorja)
		/*z1.drzava = "Slovenija";
		z1.letnica = 2018;
		z1.motiv = "gore";
		z1.cena = 0.9;
		*/
		
		Znamke z2 = new Znamke("Italija", 2005, "morje", 1.1);
		
		Znamke[] album = new Znamke[1000];
		
		/*z2.drzava = "Italija";
		z2.cena = 1.1;*/
		
		//ce String ni definiran, je null
		//ce int ni definiran, je 0
		
		//System.out.println(z1.drzava);
		//System.out.println(z2.cena + " €");
		z1.izpis();
		System.out.println();
		z2.izpis();

	}

}

/*public class znamke {
	
	/*
	 * razred je kot podatkovni tip, ki ga določi uporabnik (ponavadi damo v svojo datoteko)
	 * 
	 * class Znamke{	//načrt za objekte
	 * 		//lastnosti:
	 * 			String drzava;
	 * 			int letnica;
	 * 			String motiv;
	 * 			double cena;
	 * 		//konstruktorji: ("metoda", ki zgradi objekt)
	 * 		//metode:
	 * }
	 *
	
	static class Znamka{
		//lastnosti:
		String drzava;
		int letnica;
		String motiv;
		double cena;
	}

	public static void main(String[] args) {
		
		Znamka z1 = new Znamka();
		//razred: Znamka, objekt: z1, konstruktor: Znamka()
		z1.drzava = "Slovenija";
		z1.letnica = 2018;
		z1.motiv = "gore";
		z1.cena = 0.9;
		

	}

	
}*/

