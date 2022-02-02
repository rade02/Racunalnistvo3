public class Matrike {
    public static void main(String[] args){


        /* transponiranje m1
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i = 0; i < m1[0].length; i++){ //izpis po stolpcih
            for(int j = 0; j < m1.length; j++){ //izpis po vrsticah
                System.out.print(m1[j][i] + " "); //preberemo m1[vrstica][stolpec], zato zamenjamo tudi tukaj i in j
            }
            System.out.println();
        }
        */


        /* kaksna je matrika m2
        int[][] m2 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        boolean nicelna = true, diagonalna = true, enotska = true, zgornjetrikotna = true, simetricna = true;

        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[0].length; j++){
                if(m2[i][j] != 0){
                    nicelna = false;
                }
                if((i != j) && (m2[i][j] != 0)){
                    diagonalna = false;
                }
                else if((i == j) && (m2[i][j] != 1)){
                    enotska = false;
                }
                if((i + j > m2.length) && (m2[i][j] != 0)){
                    zgornjetrikotna = false;
                }
                if(m2[i][j] != m2[j][i]){
                    simetricna = false;
                }
            }
        }
        System.out.print("Matrika je ");
        if(nicelna) System.out.print("nicelna in ");
        if(diagonalna) System.out.print("diagonalna ");
        if(enotska) System.out.print("in enotska ");
        if(nicelna || diagonalna || enotska) System.out.print("in ");
        if(zgornjetrikotna) System.out.print("zgornjetrikotna ");
        if(nicelna || diagonalna || enotska) System.out.print("in ");
        if(simetricna) System.out.print("simetricna ");
        System.out.print("\b. "); //backspace
        */


        /* sestevanje matrik m3 in m4
        int[][] m3 = {{1, 2, 4}, {6, 5, 6}, {7, 8, 9}};
        int[][] m4 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 10}};

        for(int i = 0; i < m3.length; i++){
            for(int j = 0; j < m3[0].length; j++){
                System.out.print((m3[i][j] + m4[i][j]) + " ");
            }
            System.out.println();
        }
        */


        /* mnozenje matrike m5 s skalarjem
        int[][] m5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {8, 7, 6}};
        int skalar = 10;
        for(int i = 0; i < m5.length; i++){
            for(int j = 0; j < m5[0].length; j++){
                System.out.print((skalar * m5[i][j]) + " ");
            }
            System.out.println();
        }
        */


        ///* mnozenje dveh matrik
        int[][] m6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {8, 7, 6}};
        int[][] m7 = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 8}};
        
        for(int i = 0; i < m6.length; i++){ //za prvo matriko
            for(int j = 0; j < m7[0].length; j++){ //za drugo matriko
                int vsota = 0;
                for(int k = 0; k < m6[0].length; k++){ //za prehod cez vrstico/stolpec
                    vsota += m6[i][k] * m7[k][j];
                }
                System.out.print(vsota + " ");
            }
            System.out.println();
        }
        System.out.println();

        //A*B!=B*A
        int[][] m8 = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 8}};
        int[][] m9 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {8, 7, 6}};
        
        
        for(int i = 0; i < m8.length; i++){ //za prvo matriko
            for(int j = 0; j < m9[0].length; j++){ //za drugo matriko
                int vsota = 0;
                for(int k = 0; k < m8[0].length; k++){ //za prehod cez vrstico/stolpec
                    vsota += m8[i][k] * m9[k][j];
                }
                System.out.print(vsota + " ");
            }
            System.out.println();
        }
        //*/

    }
}
