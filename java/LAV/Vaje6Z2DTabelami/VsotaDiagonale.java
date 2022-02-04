public class VsotaDiagonale {
    public static void main(String[] args){
        
        int[][] tab = new int[9][9];
        tabela(tab);
        int vsotaPrva = 0, vsotaDruga = 0;
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                if(i == j)
                    vsotaPrva += tab[i][j];
                if(i + j == tab.length - 1)
                    vsotaDruga += tab[i][j];
            }
        }
        if(vsotaPrva > vsotaDruga)
            System.out.println("Vsota prve diagonale: " + vsotaPrva);
        else
            System.out.println("Vsota druge diagonale: " + vsotaDruga);
    }

    public static void tabela(int[][] tab){
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*10);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
