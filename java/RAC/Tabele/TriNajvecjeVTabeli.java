public class TriNajvecjeVTabeli{

     public static void main(String []args){
         
         int tab[] = {13, 12, 3, 44, 5, 65, 75, 8, 9, 10};
         int naj[] = new int[3];
         int tn = tab[0], najm = tab[0];
         int k = 0;
         
         while(k < naj.length){
             //pregled ce je najvecje, ga shrani v tn, najmanjse v najm
             tn = najm;
             for(int i = 0; i < tab.length; i++){
                 if(tab[i] > tn){
                     tn = tab[i];
                 }
                 if(tab[i] < najm){
                     najm = tab[i];
                 }
             }
             //isce tn in shrani indeks ter ga zamenja z najmanjso vred.
             for(int j = 0; j < tab.length; j++){
                 if(tn == tab[j]){
                     naj[k] = j;
                     tab[j] = najm;
                 }
             }
             k++;
         }
         
         System.out.print("Indeksi treh najvecjih stevil v tabeli: ");
         for(int l = 0; l < naj.length; l++)
            System.out.print("[" + naj[l] + "] ");
         
     }
}
