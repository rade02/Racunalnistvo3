public class IgraSKartami2 {
    public static void main(String[] args){
        
        String[] barve = {"pik", "karo", "kriz", "srce"};

        /*
        int stevec = 0;
        Karta[] kup = new Karta[52];
        
        for(String barva : barve){
            for(int i = 2; i <= 14; i++){
                kup[stevec++] = new Karta(i, barve[j]);
            }
        }
        */

        //ustvarimo kup obicajnih kart
        Kup celoten = new Kup(52);
        for(String barva : barve){
            for(int i = 2; i <= 14; i++){
                celoten.dodajKarto(new Karta(i, barva));
            }
        }

        celoten.premesaj(100);
        celoten.prikaziKup();

        //razdelimo karte iz premesanega kupa
        Igralec prviIgralec = new Igralec(26);
        Igralec drugiIgralec = new Igralec(26);

        for(int i = 0; i < celoten.velikost; i+=2){
            prviIgralec.dodajKarto(celoten.vzemiKarto());
            drugiIgralec.dodajKarto(celoten.vzemiKarto());
        }
        /*
        System.out.println("----------^celoten kup^----------");
        prviIgralec.prikaziKup();
        System.out.println("----------^kup prvega^----------");
        drugiIgralec.prikaziKup();
        System.out.println("----------^kup drugega^----------");
        */

        //simulacija igre igralcev
        System.out.println("----------ˇigraˇ----------");
        int stKart = celoten.velikost/2;
        while(stKart > 0){
            int rezultat = prviIgralec.primerjaj(drugiIgralec);
            if(rezultat == 1){
                prviIgralec.tocke++;
                System.out.println("Prvi zmaga");
            }
            else if(rezultat == -1){
                drugiIgralec.tocke++;
                System.out.println("Drugi zmaga");
            }
            else{
                System.out.println("Izenaceno");
            }
            stKart--;
        }
        System.out.println((prviIgralec.tocke == drugiIgralec.tocke) ? ("IZENACEN KONCNI REZULTAT") : ("ZMAGAL JE " + ((prviIgralec.tocke > drugiIgralec.tocke) ? ("PRVI IGRALEC, Z "):("DRUGI IGRALEC, Z ")) + Math.max(prviIgralec.tocke, drugiIgralec.tocke) + " TOCKAMI."));
    }
}

class Igralec extends Kup{
    public int tocke;

    public Igralec(int velikost){
        super(velikost);
        tocke = 0;
    }

    public int primerjaj(Igralec a){
        Karta prvi = this.vzemiKarto();
        Karta drugi = a.vzemiKarto();
        if(prvi.stevilo > drugi.stevilo){
            return 1;
        } 
        else if(prvi.stevilo < drugi.stevilo){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class Kup{
    public Karta[] kup;
    public int velikost;
    public int stevecNapolnjenosti;

    public Kup(int velikost){
        this.velikost = velikost;
        this.kup = new Karta[velikost];
        stevecNapolnjenosti = 0;
    }

    public void dodajKarto(Karta a){
        kup[stevecNapolnjenosti++] = a;
    }

    public void premesaj(int menjav){
        int naklj1, naklj2;
        for(int i = 0; i < menjav; i++){
            naklj1 = (int)(Math.random()*velikost);
            naklj2 = (int)(Math.random()*velikost);
            Karta tmp = kup[naklj1];
            kup[naklj1] = kup[naklj2];
            kup[naklj2] = tmp;
        }
    }

    public void prikaziKup(){
        for(int i = 0; i < velikost; i++){
            System.out.println(kup[i].barva + " " + kup[i].stevilo);
        }
    }

    public Karta vzemiKarto(){
        return kup[--stevecNapolnjenosti];
    }

}

class Karta{
    public int stevilo;
    public String barva;

    public Karta(int stevilo, String barva){
        this.stevilo = stevilo;
        this.barva = barva;
    }

    public void pokaziKarto(){
        System.out.println(barva + " " + stevilo);
    }
}
