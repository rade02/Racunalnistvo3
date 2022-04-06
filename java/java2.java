public class vaja_ulomek
{
    public static void main(String[] args){
        
        Ulomek prvi = new Ulomek(3, 4);
        Ulomek drugi = new Ulomek(5, 8);
        prvi.izpis();
        drugi.izpis();
        
        prvi.primerjaj(drugi);
        
        prvi.sestej(drugi);
        prvi.odstej(drugi);
        prvi.krajsaj(drugi);
    }
}

class Ulomek
{
    public int stevec = 0;      //privzete vrednosti
    public int imenovalec = 1;
    
    public Ulomek()
    {}
    
    public Ulomek (int stevec, int imenovalec)
    {
        this.stevec = stevec;       //this - razredna spremenljivka
        this.imenovalec = imenovalec;
    }
    
    public void krajsaj(Ulomek neki)
    {
        
    }
    
    public void primerjaj(Ulomek neki)
    {
        if(neki.imenovalec * this.stevec > this.imenovalec * neki.stevec)      //krizno mnozimo
            System.out.println("1. je vecji");
        else if(neki.imenovalec * this.stevec < this.imenovalec * neki.stevec)
            System.out.println("2. je vecji");
        else
            System.out.println("sta enaka");
    }
    
    public void sestej(Ulomek neki)
    {
        int skupni_imenovalec = this.imenovalec * neki.imenovalec;
        this.stevec *= skupni_imenovalec / this.imenovalec;
        neki.stevec *= skupni_imenovalec / neki.imenovalec;
        
        System.out.println((this.stevec + neki.stevec) + "/" + skupni_imenovalec);
    }
    
    public void odstej(Ulomek neki)
    {
        int skupni_imenovalec = this.imenovalec * neki.imenovalec;
        this.stevec *= skupni_imenovalec / this.imenovalec;
        neki.stevec *= skupni_imenovalec / neki.imenovalec;
        
        System.out.println((this.stevec - neki.stevec) + "/" + skupni_imenovalec);
    }
    
    public void zmnozi(Ulomek neki)
    {
        System.out.println((this.stevec * neki.stevec) + "/" + (this.imenovalec * neki.imenovalec));
    }
    
    public void izpis()
    {
        System.out.println(stevec + "/" + imenovalec);
    }
}
