public class InsertionSort2 {
    public static void main(String[] args){
        
        int tab[] = {6, 3, 7, 9, 1};
        int urejenZ = 0;    //indeks zadnjega urejenega
        int neurejenP = 1;      //indeks prvega neurejenega

        while(neurejenP < tab.length){      //gremo cez neurejen del tako, da z vsakim korakom povecujemo urejen del
            //za vsak element neurejenega dela gremo cez urejen del in ko je element v urejenem delu vecji, ju zamenjamo, to pocnemo do konca urejenega dela
            for(int j = 0; j < neurejenP; j++){
                if(tab[urejenZ] < tab[neurejenP]) //ce je neurejen element vecji od zadnjega urejenega, je ze urejen
                    break;
                if(tab[j] > tab[neurejenP]){
                    int tmp = tab[neurejenP];
                    tab[neurejenP] = tab[j];
                    tab[j] = tmp;
                }
            }
            urejenZ++;
            neurejenP++;
        }
        //izpis
        for(int k = 0; k < tab.length; k++)
            System.out.print(tab[k] + " ");

    }
}
