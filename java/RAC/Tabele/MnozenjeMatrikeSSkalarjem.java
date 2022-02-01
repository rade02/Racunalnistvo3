public class MnozenjeMatrikeSSkalarjem {
    public static void main(String[] args){
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int skalar = 2;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = skalar * m[i][j];
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
