public class Tabela2 {
    public static void main(String[] args){
        
        int n = 10; //dolzina kvadratne tabele
        int tab[][] = new int[n][n];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){ //tukaj lahko uporabimo tab.length brez [0], ker je tabela kvadratna
                tab[0][j] = 1;
                tab[tab.length - 1][j] = 1;
                tab[i][0] = 1;
                tab[i][tab.length - 1] = 1;
            }
        }
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++)
                System.out.print(tab[i][j] + " ");
            System.out.println();
        }
    }
}
