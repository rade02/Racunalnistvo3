public class ObjektiInDedovanje {
    public static void main(String[] args){

        TocenCas merjenje = new TocenCas(10, 32, 15);
        merjenje.izpis();

    }
}

class Cas{
    int ura;
    int min;
    Cas(){
        this.ura = 0;
        this.min = 0;
    }
    Cas(int x, int y){
        this.ura = x;
        this.min = y;
    }
    public void izpis(){
        System.out.println(this.ura + ":" + this.min);
    }
}

class TocenCas extends Cas{
    int sek;
    TocenCas(){
        super();
        this.sek = 0;
    }
    TocenCas(int a){
        this.sek = a;
    }
    TocenCas(int x, int y, int z){
        /* moznost 1:
            this.ura = x;
            this.min = y;
            this.sek = z;
        */
        /* moznost 2: */
        super(x, y);
        this.sek = z;
    }
    public void izpis(){
        System.out.println(this.ura + ":" + this.min + ":" + this.sek);
    }
}
