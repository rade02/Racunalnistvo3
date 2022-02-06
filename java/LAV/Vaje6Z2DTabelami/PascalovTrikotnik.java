public class PascalovTrikotnik {
    public static void main(String[] args)
    {
        int n = 6;
        int[][] tab = new int[n][n];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                if(j <= i){
                    if((i == 0) || (j == 0)){
                        tab[i][j] = 1;
                    }
                    else{
                        tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j];
                    }
                    System.out.print(tab[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
