public class KaksnaJeMatrika {
    public static void main(String[] args){
        int[][] m = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        boolean diagonalna = true;
        boolean enotska = true;
        boolean simetricna = true;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if((i != j) && (m[i][j] != 0))
                    diagonalna = false;
                
                if((i == j) && (m[i][j] != 1))
                        enotska = false;
                    
                if(m[i][j] != m[j][i])
                    simetricna = false;
            }
            
        }
        if(diagonalna)
            System.out.println("Matika je diagonalna.");
        if(enotska)
            System.out.println("Matika je enotska.");
        if(simetricna)
            System.out.println("Matika je simetricna.");
    }
}
