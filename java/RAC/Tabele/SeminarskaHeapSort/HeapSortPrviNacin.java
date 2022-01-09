public class HeapSort {
    
    public static void main(String[] args){

        int[] tab = {20, 25, 40, 10, 16, 30};
        int kopicaZadnjiIndeks = 1;

        //ustvarjanje kopice
        while(kopicaZadnjiIndeks < tab.length){
            for(int j = 0; j <= kopicaZadnjiIndeks; j++){
                if(tab[j] > tab[((int)(j / 2))]){ //ce je otrok vecji od starsa, ju zamenjamo
                    int tmp = tab[((int)(j / 2))];
                    tab[((int)(j / 2))] = tab[j];
                    tab[j] = tmp;
                }
            }
            kopicaZadnjiIndeks++;
        }

        int indeksKopice = kopicaZadnjiIndeks - 1; //ker ga na koncu se enkrat povecamo
        

        //brisanje elementov iz kopice in max-heap

        //za odstranjevanje elementov
        while(indeksKopice > 1){

            //za max-heap
            for(int k = indeksKopice; k > 0; k--){
                
                int indeksStarsa = (int)((k - 1) / 2);
                int indeksLeviOtrok = 2*indeksStarsa + 1;
                int indeksDesniOtrok = 2*indeksStarsa + 2;
                int indeksVecjiOtrok = indeksStarsa;

                //kateri otrok je najvecji
                if((indeksDesniOtrok <= indeksKopice) && (tab[indeksDesniOtrok] > tab[indeksLeviOtrok]))
                    indeksVecjiOtrok = indeksDesniOtrok;
                else
                    indeksVecjiOtrok = indeksLeviOtrok;
                

                if(tab[indeksStarsa] < tab[indeksVecjiOtrok]){ //ce je vecji otrok vecji od starsa, ju zamenjamo
                    int tmp = tab[indeksStarsa];
                    tab[indeksStarsa] = tab[indeksVecjiOtrok];
                    tab[indeksVecjiOtrok] = tmp;
                }
            
            }
            
            int izbrisan = tab[0];
            tab[0] = tab[indeksKopice];
            tab[indeksKopice] = izbrisan;
            indeksKopice--;
        }

        for(int z = 0; z < tab.length; z++)
            System.out.print(tab[z] + " ");

    }

}
