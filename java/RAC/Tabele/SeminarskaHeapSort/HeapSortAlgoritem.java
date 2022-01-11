public class HeapSortAlgoritem {

    public static int[] Heapify (int[] tab){
        int kopicaIndeks = tab.length - 1;
        //zacnemo pri zadnjem koncu in gremo do prvega
        while(kopicaIndeks >= 0){
            //izvedemo max-heap cez celotno do sedaj narejeno kopico
            for(int i = tab.length - 1; i > kopicaIndeks; i--){
                int indeksStars = (int)((kopicaIndeks - 1) / 2);
                //ugotovimo najvecjega potomca
                int lPotomecIndeks = 2*indeksStars + 1;
                int dPotomecIndeks = 2*indeksStars + 2;
                int najPotomecIndeks = lPotomecIndeks;
                if(tab[dPotomecIndeks] > tab[dPotomecIndeks]){
                    najPotomecIndeks = dPotomecIndeks;
                }
                //menjava ce je potomec vecji od starsa
                if(tab[najPotomecIndeks] > tab[kopicaIndeks]){
                    int tmp = tab[kopicaIndeks];
                    tab[kopicaIndeks] = tab[najPotomecIndeks];
                    tab[najPotomecIndeks] = tmp;
                }
            }
            kopicaIndeks--;
        }

        return tab;

    }

    public static int[] vRazporejenoTabelo (int[] tab){
        //zacnemo z desne strani v tabeli
        int indeksKopica = tab.length - 1;
        //za odstranjevanje elementov gremo do zacetka tabele
        while(indeksKopica >= 1){
            //za max-heap pregledamo celotno kopico
            for(int k = indeksKopica; k > 0; k--){
                
                int indeksStarsa = (int)((k - 1) / 2);
                int indeksLPotomca = 2*indeksStarsa + 1;
                int indeksDPotomca = 2*indeksStarsa + 2;
                int indeksNajPotomca = indeksLPotomca;

                //kateri potomec je najvecji
                if((indeksDPotomca <= indeksKopica) && (tab[indeksDPotomca] > tab[indeksLPotomca]))
                    indeksNajPotomca = indeksDPotomca;
                
                

                if(tab[indeksStarsa] < tab[indeksNajPotomca]){ //ce je vecji otrok vecji od starsa, ju zamenjamo
                    int tmp = tab[indeksStarsa];
                    tab[indeksStarsa] = tab[indeksNajPotomca];
                    tab[indeksNajPotomca] = tmp;
                }
            
            }
            
            int izbrisan = tab[0];
            tab[0] = tab[indeksKopica];
            tab[indeksKopica] = izbrisan;
            indeksKopica--;
        }

        return tab;

    }

    public static void main(String[] args){
        int tab[] = {10, 20, 25, 12, 40, 15, 18, 9};
        Heapify(tab);
        vRazporejenoTabelo(tab);

        for(int z = 0; z < tab.length; z++)
            System.out.print(tab[z] + " ");
    }
}
