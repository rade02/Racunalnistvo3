public class InsertionSort{

     public static void main(String []args){
        int tab[] = {7, 1, 5, 9, 2};
        int ustart = 0, uend = 0, nstart = 1, nend = tab.length - 1;
        
        for(int i = 0; i < nend; i++){
            
            for(int j = ustart; j <= uend; j++){
                
                if(tab[nstart] > tab[uend])
                    break;
                if(tab[j] > tab[nstart]){
                    int tmp = tab[j];
                    tab[j] = tab[nstart];
                    tab[nstart] = tmp;
                }
                System.out.println(nstart);
            }
            uend++;
            nstart++;
        }
        for(int k = 0; k < tab.length; k++)
            System.out.print(tab[k] + " ");
     }
}
