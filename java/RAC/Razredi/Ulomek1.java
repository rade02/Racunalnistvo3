public class Ulomek1 {
    public static void main(String[] args){

        Ulomek prvi = new Ulomek(10, 5);    
        prvi.pokrajsaj(true);   //ce je parameter true, bo izpisalo okrajsan ulomek
        Ulomek drugi = new Ulomek(61, 30);
        
        if(prvi.enak(drugi))
            System.out.println("Sta enaka");
        else
            System.out.println(prvi.st + "/" + prvi.im + " ni enak " + drugi.st + "/" + drugi.im);
    }
}

class Ulomek{
    public int st;
    public int im;

    Ulomek(int stevec, int imenovalec){
        this.st = stevec;
        this.im = imenovalec;
    }

    Ulomek(int k){
        this.st = k;
        this.im = 1;
    }

    public boolean enak(Ulomek a){
        this.pokrajsaj(false);
        a.pokrajsaj(false);
        if(this.st == a.st && this.im == a.im)
            return true;
        else
            return false;
    }

    public void pokrajsaj(boolean izpisi){
        int najvecji_skupni_delitelj = skupniDelitelj(this.st, this.im);

        this.st /= najvecji_skupni_delitelj;
        this.im /= najvecji_skupni_delitelj;
        if(izpisi) System.out.println(this.st + "/" + this.im);
    }

    private int skupniDelitelj(int stevec, int imenovalec){
        int min = Math.min(stevec, imenovalec);
        int i = min;
        for(; i >= 1; i--){
            if(stevec % i == 0 && imenovalec % i == 0){
                break;
            }
        }
        return i;
    }
}
