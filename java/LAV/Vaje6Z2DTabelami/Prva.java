package Vaje2DTabele;

public class Prva {
    
    public static void main(String[] args)
    {
        int vrstic = 30;
        int stolpcev = 10;

        int[][] tab = new int[vrstic][stolpcev];

        tab = napolni(tab);

        izpisiZadPetStolpcev(tab);

        izpisVsoteStolpcev(tab);
    }

    public static void izpisVsoteStolpcev(int[][] tab)
    {
        System.out.println("vsote stolpcev: ");
        for(int i = 0; i < tab[0].length; i++){
            int vsotaStolpca = 0;
            for(int j = 0; j < tab.length; j++){
                vsotaStolpca += tab[j][i];
            }
            System.out.print(vsotaStolpca + " ");
        }
    }

    public static void izpisiZadPetStolpcev(int[][] tab)
    {
        for(int i = 0; i < tab.length; i++){
            for(int j = tab[0].length - 5; j < tab[0].length; j++){
                System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
            }
            System.out.println();
        }
    }

    public static int[][] napolni(int[][] tab)
    {
        for(int i = 0; i < tab.length; i++){
            int vsotaVrstice = 0;
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random() * 98) + 1;
                if((i <= 15) && (tab[i][j] % 2 != 0))
                    tab[i][j]++;
                else if((i > 15) && (tab[i][j] % 2 == 0))
                    tab[i][j]++;
                vsotaVrstice += tab[i][j];
                System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
            }
            System.out.println(" vsota vrstice je: " + vsotaVrstice);
        }
        return tab;
    }
}
