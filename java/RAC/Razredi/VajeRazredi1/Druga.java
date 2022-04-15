public class Druga {
    public static void main(String[] args){

        Obcan o1 = new Obcan("1234567890123", "Naslov 1");
        o1.izpis();

        Student s1 = new Student("4567890123456", "FRI");
        s1.izpis();
    }
}

class Obcan{
    public String emso;
    public String stalniNaslov;

    Obcan(String a, String b){
        this.emso = a;
        this.stalniNaslov = b;
    }

    public void izpis(){
        System.out.println("EMŠO: " + this.emso + ", stalni naslov: " + this.stalniNaslov);
    }
}

class Student{
    public String IDStudenta;
    public String fakulteta;

    Student(String a, String b){
        this.IDStudenta = a;
        this.fakulteta = b;
    }

    public void izpis(){
        System.out.println("ID: " + this.IDStudenta + ", fakulteta: " + this.fakulteta);
    }
}
