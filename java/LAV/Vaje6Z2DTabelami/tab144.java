public class tab144 {
    public static void main(String[] args)
    {
        
        int[][] tab = new int[12][12];
        int stNeg = 0;
        int min = 50;
        int[] ponovitve = new int[61];
        int vsotaVrstice;

        for(int i = 0; i < tab.length; i++){
            vsotaVrstice = 0;
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*61 - 10);
                System.out.print(((tab[i][j] < 10 && tab[i][j] >= 0) ? (" " + tab[i][j]):(tab[i][j])) + " ");
                if(tab[i][j] < 0)
                    stNeg++;
                if(tab[i][j] < min){
                    min = tab[i][j];
                }
                ponovitve[tab[i][j] + 10]++;
                vsotaVrstice += tab[i][j];
            }
            System.out.println(" vsota: " + vsotaVrstice);
        }
        System.out.println("V tabeli je " + stNeg + " negativnih stevil, najmanjse stevilo v tabeli je " + min + ".");
        int najv = ponovitve[0], kolikokrat = 0;
        for(int i = 0; i < ponovitve.length; i++){
            if(ponovitve[i] > najv){
                najv = i;
                kolikokrat = ponovitve[i];
            }
        }
        System.out.println("Najveckrat se ponovi stevilo " + (najv - 10) + ", in sicer " + kolikokrat + "x.");

        int max = -10, imax1 = 0, imax2 = 0;
        int a = 0;
        int kateroNajvecje = 2;
        while(a < kateroNajvecje){
            max = -10;
            for(int i = 0; i < tab.length; i++){
                for(int j = 0; j < tab[0].length; j++){
                    if(tab[i][j] > max){
                        max = tab[i][j];
                        imax1 = i;
                        imax2 = j;
                    }
                }
            }
            tab[imax1][imax2] = -10;
            a++;
        }
        System.out.println(kateroNajvecje + ". najvecje stevilo v tabeli je " + max);

    }
}
