public class NegativniElementi {
    public static void main(String[] args){
      
        int[][] tab = {{5, 3, -1, 8, -2}, {5, -4, 5, 2, -1}};
        int steviloNeg = 0;
        int[][] indeksiNeg = new int[tab.length][tab[0].length];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                if(tab[i][j] < 0){
                    steviloNeg++;
                    indeksiNeg[i][j]++;
                    System.out.print(tab[i][j] + " ");
                    tab[i][j] = 0;
                }
            }
        }
        System.out.println();
        System.out.print("V tabeli je " + steviloNeg + " negativnih elementov, na indeksih: ");

        for(int k = 0; k < indeksiNeg.length; k++){
            for(int l = 0; l < indeksiNeg[0].length; l++){
                if(indeksiNeg[k][l] > 0)
                    System.out.print("[" + k + "][" + l + "] ");
            }
        }
        System.out.println("\b.");
        System.out.println("Zamenjamo jih z 0: ");
        
      //izpis preurejene zacetne tabele
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++)
                System.out.print(tab[i][j] + " ");
            System.out.println();
        }
    }
}
