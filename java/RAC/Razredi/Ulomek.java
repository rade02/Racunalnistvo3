public class Ulomek3 {
    public static void main(String[] args){

        Ulomek1 prvi = new Ulomek1(5, -4);
        Ulomek1 drugi = new Ulomek1(-4, 5);
        Ulomek1 tretji = new Ulomek1(5);
        
        //krajsanje
        prvi.pokrajsaj(true);
        drugi.pokrajsaj(true);
        System.out.println();
        
        //ali sta enaka
        System.out.println("Sta enaka? " + prvi.enak(drugi));

        //kateri je vecji
        int a = prvi.compareTo(drugi);
        System.out.println((a == 0) ? ("Sta enaka"):((a == 1) ? ("Prvi je vecji od drugega"):("Drugi je vecji od prvega")));

        //operacije, ki vrnejo Ulomek1
        Ulomek1 vsota = prvi.vsota(drugi);
        System.out.println(prvi.toString() + "  +  " + drugi.toString() + "  =  " + vsota.toString());

        Ulomek1 razlika = prvi.razlika(drugi);
        System.out.println(prvi.toString() + "  -  " + drugi.toString() + "  =  " + razlika.toString());

        Ulomek1 zmnozek = prvi.zmnozek(drugi);
        System.out.print(prvi.toString() + "  *  " + drugi.toString() + "  =  ");
        zmnozek.pokrajsaj(true);

        Ulomek1 kvocient = prvi.kvocient(drugi);
        System.out.print(prvi.toString() + "  /  " + drugi.toString() + "  =  ");
        kvocient.pokrajsaj(true);
        

        //operacije z metodami void
        prvi.pristej(drugi, true);
        drugi.pristej(prvi, true);
        prvi.odstej(drugi, true);
        prvi.zmnozi(drugi, true);
        prvi.deli(drugi, true);

    }
}

class Ulomek1
{
    public int st;
    public int im;

    Ulomek1(int stevec, int imenovalec){
        this.st = stevec;
        this.im = imenovalec;
    }
    Ulomek1(int k){
        this.st = k;
        this.im = 1;
    }

    public void pokrajsaj(boolean izpisi){
        int skupniDelitelj = najvecjiSkupniDel(this.st, this.im);
        this.st /= skupniDelitelj;
        this.im /= skupniDelitelj;
        //izpis, ce je boolean true:
        if(izpisi) System.out.println(this.st + "/" + this.im);
    }

    protected int najvecjiSkupniDel(int a, int b){ //ker je protected, je ne moremo uporabljati drugje, kot v razredu in njegovih podrazredih
        //da bo b manjsi od a:
        if(a < b){
            int tmp = b;
            b = a;
            a = tmp;
        }
        //izvajamo Evklidov algoritem:
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public boolean enak(Ulomek1 a){
        if(this.st * a.im == this.im * a.st)
            return true;
        else
            return false;
    }

    public int compareTo(Ulomek1 a){
        boolean obrni = false;  //ce imamo negativne ulomke, se obrne vecji in manjsi (manjse stevke v negativno --> vecji ulomek)

        if(this.st < 0 ^ this.im < 0){  //XOR - 1, ce je le eden od njih 1
            if(a.st < 0 ^ a.im < 0){
                obrni = true;
            }
            else{
                return -1;
            }
        }
        else if(a.st < 0 ^ a.im < 0){
            return 1;
        }

        if(this.st * a.im >= this.im * a.st){
            if(this.st * a.im == this.im * a.st)
                return 0;
            else
                return (obrni) ? -1:1;
        }
        else
            return (obrni) ? 1:-1;
    }

    public String toString(){
        return (this.st + "/" + this.im);
    }

    public Ulomek1 vsota(Ulomek1 a){  //vrne nov ulomek (vsoto)
        int stevec = this.st * a.im + this.im * a.st;
        int imenovalec = this.im * a.im;
        Ulomek1 b = new Ulomek1(stevec, imenovalec);
        return b;
    }
    public void pristej(Ulomek1 a, boolean izpisi){  //this pristeje ulomek a (this postane this + a)
        this.st = this.st * a.im + this.im * a.st;
        this.im *= a.im;
        if(izpisi) System.out.println(this.st + "/" + this.im);
    }

    public Ulomek1 razlika(Ulomek1 a){
        int stevec = this.st * a.im - this.im * a.st;
        int imenovalec = this.im * a.im;
        Ulomek1 c = new Ulomek1(stevec, imenovalec);
        return c;
    }
    public void odstej(Ulomek1 a, boolean izpisi){
        this.st = this.st * a.im - this.im * a.st;
        this.im *= a.im;
        if(izpisi) System.out.println(this.st + "/" + this.im);
    }

    public Ulomek1 zmnozek(Ulomek1 a){
        int stevec = this.st * a.st;
        int imenovalec = this.im * a.im;
        Ulomek1 d = new Ulomek1(stevec, imenovalec);
        return d;
    }
    public void zmnozi(Ulomek1 a, boolean izpisi){
        this.st *= a.st;
        this.im *= a.im;
        if(izpisi) System.out.println(this.st + "/" + this.im);
    }

    public Ulomek1 kvocient(Ulomek1 a){
        int stevec = this.st * a.im;
        int imenovalec = this.im * a.st;
        Ulomek1 e = new Ulomek1(stevec, imenovalec);
        return e;
    }
    public void deli(Ulomek1 a, boolean izpisi){
        this.st *= a.im;
        this.im *= a.st;
        if(izpisi) System.out.println(this.st + "/" + this.im);
    }
}
