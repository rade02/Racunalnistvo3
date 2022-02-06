public class Minolovec2 {
    public static void main(String[] args)
    {
        int velikost = 20;
        int[][] polje = new int[velikost][velikost];
        int bomb = 20;

        for(int i = 0; i < bomb; i++){
            polje[(int)(Math.random()*velikost)][(int)(Math.random()*velikost)] = 9;
        }

        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++){
                int stBomb = 0;
                if(polje[i][j] == 0){
                    for(int k = i - 1; k <= i + 1; k++){
                        for(int l = j - 1; l <= j + 1; l++){
                            if(k >= 0 && l >= 0 && k < polje.length && l < polje[0].length && polje[k][l] == 9){
                                stBomb++;
                            }
                        }
                    }
                    polje[i][j] = stBomb;
                }
            }
        }

        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++){
                System.out.print(polje[i][j] + " ");
            }
            System.out.println();
        }

    }
}
