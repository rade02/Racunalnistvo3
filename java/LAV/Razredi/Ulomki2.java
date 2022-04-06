package Razredi;

public class Ulomki2
{
    public static void main(String[] args){

        Ul prvi = new Ul(10, 16);
        Ul drugi = new Ul(6, 8);

        Ul.okrajsaj(prvi);
        Ul.okrajsaj(drugi);

        prvi.primerjaj(drugi);

        System.out.print("Vsota prvega in drugega: ");
        Ul.okrajsaj(prvi.sestej(drugi));
        System.out.println(prvi.stevec + "/" + prvi.imenovalec + ", " + drugi.stevec + "/" + drugi.imenovalec);

        System.out.print("Razlika prvega in drugega: ");
        Ul.okrajsaj(prvi.odstej(drugi));
    }
}

class Ul
{
    public int stevec;
    public int imenovalec;
    public static int skupni_imenovalec;

    public Ul(int stevec, int imenovalec){
        this.stevec = stevec;
        this.imenovalec = imenovalec;
    }

    public static void okrajsaj(Ul ulomek)
    {
        int min = Math.min(ulomek.stevec, ulomek.imenovalec);
        for(int i = min; i >= 1; i--){
            if(ulomek.stevec % i == 0 && ulomek.imenovalec % i == 0){
                ulomek.stevec /= i;
                ulomek.imenovalec /= i;
                break;
            }
        }
        System.out.println(ulomek.stevec + "/" + ulomek.imenovalec);
    }

    public void primerjaj(Ul u)
    {
        skupni_imenovalec = this.imenovalec * u.imenovalec;
        int stevec1 = this.stevec * (skupni_imenovalec / this.imenovalec);
        int stevec2 = u.stevec * (skupni_imenovalec / u.imenovalec);

        if(stevec1 > stevec2){
            System.out.println("Prvi je vecji");
        }
        else if(stevec1 < stevec2){
            System.out.println("Drugi je vecji");
        }
        else{
            System.out.println("Sta enaka");
        }
    }

    public Ul sestej(Ul u)
    {
        skupni_imenovalec = this.imenovalec * u.imenovalec;
        int stevec1 = this.stevec * (skupni_imenovalec / this.imenovalec);
        int stevec2 = u.stevec * (skupni_imenovalec / u.imenovalec);

        Ul vsota = new Ul((stevec1 + stevec2), skupni_imenovalec);

        return vsota;
    }

    public Ul odstej(Ul u)
    {
        skupni_imenovalec = this.imenovalec * u.imenovalec;
        int stevec1 = this.stevec * (skupni_imenovalec / this.imenovalec);
        int stevec2 = u.stevec * (skupni_imenovalec / u.imenovalec);

        Ul razlika = new Ul(Math.abs(stevec1 - stevec2), skupni_imenovalec);

        return razlika;
    }

}
