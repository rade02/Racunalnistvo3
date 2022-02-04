public class Vaje2DTabele1 {
    public static void main(String[] args){

        int vrstic = 30;
        int stolpcev = 10;

        int[][] tab = new int[vrstic][stolpcev];

        for(int i = 0; i < tab.length; i++){
            int vsotaVrstice = 0;
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*98 + 1);
                if(i < 15 && tab[i][j] % 2 != 0)
                    tab[i][j]++;
                if(i >= 15 && tab[i][j] % 2 == 0)
                    tab[i][j]++;
                System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
                vsotaVrstice += tab[i][j];
            }
            System.out.println(" Vsota vrstice: " + vsotaVrstice);
        }
        for(int i = 0; i < tab.length; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 0; i < tab[0].length; i++){ //cez stolpce
            int vsotaStolpca = 0;
            for(int j = 0; j < tab.length; j++){ //cez vrstice
                vsotaStolpca += tab[j][i];
            }
            System.out.print((vsotaStolpca/stolpcev) + " ");
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                if(j >= tab[0].length - 5)
                System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
            }
            System.out.println();
        }
    }
}
