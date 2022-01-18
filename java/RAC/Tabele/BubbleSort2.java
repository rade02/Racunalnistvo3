public class BubbleSort2 {
    public static void main(String[] args){
        
        int tab[] = {10, 6, 7, 5, 15, 17, 12};
        boolean menjaj = true;
        int neurejeni = tab.length; //dodamo neurejeni del, ki je na zacetku celotna tabela
        
        while(menjaj == true){
            menjaj = false;
            for(int i = 0; i < neurejeni; i++){ //zanka tece le do konca neurejenega dela in ne vec do konca tabele
                if(tab[i] > tab[i + 1]){
                    int tmp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tmp;
                    menjaj = true;
                }
            }
            neurejeni--; //z vsako iteracijo zamenjave elementov zmanjsamo neurejeni del za 1
        }
      //izpis
        for(int j = 0; j < tab.length; j++)
            System.out.print(tab[j] + " ");
    }
}
