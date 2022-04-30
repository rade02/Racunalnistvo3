import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Osebe {
    public static void main(String[] args){
        Datum prvi = new Datum(25, 4, 2022);
        Datum drugi = new Datum(30, 4, 2022);

        System.out.println(prvi.toString());
        System.out.println(prvi.equals(drugi));

        Oseba jaz = new Oseba("Janez", "Novak", new Datum(1, 1, 2000));
        System.out.println(jaz.toString());
        System.out.println(jaz.polnoIme());
        
    }
}

class Oseba{
    public String ime;
    public String priimek;
    public Datum datumRojstva;

    public Oseba(String a, String b, Datum c){
        this.ime = a;
        this.priimek = b;
        this.datumRojstva = c;
    }
    public Oseba(BufferedReader r) throws IOException{
        r.readLine();
    }

    public String toString(){
        return "Oseba " + ime + " " + priimek + " se je rodil/-a " + datumRojstva + ".";
    }
    public String polnoIme(){
        return ime + " " + priimek;
    }
    public void shrani(PrintWriter w){
        w.println(ime + ":" + priimek + ":" + datumRojstva.dan + ":" + datumRojstva.mesec + ":" + datumRojstva.leto);
    }
}

class Datum{
    public int dan;
    public int mesec;
    public int leto;

    public Datum(int a, int b, int c){
        this.dan = a;
        this.mesec = b;
        this.leto = c;
    }

    public String toString(){
        return dan + ". " + mesec + ". " + leto;
    }
    public boolean equals(Datum d){
        if(this.dan == d.dan && this.mesec == d.mesec && this.leto == d.leto)
            return true;
        else
            return false;
    }
    public int compareTo(Datum d){
        if(this.leto < d.leto)
            return -1;
        else if(this.leto > d.leto)
            return 1;
        else{
            if(this.mesec < d.mesec)
                return -1;
            else if(this.mesec > d.mesec)
                return 1;
            else{
                if(this.dan < d.dan)
                    return -1;
                else if(this.dan > d.dan)
                    return 1;
                else
                    return 0;
            }
        }
    }
}