public class Tabela3 {
    public static void main(String[] args){
        
        int n = 5; //dolzina kvadratne tabele
        int tab[][] = new int[n][n];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){ //tukaj lahko uporabimo tab.length brez [0], ker je tabela kvadratna
                if((i - j) % 2 == 0)
                    tab[i][j] = 1;
                else
                tab[i][j] = 0;
            }
        }
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++)
                System.out.print(tab[i][j] + " ");
            System.out.println();
        }
    }
}
