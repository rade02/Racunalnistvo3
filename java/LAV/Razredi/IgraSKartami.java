public class IgraSKartami {

	public static void main(String[] args) {
		/*
		 * Karta k = new Karta("pik", 14);
		 * k.izpis();
		 */
		
		//Karta[] vseKarte = new Karta[52];
		DelilniZep vseKarte = new DelilniZep(52);
		String[] barve = {"srce", "pik", "karo", "kriz"};
		//int stevec = 0;
		for(String barva : barve){
			for(int vrednost = 2; vrednost <= 14; vrednost++){
				//vseKarte[stevec++] = new Karta(barva, vrednost);
				vseKarte.dodajKarto(new Karta(barva, vrednost));
			}
		}
		/*System.out.println("\nKarte pred mesanjem: ");
		vseKarte.izpis();
		vseKarte.premesaj();
		System.out.println("\nKarte po mesanju: ");
		vseKarte.izpis();*/
		vseKarte.premesaj();
		
		DelilniZep igralec1 = new DelilniZep(26);
		DelilniZep igralec2 = new DelilniZep(26);
		
		for(int i = 0; i < 26; i++){
			igralec1.dodajKarto(vseKarte.vzemiKarto());
			igralec2.dodajKarto(vseKarte.vzemiKarto());
		}
		
		/*System.out.println("Karte prvega igralca: ");
		igralec1.izpis();
		System.out.println("Karte drugega igralca: ");
		igralec2.izpis();*/
		
		//izdelava igre
		for(int i = 0; i < 26; i++){
			Karta k1 = igralec1.vzemiKarto();
			Karta k2 = igralec2.vzemiKarto();
			
			if(k1.primerjaj(k2) == 1){
				System.out.println("Zmagal je igralec 1");
			}
			else if(k1.primerjaj(k2) == -1){
				System.out.println("Zmagal je igralec 2");
			}
			else{
				System.out.println("Neodloceno");
			}
		}
	}

}

class Karta{
	//lastnosti
	public String barva;	/*pik, karo, kriz, srce*/
	public int vrednost;	/*2, 3, 4, ... 14*/
	
	//konstruktorji
	public Karta(String barva, int vrednost){
		this.barva = barva;
		this.vrednost = vrednost;
	}
	
	//metode
	public void izpis()
	{
		System.out.println("Barva: " + barva + "(" + vrednost + ")");
	}
	public int primerjaj(Karta k)
	{
		/*
		 * izpis();
		 * k.izpis();
		 */
		if(this.vrednost > k.vrednost){
			return 1;
		}
		else if(this.vrednost < k.vrednost){
			return -1;
		}
		else{
			return 0;
		}
	}
}

class DelilniZep{
	//lastnosti
	public Karta[] dz;
	private int index = 0;
	
	//konstruktorji
	public DelilniZep(int kapaciteta){
		dz = new Karta[kapaciteta];
	}
	
	//metode
	public void premesaj()
	{
		int index1, index2;
		for(int i = 0; i < 1000; i++){
			index1 = (int)(Math.random()*dz.length);
			index2 = (int)(Math.random()*dz.length);
			Karta tmp = dz[index1];
			dz[index1] = dz[index2];
			dz[index2] = tmp;
		}
	}
	public void dodajKarto(Karta k)
	{
		dz[index++] = k;
	}
	public void izpis()
	{
		for(int i = 0; i < dz.length; i++){
			dz[i].izpis();
		}
	}
	public Karta vzemiKarto()
	{
		return dz[--index];	//index je za en vec kot je kart (prvi je 0)
	}
	
}
