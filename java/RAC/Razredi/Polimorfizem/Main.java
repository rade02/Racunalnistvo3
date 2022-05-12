package Polimorfizem;

public class Main {
    public static void main(String[] args){

        Student Janez = new Student(1234567891234l, "Ulica 1", 201420l, "FRI");
        Upokojenec Lojze = new Upokojenec(2345678912345l, "Ulica 2", 6001l, "Drustvo 1");
        Delavec Franc = new Delavec(3456789123456l, "Ulica 3", 1354l, "Revoz");

        Janez.izpis();
        Lojze.izpis();
        Franc.izpis();
    }
}

class Obcan{
    private long emso;
    private String stalniNaslov;
    public Obcan(long e, String sn){
        this.emso = e;
        this.stalniNaslov = sn;
    }
    public void izpis(){
        System.out.println(emso + "\n" + stalniNaslov);
    }
}

class Student extends Obcan{
    private long studentskaStevilka;
    private String fakulteta;
    public Student(long e, String sn, long ss, String f){
        super(e, sn);
        this.studentskaStevilka = ss;
        this.fakulteta = f;
    }
    public void izpis(){
        super.izpis();
        System.out.println(studentskaStevilka + "\n" + fakulteta);
        System.out.println("==========================================");
    }
}

class Upokojenec extends Obcan{
    private long stUpokojenskeKartice;
    private String imeUpokojenskegaDrustva;
    public Upokojenec(long e, String sn, long suk, String iud){
        super(e, sn);
        this.stUpokojenskeKartice = suk;
        this.imeUpokojenskegaDrustva = iud;
    }
    public void izpis(){
        super.izpis();
        System.out.println(stUpokojenskeKartice + "\n" + imeUpokojenskegaDrustva);
        System.out.println("==========================================");
    }
}

class Delavec extends Obcan{
    private long stDelvaskeKartice;
    private String imePodjetja;
    public Delavec(long e, String sn, long sdk, String ip){
        super(e, sn);
        this.stDelvaskeKartice = sdk;
        this.imePodjetja = ip;
    }
    public void izpis(){
        super.izpis();
        System.out.println(stDelvaskeKartice + "\n" + imePodjetja);
        System.out.println("==========================================");
    }
}
