public class Ulomki{
    public static void main(String[] args){
        Ulomek prvi = new Ulomek(-18, -6);
        prvi.pokrajsaj();
        Ulomek drugi = new Ulomek(24, -8);
        drugi.pokrajsaj();
        System.out.println(prvi.equals(drugi));
        System.out.println(prvi.compareTo(drugi));
        System.out.println(prvi.toString() + " " + drugi.toString());
    
        Ulomek a = prvi.vsota(drugi);
        Ulomek b = prvi.razlika(drugi);
        Ulomek c = prvi.zmnozek(drugi);
        Ulomek d = prvi.kvocient(drugi);
        System.out.println(a + " " + b  + " " + c + " " + d + " ");

        prvi.pristej(drugi);
        System.out.println(prvi.toString());
        prvi.odstej(drugi);
        System.out.println(prvi.toString());
        prvi.zmnozi(drugi);
        System.out.println(prvi.toString());
        prvi.deli(drugi);
        System.out.println(prvi.toString());

    }
}

class Ulomek{
    public int st;
    public int im;

    public Ulomek(int x, int y){
        this.st = x;
        this.im = y;
    }
    public Ulomek(int k){
        this.st = k;
        this.im = 1;
    }

    public void pokrajsaj(){
        int skDelitelj = najSkDelitelj(this.st, this.im);
        this.st /= skDelitelj;
        this.im /= skDelitelj;
    }
    private int najSkDelitelj(int x, int y){
        int a = Math.max(x, y);
        int b = Math.min(x, y);

        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public boolean equals(Ulomek a){
        if(this.st * a.im == this.im * a.st)
            return true;
        else
            return false;
    }
    public int compareTo(Ulomek a){
        boolean neg1 = false;
        if(this.st < 0 ^ this.im < 0){
            neg1 = true;
        }
        boolean neg2 = false;
        if(a.st < 0 ^ a.im < 0){
            neg2 = true;
        }

        if(neg1 && !neg2)
            return -1;
        else if(!neg1 && neg2)
            return 1;
        else{
            int vrni;
            if(this.st * a.im == this.im * a.st)
                vrni = 0;
            else if(this.st * a.im < this.im * a.st)
                vrni = -1;
            else
                vrni = 1;
            return (neg1 && neg2) ? (-vrni):(vrni);
        }
    }
    public String toString(){
        return this.st + "/" + this.im;
    }
    public Ulomek vsota(Ulomek a){
        int stevec = this.st * a.im + this.im * a.st;
        int imenovalec = this.im * a.im;
        Ulomek s = new Ulomek(stevec, imenovalec);
        s.pokrajsaj();
        return s;
    }
    public void pristej(Ulomek a){
        this.st = this.st * a.im + this.im * a.st;
        this.im = this.im * a.im;
    }
    public Ulomek razlika(Ulomek a){
        int stevec = this.st * a.im - this.im * a.st;
        int im = Math.abs(this.im * a.st);
        return new Ulomek(stevec, im);
    }
    public void odstej(Ulomek a){
        this.st = this.st * a.im - this.im * a.st;
        this.im = Math.abs(this.im * a.im);
    }
    public Ulomek zmnozek(Ulomek a){
        int stevec = this.st * a.st;
        int imenovalec = this.im * a.im;
        return new Ulomek(stevec, imenovalec);
    }
    public void zmnozi(Ulomek a){
        this.st *= a.st;
        this.im *= a.im;
    }
    public Ulomek kvocient(Ulomek a){
        int st = this.st * a.im;
        int im = this.im * a.st;
        return new Ulomek(st, im);
    }
    public void deli(Ulomek a){
        this.st *= a.im;
        this.im *= a.st;
    }
}