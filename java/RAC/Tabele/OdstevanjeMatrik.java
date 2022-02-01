public class OdstevanjeMatrik {
    public static void main(String[] args){
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        nakljElementi(m1);
        nakljElementi(m2);
        izpis(m1, m2);

        //ce sta matriki enake velikosti
        if((m1.length == m2.length) && (m1[0].length == m2[0].length)){
            odstevanje(m1, m2);
        }
    }

    public static int[][] nakljElementi(int[][] tab){
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*9 + 1);
            }
        }
        return tab;
    }

    public static void izpis(int[][] tab, int[][] tab2){
        
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("   +   ");

        for(int i = 0; i < tab2.length; i++){
            for(int j = 0; j < tab2[0].length; j++){
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("  ||  ");
    }

    public static void odstevanje(int[][] tab, int[][] tab2){

        int[][] razlika = new int[tab.length][tab[0].length];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                razlika[i][j] = tab[i][j] - tab2[i][j];
                System.out.print(razlika[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
