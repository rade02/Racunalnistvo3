public class Vaja_lik{
    public static void main(String[] args){

        Lik moj = new Lik(3, 6);
        moj.izpis();

        Pravokotnik p = new Pravokotnik(3, 6, 1, 2);
        Krog k = new Krog(4, 1, 1);
        System.out.println(k.ploscina());

        Trikotnik t = new Trikotnik(3.3, 5.7, 2.5, 4, 1);
        System.out.println(t.ploscina());

        t.premik(-2, 1);

        Kvadrat novi = new Kvadrat(5);
        novi.ploscina();

        //obseg
    }
}

class Lik{
    private double x;
    private double y;

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
    protected void izpis(){
        System.out.println("x: " + this.x + " y: " + this.y);
    }
}

class Pravokotnik extends Lik{
    double a;
    double b;

    public Pravokotnik(double a, double b, int x, int y){
        super(x, y);    //klic konstruktorja nadrazreda
        this.a = a;
        this.b = b;
    }
    
    public double ploscina(){
        return a * b;
    }
}

class Krog extends Lik{
    double r;

    public Krog(double radij, int x, int y){
        super(x, y);
        this.r = radij;
    }

    public double ploscina(){
        return this.r * this.r * Math.PI;
    }
}

class Trikotnik extends Lik{
    double a;
    double b;
    double c;

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
}

class Kvadrat extends Pravokotnik{

    public Kvadrat(double a){
        super(a, a);
    }
}
