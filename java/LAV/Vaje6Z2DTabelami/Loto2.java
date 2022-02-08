public class Main{
    public static void main(String[] args){
        
        int n = 5;
        int stevil = 7;
        int[][] tab = new int[n][stevil];
        int[] a = {3, 6, 1, 4, 2, 8, 9};
        
        for(int i = 0; i < tab.length; i++){
            int[] p = new int[10];
            int zadetkov = 0;
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*9);
                if(p[tab[i][j]] < 1){
                    p[tab[i][j]]++;
                    System.out.print(tab[i][j] + " ");
                    if(a[j] == tab[i][j]){
                        zadetkov++;
                    }
                }
                else
                    j--;
            }
            System.out.println("zadetkov: " + zadetkov);
        }
    }
}
