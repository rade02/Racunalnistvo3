public class Racuna {
    public static void main(String[] args){
        OsebniRacun ena = new OsebniRacun("Janez", "Novak", 3220.30);
        ena.nakazi(350.01);
        System.out.printf("%.2f\n", ena.vrniStanje());
        ena.dvigni(120.32);
        System.out.format("%.2f\n", ena.vrniStanje());

        VarcevalniRacun dva = new VarcevalniRacun("Janez", "Novak", 8560.55, 0.02);
        System.out.printf("%.2f\n", dva.vrniStanje());
        dva.dodajLetneObresti();
        System.out.format("%.2f\n", dva.vrniStanje());
    }
}

class OsebniRacun{
    protected String ime;
    protected String priimek;
    protected double stanje;
    OsebniRacun(String ime, String priimek, double stanje){
        this.ime = ime;
        this.priimek = priimek;
        this.stanje = stanje;
    }
    double nakazi(double znesek){
        if(znesek >= 0)
            stanje += znesek;
        return znesek;
    }
    double dvigni(double znesek){
        if(znesek >= 0)
            stanje -= znesek;
        return znesek;
    }
    double vrniStanje(){
        return stanje;
    }
}

class VarcevalniRacun extends OsebniRacun{
    protected double letnaObrestnaMera;
    VarcevalniRacun(String ime, String priimek, double stanje, double l){
        super(ime, priimek, stanje);
        this.letnaObrestnaMera = l;
    }
    public double dodajLetneObresti(){
        stanje += stanje*((double)letnaObrestnaMera/100.0);
        return stanje;
    }
}
