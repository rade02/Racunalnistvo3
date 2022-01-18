public class SelectionSort2 {
    public static void main(String[] args){
        
        int tab[] = {8, 6, 3, 7, 9, 1, 10};
        int urejen = -1;    //na zacetku tabela nima urejenega dela
        boolean menjava = true;     //uvedemo logicno spremenljivko za pohitritev - ce so elementi v neurejenem delu ze urejeni,
                                    // se ne bosta zamenjala tab[i] in min, takrat lahko ze koncamo zanko (ni potrebno ponavljati dokler ni urejena tabela do predzadnjega elementa)
        
        while(menjava){
            menjava = false;
            int min = tab[urejen + 1];      //najmanjši element v neurejenem delu
            for(int i = urejen + 1; i < tab.length; i++){      //gremo cez neurejen del in iscemo najmanjsi element, ki ga damo na prvo mesto neurejenega dela
                if(tab[i] < min){
                    int tmp = tab[i];
                    tab[i] = min;
                    min = tmp;
                    menjava = true;
                }
            }
            tab[urejen + 1] = min;  //min damo na 1. mesto neurejenega dela
            urejen++;   //povecamo urejen del
        }
        //izpis
        for(int k = 0; k < tab.length; k++)
            System.out.print(tab[k] + " ");
    }
}
