public class BubbleSort{
    public static void main(String[] args){
        
        int tab[] = {10, 6, 7, 5, 15, 17, 12};
        boolean menjaj = true;
      
        while(menjaj == true){ //pregledujemo tabelo dokler se izvajajo menjave
            menjaj = false;
            for(int i = 0; i < tab.length - 1; i++){ //gremo cez tabelo
                if(tab[i] > tab[i + 1]){  //ce je potrebno izvedemo menjavo
                    int tmp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tmp;
                    menjaj = true;
                }
            }
        }
       //izpis
        for(int j = 0; j < tab.length; j++)
            System.out.print(tab[j] + " ");
    }
}
