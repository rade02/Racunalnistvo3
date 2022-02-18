public class OperacMatr {
    public static void main(String[] args){

        int[][] A = {{5, 4}, {2, 3}};
        int[][] B = {{1, 3}, {-2, -5}};
        int[][] C = {{-1, -2},{2, 4}};

        int[][] vsota = sestej(A, B);
        izpis(vsota);

        System.out.println();

        int[][] razlika = odstej(A, C);
        izpis(razlika);

        System.out.println();

        int[][] zmnozek = zmnozi(A, C);
        izpis(zmnozek);

        System.out.println();

        int detA = determinanta(A);
        System.out.println("det(A) = " + detA);

    }

    public static int determinanta(int[][] tab){
        int detA = tab[0][0]*tab[1][1] - tab[0][1]*tab[1][0];
        return detA;
    }

    public static int[][] zmnozi(int[][] m1, int[][] m2){
        int[][] zmnozek = new int[m1.length][m1[0].length];
        if(m1.length == m2[0].length && m1[0].length == m2.length){
            for(int i = 0; i < m1.length; i++){ //cez vse stolpce prve tabele
                for(int j = 0; j < m2[0].length; j++){  //cez stolpce v drugi matriki
                    int vsota = 0;
                    for(int k = 0; k < m1[0].length; k++){
                        vsota += m1[i][k] * m2[k][j];
                    }
                    zmnozek[i][j] = vsota;
                }
            }
        }
        else{
            System.out.println("Matriki nista ustreznih dimenzij.");
        }
        return zmnozek;
    }

    public static int[][] odstej(int[][] m1, int[][] m2){
        int[][] razlika = new int[m1.length][m1[0].length];
        if(m1.length == m2.length && m1[0].length == m2[0].length){
            for(int i = 0; i < m1.length; i++){
                for(int j = 0; j < m1[0].length; j++){
                    razlika[i][j] = m1[i][j] - m2[i][j];
                }
            }
        }
        else{
            System.out.println("Matriki nista istih dimenzij.");
        }
        return razlika;
    }

    public static int[][] sestej(int[][] m1, int[][] m2){
        int[][] sestevek = new int[m1.length][m1[0].length];
        if(m1.length == m2.length && m1[0].length == m2[0].length){
            for(int i = 0; i < m1.length; i++){
                for(int j = 0; j < m1[0].length; j++){
                    sestevek[i][j] = m1[i][j] + m2[i][j];
                }
            }
        }
        else{
            System.out.println("Matriki nista istih dimenzij.");
        }
        return sestevek;
    }

    public static void izpis(int[][] tab){
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
