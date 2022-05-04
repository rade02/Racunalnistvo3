class kupcekKart{
    private int stevilo;
    private karta[] kupcek = new karta[52];
    priavte String[] barve ) {"kriz", "pik", "kara", "srce"};

    public kupcekKart(){
        this.stevilo = 0;
        for(int i = 0; i < 4; i++){ //napolnim kupcek
            for(int j = 0; j < 13; j++){
                this.dodaj(new karta(barve[i], j+2));
            }
        }
    }
    public kupcekKart(int x){
        this();     //klic drugega konstruktorja - mora biti na zacetku
        System.out.println("klic drugega konstruktorja");
    }

    public void dodaj(karta nova){
        if(stevilo<52){
            kupcek[stevilo] = nova;
            stevilo++;
        }
    }

}

public class vajaKarte{
    public static void main(String[] args){
        karta druga = new karta("pik", 8);
    }
}
