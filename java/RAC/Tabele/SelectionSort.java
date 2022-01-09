public class SelectionSort{

     public static void main(String []args){
        
        int tab[] = {1, 5, 3, 9, 8};
        int prviNeurejen = 0; //indeks prvega neurejenega stevila
        
        //izpis zacetne tabele
        System.out.print(" | ");
        for(int j = 0; j < tab.length; j++)
            System.out.print(tab[j] + " | ");
        System.out.println("\n");
        
        //dokler ne pridemo do konca tabele...
        while(prviNeurejen < tab.length - 1){
            
            int min = prviNeurejen; //indeks najmanjsega stevila
            
            //gremo cez neurejen del in najdemo indeks najmanjsega stevila
            for(int i = prviNeurejen; i < tab.length; i++){
                if(tab[i] < tab[min])
                    min = i;
            }
            
            //zamenjamo prvo neurejeno stevilo s stevilom na indeksu min (najmanjsim stevilom v neurejenem delu)
            int tmp = tab[prviNeurejen];
            tab[prviNeurejen] = tab[min];
            tab[min] = tmp;
            
            //povecujemo urejen del
            prviNeurejen++;
        }
        
        //izpis urejene tabele
        System.out.print(" | ");
        for(int j = 0; j < tab.length; j++)
            System.out.print(tab[j] + " | ");
        
     }
}
