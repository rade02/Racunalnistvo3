public class Cetrta {
    public static void main(String[] args){
        Kvader k1 = new Kvader(3.3, 6.2, 4.1);
        Kvader k2 = new Kvader(2.5, 4.8, 6.1);

        System.out.printf("Kvader k1 ima prostornino: %.2f, kvader k2 pa: %.2f\n", k1.prostornina(), k2.prostornina());
    
        System.out.println(k1.izpis());
        System.out.println(k2.izpis());
    }
}

class Kvader{
    public double dolzina;
    public double sirina;
    public double visina;

    Kvader(double a, double b, double c){
        this.dolzina = a;
        this.sirina = b;
        this.visina = c;
    }

    public double povrsina(){
        return 2*this.dolzina*this.sirina + 2*this.dolzina*this.visina + 2*this.sirina*this.visina;
    }
    public double prostornina(){
        return Math.round(this.dolzina * this.sirina * this.visina * 100) / 100.0;
    }
    public String izpis(){
        String a = "Robovi: " + this.dolzina + ", " + this.sirina + ", " + this.visina + ", ";
        String b = "povrsina: " + this.povrsina() + ", ";
        String c = "prostornina: " + this.prostornina() + ", ";

        double d1 = Math.sqrt(Math.pow(this.dolzina, 2) + Math.pow(this.sirina, 2));
        String d = "telesna diagonala: " + (Math.round(Math.sqrt(Math.pow(visina, 2) + Math.pow(d1, 2))*100)/100.0) + ".";
        return a + b + c + d;
    }
}
