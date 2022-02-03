public class Determinante {
    public static void main(String[] args){
        
        ///*determinanta matrike A
        int[][] A = {{2, -3}, {1, -1}};
        int detA = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        System.out.println("det(A) = " + detA);

        //determinanta transponirane matrike
        int[][] AT = new int[A.length][A[0].length];
        for(int i = 0; i < AT.length; i++){
            for(int j = 0; j < AT[0].length; j++){
                AT[i][j] = A[j][i];
                //System.out.print(AT[i][j] + " ");
            }
            //System.out.println();
        }

        int detAT = AT[0][0] * AT[1][1] - AT[0][1] * AT[1][0];
        System.out.println("det(AT) = " + detAT);

        //determinanta, ce zamenjamo vrstici
        int[][] B = {{1, -1}, {2, -3}};
        int detB = B[0][0]*B[1][1] - B[0][1]*B[1][0];
        System.out.println("det(B) = " + detB);

        //determinanta, ce matriko A mnozimo s skalarjem
        int[][] C = new int[A.length][A[0].length];
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[0].length; j++){
                C[i][j] = 3 * A[i][j];
                //System.out.print(C[i][j] + " ");
            }
            //System.out.println();
        }
        int detC = C[0][0]*C[1][1] - C[0][1]*C[1][0];
        System.out.println("det(C) = " + detC);
        //*/

        /*Sarrusovo pravilo za determinanto 3. reda
        int[][] D = {{2, -1, 1}, {0, -2, 3}, {1, -2, 2}};

        int detD = D[0][0]*D[1][1]*D[2][2] + D[0][1]*D[1][2]*D[2][0] + D[0][2]*D[1][0]*D[2][1] - D[0][2]*D[1][1]*D[2][0] - D[0][0]*D[1][2]*D[2][1] - D[0][1]*D[1][0]*D[2][0];
        System.out.println("det(D) = " + detD);
        */
    }
}
