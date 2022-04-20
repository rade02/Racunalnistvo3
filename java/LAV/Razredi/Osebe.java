public class Main{
    public static void main(String[] args){
        Oseba prva = new Oseba("Janez", "Novak", "1");
        Oseba druga = new Oseba("Janez", "Priimek", "2");
        Oseba tretja = new Oseba("Anze", "Pintar", "3");
        Oseba cetrta = new Oseba("Car", "Car", "4");
        //prva.izpis();

        Imenik mojImenik = new Imenik(10);
        mojImenik.dodajOsebo(prva);
        mojImenik.dodajOsebo(druga);
        mojImenik.izpisImenika();
        System.out.println();

        mojImenik.izbrisi("Janez", "Novak");

        mojImenik.izpisImenika();
        System.out.println();
        mojImenik.dodajOsebo(tretja);
        mojImenik.izpisImenika();
        System.out.println("---------------------");
        mojImenik.dodajOsebo(cetrta);
        mojImenik.izpisImenika();
        System.out.println();
    }
}
class Oseba{
    //lastnosti
    public String ime;
    public String priimek;
    public String id;   //ce shranimo v stevilcno stevilko, pri Sysout zgubimo ničle na začetku

    //konstruktorji
    public Oseba(String i, String priimek, String id){
        ime = i;    //ker je parameter poimenovan drugace, je lahko brez this
        this.priimek = priimek;
        this.id = id;
    }

    //metode
    public void izpis(){
        System.out.println("ime: " + this.ime + "\npriimek: " + this.priimek + "\nID: " + id);  //this ni obvezen, ker so spremenljivke ze vidne v vseh konstruktorjih in metodah razreda
    }
}
class Imenik{
    //lastnosti
    Oseba[] osebe;  //dolocimo samo podatkovni tip
    public int stevec = 0;

    //konstruktorji
    public Imenik(int velikost){
        osebe = new Oseba[velikost];
    }
    //metode
    public void dodajOsebo(Oseba o){
        if(osebe[stevec] != null){
            for(int i = 0; i < osebe.length; i++){
                if(osebe[i] == null)
                    stevec = i;
            }
        }
        else
            osebe[stevec++] = o;
    }
    public void izpisImenika(){
        for(int i = 0; i < osebe.length; i++){
            if(osebe[i] != null) osebe[i].izpis();
        }
    }
    public void izbrisi(String ime, String priimek){
        int indeks = 0;
        int praviIndeks = 0;
        for(int i = 0; i < osebe.length; i++){
            if(osebe[indeks].ime.equals(ime) && osebe[indeks].priimek.equals(priimek)){
                praviIndeks = indeks;
                break;
            }
            indeks++;
        }
        osebe[praviIndeks] = null;
        stevec = praviIndeks;   //stevec nastavimo na prazno mesto
    }

    public void brisi(String ime, String priimek){
        int idx = isci(ime, priimek);
        if(idx >= 0){
            osebe[idx] = osebe[--index];
            /*for(int i = idx; i < osebe.length - 1; i++){
                osebe[i] = osebe[i + 1];
            }*/
        }
    }
}
