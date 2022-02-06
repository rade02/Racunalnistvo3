package Vaje2DTabele;

public class VsotiDiagonal {
    public static void main(String[] args)
    {
        int[][] tab = new int[9][9];
        int vsotaPrve = 0, vsotaDruge = 0;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*9 + 1);
                System.out.print(tab[i][j] + " ");
                if(i == j){
                    vsotaPrve += tab[i][j];
                }
                else if(i + j == tab.length - 1){
                    vsotaDruge += tab[i][j];
                }
            }
            System.out.println();
        }

        if(vsotaPrve > vsotaDruge)
            System.out.println("Vsota prve diagonale je vecja od druge (" + vsotaPrve + " > " + vsotaDruge + ").");
        else if(vsotaPrve < vsotaDruge)
            System.out.println("Vsota druge diagonale je vecja od prve (" + vsotaPrve + " < " + vsotaDruge + ").");
        else
            System.out.println("Vsota prve diagonale je enaka drugi (" + vsotaPrve + " == " + vsotaDruge + ").");
    }
}
