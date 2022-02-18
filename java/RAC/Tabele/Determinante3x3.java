public class Determinante3x3 {
    public static void main(String[] args){
        int[][] m = {{-1, -12, 7}, {7, 9, -9}, {5, -6, -4}};

        int det = m[0][0]*m[1][1]*m[2][2] - m[0][0]*m[1][2]*m[2][1] - m[0][1]*m[1][0]*m[2][2] + m[0][1]*m[1][2]*m[2][0] + m[0][2]*m[1][0]*m[2][1] - m[0][2]*m[1][1]*m[2][0];
        System.out.println(det);

        int det2 = m[0][0]*m[1][1]*m[2][2] + m[0][1]*m[1][2]*m[2][0] + m[0][2]*m[1][0]*m[2][1] - m[0][2]*m[1][1]*m[2][0] - m[0][0]*m[1][2]*m[2][1] - m[0][1]*m[1][0]*m[2][2];
        System.out.println(det2);

    }
}
