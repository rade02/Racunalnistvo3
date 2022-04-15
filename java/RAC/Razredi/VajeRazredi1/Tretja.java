public class Tretja {
    public static void main(String[] args){

        Pravokotnik P1 = new Pravokotnik(3.3, 7.5);

        Pravokotnik P2 = new Pravokotnik(7.5, 3.3);

        //PRIMERJAVA PLOSCIN
        if(P1.ploscina() >= P2.ploscina()){
            if(P1.ploscina() > P2.ploscina())
                System.out.println("P1 ima vecjo ploscino");
            else
                System.out.println("Oba imata enako ploscino");
        }
        else{
            System.out.println("P2 ima vecjo ploscino");
        }
        System.out.println();

        //TABELA PRAVOKOTNIKOV
        Pravokotnik[] tab = new Pravokotnik[10];
        double najObseg = 0;
        int indeksNaj = 0;
        for(int i = 0; i < tab.length; i++){
            tab[i] = new Pravokotnik(Math.random()*5 + 1, Math.random()*5 + 1);
            if(2*tab[i].stranica1 + 2*tab[i].stranica2 > najObseg){
                najObseg = 2*tab[i].stranica1 + 2*tab[i].stranica2;
                indeksNaj = i;
            }
        }
        System.out.print("Najvecji obseg ima pravokotnik: tab[" +  indeksNaj + "], in sicer: ");
        System.out.printf("%.3f.\n", najObseg);

        //izpis tabele
        System.out.print("Prva stranica:  [");
        for(int j = 0; j < tab.length; j++){
            System.out.printf("%.2f, ", tab[j].stranica1);
        }
        System.out.println("\b\b]");
        System.out.print("Druga stranica: [");
        for(int k = 0; k < tab.length; k++){
            System.out.printf("%.2f, ", tab[k].stranica2);
        }
        System.out.println("\b\b]");
    }
}

class Pravokotnik{
    public double stranica1;
    public double stranica2;

    Pravokotnik(double a, double b){
        this.stranica1 = a;
        this.stranica2 = b;
    }

    public double ploscina(){
        return this.stranica1 * this.stranica2;
    }
}
