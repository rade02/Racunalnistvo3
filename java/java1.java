class Vaja{
    public static void main(String[] args)
    {
        Oseba dijak1 = new Oseba();
        Oseba dijak2 = new Oseba();
        Oseba dijak3 = new Oseba();
        Oseba dijak4 = new Oseba();

        int[] tabela_int = new int[10]; //tabela 10 int
        Oseba[] tabela_objekti = new Oseba[10]; //tabela 10 objektov - konstruktor se ni poklican, rezerviramo samo prostor

        tabela_objekti[0] = new Oseba();
        for(int i = 1; i < tabela_objekti.length; i++){
            tabela_objekti[i] = new Oseba();    //klice konstruktor in nastavi v tabelo objekte
        }

        Oseba student = new Oseba(25);

        int stevilo;
        stevilo = 10;

        dijak.ime = "Janez";
        dijak.starost = 10;
        student.ime = "Janez";
        student.starost = 10;

        System.out.println(dijak.polnoleten());

        dijak.test();
        Oseba.test();
    }
}

class Oseba{

    //private dostopen le znotraj rezreda
    private boolean spol;
    protected boolean cepljen;  //dostop tega in dedovanih razredov
    public int starost;
    public String ime;
    static String imee = "neki_static";
    
    public Oseba(){
        System.out.println("klic konstruktorja");
    }
    
    public Oseba(int x){
        //nima tipa, je public, isto ime kot razred
        this.starost = x;
        System.out.println("klic 2. konstruktorja");
    }
    
    void izpis(){
        System.out.println("ime = " + ime);
    }
    
    public static void test(){  //staticna metoda: ne rabimo narediti objekta, da jo uporabimo
    
    }
    
}
