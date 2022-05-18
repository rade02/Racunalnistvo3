package preverjanje1;

/*
 * Dan je razred:

class Atlet {
  int startna_st;
  String drzava;

  public Atlet(int ss, String d) {startna_st = ss; drzava = d;}

  public void izpis()
  {
    System.out.println("Startna številka: " + startna_st);
    System.out.printl("Država: " + drzava);
  }
}
Izdelaj podrazred Skakalec, ki vsebuje še tri dodatne lastnosti:

dolžina prvega skoka,
dolžina drugega skoka,
dolžina tretjega skoka.
Izdelaj konstruktor, ki bo lahko izdelal objekt z vsemi lastnostmi.

Izdelaj še metode:

najboljsiSkok(), ki vrne dolžino najdaljšega skoka.
boljsi(Skakalec s), ki vrne true, če je najboljši skok tega skakalca daljši od najboljšega skoka skakalca s.
izpis(), ki izpiše vse lastnosti Skakalca skupaj z njegovim najboljšim skokom.
 */
public class Main2 {

}

class Atlet {
	  int startna_st;
	  String drzava;

	  public Atlet(int ss, String d) {startna_st = ss; drzava = d;}

	  public void izpis()
	  {
	    System.out.println("Startna številka: " + startna_st);
	    System.out.println("Država: " + drzava);
	  }
}

class Skakalec extends Atlet{
	double prvi;
	double drugi;
	double tretji;
	public Skakalec(int ss, String d, double p, double dr, double t){
		super(ss, d);
		this.prvi = p;
		this.drugi = dr;
		this.tretji = t;
	}
	public double najboljsiSkok(){
		return Math.max(Math.max(prvi, drugi), tretji);
	}
	public boolean boljsi(Skakalec s){
		if(this.najboljsiSkok() > s.najboljsiSkok())
			return true;
		else return false;
	}
	public void izpis(){
		super.izpis();
		System.out.println(prvi + " " + drugi + " " + tretji);
		System.out.println(this.najboljsiSkok());
	}
}
