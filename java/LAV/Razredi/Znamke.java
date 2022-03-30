package razredi;

public class Znamke {	//načrt za objekte
	
	// lastnosti (vidne povsod v razredu - tudi v metodah):
	String drzava;
	int letnica;
	String motiv;
	double cena;
	
	// konstruktorji: ("metoda", ki zgradi objekt)
	// ce ne naredimo konstruktorja, ga samodejno generira (privzeti)
	//isto ime kot razred
	public Znamke(String d, int l, String m, double c)	//prejme 4 parametre
	{
		//parametre (vnesene argumente) bomo shranili v spremenljivke-lastnosti
		drzava = d;
		letnica = l;
		motiv = m;
		cena = c;
	}
	
	// metode:
	public void izpis(){
		System.out.println("Država: " + drzava);
		System.out.println("Letnica: " + letnica);
		System.out.println("Motiv: " + motiv);
		System.out.println("Cena: " + cena);
	}
}
