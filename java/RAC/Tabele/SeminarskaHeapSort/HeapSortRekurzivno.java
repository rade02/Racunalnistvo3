public class HeapSortRekurzivno
{
    public static void main(String[] args)
    {
        int tab[] = {15, 20, 16, 12, 15, 18};
        sort(tab);
            
        //print urejene tabele
        for(int z = 0; z < tab.length; z++)
            System.out.print(tab[z] + " ");
    }

    public static void sort(int tab[]) //funkcija za sortiranje
    {
        int n = tab.length;

        //zgradimo kopico
        for(int i = n / 2 - 1; i >= 0; i--) //i - prvi stars s potomci
            heapify(tab, n, i);
        
        //iz nje odstranjujemo elementa enega po enega
        for(int i = n - 1; i > 0; i--){
            //trenutni koren premaknemo na konec
            int tmp = tab[0];
            tab[0] = tab[i];
            tab[i] = tmp;

            //ponovno postavimo max-heap na zmanjsani kopici
            heapify(tab, i, 0);
        }

    }

    public static void heapify (int[] tab, int n, int i)
    {
        int naj = i;  //starsevsko vozlisce prednastavimo na najvecje
        int leviPotomec = 2*i + 1;
        int desniPotomec = 2*i + 2;
        //ce je levi potomec vecji od najvecjega (na zacetku je to stars), postane najvecji levi
        if((leviPotomec < n) && (tab[leviPotomec] > tab[naj]))
            naj = leviPotomec;
        //ce je desni potomec vecji od najvecjega, postane najvecji desni
        if((desniPotomec < n)&&(tab[desniPotomec] > tab[naj]))
            naj = desniPotomec;
        
        if(naj != i){   //ce stars ni najvecji, ga zamenjamo z najvecjim potomcem in ponovno postavimo max-heap
            int tmp = tab[i];
            tab[i] = tab[naj];
            tab[naj] = tmp;

            heapify(tab, n, naj);
        }
        //ko bo stars vedno vecji od potomcev, bo to vozlisce urejeno kot max-heap in nadaljujemo z naslednjim
    }
}
