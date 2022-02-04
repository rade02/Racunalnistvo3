public class Tabela144 {
    public static void main(String[] args){

        int[][] tab = new int[12][12];
        int min = -10, max = 50;

        int stNeg = 0, mi = tab[0][0], ma = tab[0][0], maxVsotaVrstice = 0, maxVrsticaIndeks = 0;
        int[] frekvencaStevil = new int[(max - min) + 1];

        for(int i = 0; i < tab.length; i++){
            int vsotaVrstice = 0;
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*(max - min + 1) + min);
                if(tab[i][j] < 0)
                    stNeg++;
                if(tab[i][j] < mi)
                    mi = tab[i][j];
                vsotaVrstice += tab[i][j];
                if(vsotaVrstice > maxVsotaVrstice){
                    maxVsotaVrstice = vsotaVrstice;
                    maxVrsticaIndeks = i;
                }
                frekvencaStevil[tab[i][j] + 10]++;
            }
        }
        
        izpis(tab);

        int naj = frekvencaStevil[0];
        for(int i = 0; i < frekvencaStevil.length; i++){
                if(frekvencaStevil[i] > naj){
                    naj = frekvencaStevil[i];
                }
        }
        /*int najv = tab[0][0];
        int a = 0;
        int inaj = 0, jnaj = 0;
        int dva = drugoNajvecjeSt(tab, najv, inaj, jnaj, a);*/

        System.out.println("Negativnih je " + stNeg + " stevil, najmanjse stevilo je " + mi + ", drugo najvecje stevilo pa je " + /*dva +*/ ".\nVsota stevil je najvecja v vrstici " + maxVrsticaIndeks + ", najveckrat se v tabeli ponovi stevilo " + naj + ".");
    }

    public static int drugoNajvecjeSt(int[][] tab, int najv, int inaj, int jnaj, int a){
        int i = 0;
        int j = 0;
        for(;i < tab.length; i++){
            for(;j < tab[0].length; j++){
                if((tab[i][j] > najv) && (i != inaj) && (j != jnaj)){
                    najv = tab[i][j];
                    break;
                }
            }
        }
        if(a != 1)
            drugoNajvecjeSt(tab, tab[0][0], i, j, ++a);
        
        return najv;
    }

    public static void izpis(int tab[][]){
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                System.out.print((((tab[i][j] < 10) && (tab[i][j] >= 0)) ? (" " + tab[i][j]):(tab[i][j])) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
