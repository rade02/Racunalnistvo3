public class NegativniElementi {
    public static void main(String[] args){
        
        int n = 10;
        int[][] tab = new int[n][n];
        int[][] indeksiNeg = new int[n][n];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*21 - 10);
                if(tab[i][j] < 0){
                    indeksiNeg[i][j]++;
                }
                System.out.print(((tab[i][j] < 10 && tab[i][j] >= 0) ? (" " + tab[i][j]):(tab[i][j])) + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < indeksiNeg.length; i++){
            for(int j = 0; j < indeksiNeg[0].length; j++){
                if(indeksiNeg[i][j] != 0){
                    System.out.print("[" + i + "][" + j + "] ");
                    tab[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
            }
            System.out.println();
        }


    }
}
