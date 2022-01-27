public class HeapSortPrviNacin {
    
    public static void main(String[] args){

        int[] tab = {15, 20, 16, 12, 15, 18};
        int kopicaIndeks = 0;

        //ustvarjanje kopice
        //zacnemo pri prvem indeksu in gremo do predzadnjega (zadnji element uredimo s tem, ko naredimo max-heap)
        while(kopicaIndeks < tab.length - 1){
            //izvedemo max-heap cez celotno do sedaj narejeno kopico
            for(int i = 0; i < kopicaIndeks; i++){
                int indeksStars = (int)((kopicaIndeks - 1) / 2);
                //ugotovimo najvecjega potomca
                int leviPotomecIndeks = 2*indeksStars + 1;
                int desniPotomecIndeks = 2*indeksStars + 2;
                int najPotomecIndeks = leviPotomecIndeks;
                if(tab[leviPotomecIndeks] < tab[desniPotomecIndeks]){
                    najPotomecIndeks = desniPotomecIndeks;
                }
                //menjava ce je potomec vecji
                if(tab[najPotomecIndeks] > tab[kopicaIndeks]){
                    int temp =  tab[kopicaIndeks];
                    tab[kopicaIndeks] = tab[najPotomecIndeks];
                    tab[najPotomecIndeks] = temp;
                }
            }
            kopicaIndeks++;
        }
        
        

        //brisanje elementov iz kopice in max-heap

        //zacnem iz desne strani v tabeli
        int indeksKopice = tab.length - 1;

        //za odstranjevanje elementov gremo do zacetka tabele
        while(indeksKopice > 0){

            //za max-heap pregledamo celotno kopico
            for(int k = indeksKopice; k > 0; k--){
                
                int indeksStarsa = (int)((k - 1) / 2);
                int indeksLeviPotomec = 2*indeksStarsa + 1;
                int indeksDesniPotomec = 2*indeksStarsa + 2;
                int indeksVecjiPotomec = indeksStarsa;

                //kateri potomec je najvecji
                if((indeksDesniPotomec <= indeksKopice) && (tab[indeksDesniPotomec] > tab[indeksLeviPotomec]))
                    indeksVecjiPotomec = indeksDesniPotomec;
                else
                    indeksVecjiPotomec = indeksLeviPotomec;
                

                if(tab[indeksStarsa] < tab[indeksVecjiPotomec]){ //ce je vecji otrok vecji od starsa, ju zamenjamo
                    int tmp = tab[indeksStarsa];
                    tab[indeksStarsa] = tab[indeksVecjiPotomec];
                    tab[indeksVecjiPotomec] = tmp;
                }
            
            }
            //element v korenu damo iz kopice v tabelo, tako bodo elementi urejeni
            int izbrisan = tab[0];
            tab[0] = tab[indeksKopice];
            tab[indeksKopice] = izbrisan;
            indeksKopice--;
        }

        for(int z = 0; z < tab.length; z++)
            System.out.print(tab[z] + " ");

    }

}
