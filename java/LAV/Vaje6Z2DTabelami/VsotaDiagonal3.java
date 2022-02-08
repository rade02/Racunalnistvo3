public class VsotaDiagonal3 {
    public static void main(String[] args){
        
        int[][] tab = new int[9][9];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*5);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int vsota1 = 0;
        for(int i = 0; i < tab.length; i++){
            vsota1 += tab[i][i];
        }
        int vsota2 = 0;
        for(int j = 0; j < tab.length; j++){
            vsota2 += tab[tab.length - 1 - j][j];
        }
        System.out.println("Vsota prve: " + vsota1 + ", vsota druge: " + vsota2);

    }
}
