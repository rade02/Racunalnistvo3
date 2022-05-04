public class Liki{
    public static void main(String[] args){

        Lik moj = new Lik(3, 6);
        moj.izpis();

        Pravokotnik p = new Pravokotnik(3, 6, 1, 2);
        Krog k = new Krog(4, 1, 1);
        Trikotnik t = new Trikotnik(3.3, 5.7, 2.5, 4, 1);
        Kvadrat novi = new Kvadrat(5);
        
        System.out.println(p.ime + "(" + p.x + ", " + p.y + "): " + p.ploscina() + " " + p.obseg());
        System.out.println(k.ime + "(" + k.x + ", " + k.y + "): " + k.ploscina() + " " + k.obseg());
        System.out.println(t.ime + "(" + t.x + ", " + t.y + "): " + t.ploscina() + " " + t.obseg());
        System.out.println(novi.ime + "(" + novi.x + ", " + novi.y + "): " + novi.ploscina() + " " + novi.obseg());

        t.premik(-2, 1);
        System.out.println(t.ime + "(" + t.x + ", " + t.y + "): " + t.ploscina() + " " + t.obseg());
        
    }
}

class Lik{
    //dolocimo pozicijo lika v koordinatnem sistemu
    public double x;
    public double y;

    public Lik(){
        this.x = 0;
        this.y = 0;
    }
    public Lik(int a, int b){
        this.x = a;
        this.y = b;
    }

    public void premik(int a, int b){
        this.x += a;
        this.y += b;
    }
    protected void izpis(){     //protected je viden tudi vsem podrazredom, private pa le v razredu
        System.out.println("x: " + this.x + " y: " + this.y);
    }
}

class Pravokotnik extends Lik{
    private double a;
    private double b;
    public String ime = "Pravokotnik";

    public Pravokotnik(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Pravokotnik(double a, double b, int x, int y){
        super(x, y);    //klic konstruktorja nadrazreda
        this.a = a;
        this.b = b;
    }
    
    public double ploscina(){
        return a * b;
    }
    public double obseg(){
        return 2 * a + 2 * b;
    }
}

class Krog extends Lik{
    double r;   //ce ne zapisemo, je lastnost public (tudi metode)
    public String ime = "Krog";

    public Krog(double radij, int x, int y){
        super(x, y);
        this.r = radij;
    }

    public double ploscina(){
        return this.r * this.r * Math.PI;
    }
    public double obseg(){
        return 2 * Math.PI * this.r;
    }
}

class Trikotnik extends Lik{
    double a;
    double b;
    double c;
    public String ime = "Trikotnik";

    public Trikotnik(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Trikotnik(double a, double b, double c, int x, int y){
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double ploscina(){
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double obseg(){
        return a + b + c;
    }
}

class Kvadrat extends Pravokotnik{
    public String ime = "Kvadrat";

    public Kvadrat(double a){
        super(a, a);
    }
    public Kvadrat(double a, int x, int y){
        super(a, a, x, y);
    }
}
