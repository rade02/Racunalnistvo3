package preverjanje1;

/*
 * Za uporabo dostopnega določila public pri lastnostih razreda veljajo naslednje trditve

Izberite enega ali več:
a. Uporaba tega določila pri atributih je dovoljena samo, če so tudi vse metode v razredu deklariranje kot public.
b. Lastnosti postanejo neposredno dostopne iz katerega koli razreda
c. Dostopno določilo public lahko uporabljamo samo pri metodah, pri lastnostih pa ne.
d. Uporaba tega določila pri lastnostih ni priporočljiva, ker je v nasprotju s konceptom skrivanja informacij.

Katera od naslednjih trditev velja za lastnosti razredov?

Izberite enega:
a. Dostop do lastnosti objekta je mogoč preko indeksa objekta
b. Vse lastnosti razreda morajo biti enakega podatkovnega tipa
c. Vse lastnosti razreda se morajo imenovati enako kot je ime razreda
d. Lastnost razreda je lahko poljubnega podatkovnega tipa
e. Lastnost razreda je lahko le primitivnega podatkovnega tipa

V programskem jeziku Java je objekt primerek

Izberite enega:
a. podatka
b. programa
c. metode
d. razreda

V katerem primeru dobi razred privzeti konstruktor?

Izberite enega:
a. Kadar ima razred zasebne podatke
b. Kadar razred nima drugih konstruktorjev
c. Privzeti konstruktor obstaja v vsakem razredu
d. Kadar za razred definiramo vsaj en konstruktor

Ime razreda

Izberite enega:
a. lahko uporabimo za ime poljubne metode
b. se ne sme uporabiti za poimenovanje metod niti za poimenovanje konstruktorjev
c. moramo uporabiti kot ime za vse konstruktorje
d. moramo uporabiti kot ime za natanko enega izmed konstruktorjev

Katera od naslednjih trditev je pravilna?

Izberite enega ali več:
a. V deklaraciji razreda moramo zapisati natanko en konstruktor
b. Konstruktor je metoda, ki ni povezana z razredom
c. V deklaraciji razreda lahko zapišemo poljubno število konstruktorjev
d. Lahko deklariramo razred, ki nima zapisanega konstruktorja
e. V deklaraciji razreda moramo zapisati vsaj dva konstruktorja
 */

/*
 * Napišite razred BancniRacun, ki ima dve lastnosti:

stanje (trenutni znesek na našem računu) in
limit (dovoljen limit).
V razredu napišite dva konstruktorja:

prvi ne prejme nobenega parametra, stanje nastavi na 0 EUR, limit pa na 500 EUR.
drugi prejme stanje in limit ter z njima nastavi lastnosti.
V razredu napišite še naslednje metode:

polog(znesek), ki prejme poljuben znesek ter z njim poveča stanje na našem računu,
dvig(znesek)*, ki prejme poljuben znesek ter z njim zmanjša stanje na našem računu in vrne true, če je bil dvig uspešen, sicer vrne false,
spremeniLimit(novLimit), ki nastavi nov znesek limita,
pripisObresti(odstotek)**, ki naše stanje poveča za dani odstotek.
vrniStanje(), ki vrne podatek o stanju na našem računu
vrniLimit(), ki vrne podatek o trenutnem limitu našega računa

*Pri dvigu denarja upoštevajte tudi limit. Dvig je lahko uspešen tudi, če na računu nimamo denarja (stanje <= 0), a z dvigom ne smemo prekoračiti limita. V tem primeru metoda vrne false.

**odstotek naj bo poljubna vrednost med 0 in 1.

 */
public class Main1 {

	public static void main(String[] args) {
		
	}

}

class BancniRacun{
	private double stanje;
	private double limit;
	
	public BancniRacun(){
		this.stanje = 0;
		this.limit = 500;
	}
	public BancniRacun(double stanje, double limit){
		this.stanje = stanje;
		this.limit = limit;
	}
	
	public void polog(double znesek){
		stanje += znesek;
	}
	public boolean dvig(double znesek){
		if(znesek <= limit){
			stanje -= znesek;
			return true;
		}
		else return false;
	}
	public void spremeniLimit(double novLimit){
		limit = novLimit;
	}
	public void pripisObresti(double odstotek){
		stanje += stanje*odstotek;
	}
	public double vrniStanje(){
		return stanje;
	}
	public double vrniLimit(){
		return limit;
	}
}
