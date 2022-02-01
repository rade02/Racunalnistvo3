public class MnozenjeMatrik {
    public static void main(String[] args){
        int[][] m1 = {{2, 3, -1}, {2, 5, 3}, {-2, 2, 1}};
        int[][] m2 = {{3, 1, 1}, {2, -2, 2}, {1, 1, 2}};
        int[][] m3 = new int[m1.length][m1[0].length];
        int vsota;

        if((m1.length == m2[0].length) && (m1[0].length == m2.length)){
            
            for(int i = 0; i < m1.length; i++){ //zanka za prvo matriko
                for(int j = 0; j < m2[0].length; j++){ //zanka za drugo matriko

                    vsota = 0;

                    for(int k = 0; k < m1[0].length; k++){ //zanka za cez stolpce/vrstice
                        vsota += m1[i][k] * m2[k][j];
                    }
                    
                    m3[i][j] = vsota; //v tretji tabeli shranimo vsoto za vsako polje

                }
                
            }

            //izpisemo tretjo matriko
            for(int i = 0; i < m3.length; i++){
                for(int j = 0; j < m3[0].length; j++){
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
                
        }
        else
            System.out.println("Matriki ne moremo mnoziti.");
        
    }
}
