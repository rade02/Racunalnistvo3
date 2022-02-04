public class Minolovec {
    public static void main(String[] args){

        int vrstic = 20, stolpcev = 20;
        int bomb = 20;
        int polje[][] = new int[vrstic][stolpcev];

        for(int i = 0; i < bomb; i++){
            polje[(int)(Math.random()*vrstic)][(int)(Math.random()*stolpcev)] = 9;
        }

        izpis(polje);

        okolicaBomb(polje, vrstic, stolpcev);

        izpis(polje);

    }

    public static int[][] okolicaBomb(int[][] polje, int vrstic, int stolpcev){
      
        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++){
              //v vsako prazno polje bomo napisali, koliko min je v okolici
                int bombNum = 0;
                if(polje[i][j] == 0){
                  //gremo po okolici polja z nic
                    for(int k = i - 1; k <= i + 1; k++){
                        for(int l = j - 1; l <= j + 1; l++){
                          //ce ni na robu in je 9, dodamo st. bomb nasemu polju
                            if(k >= 0 && l >= 0 && k < vrstic && l < stolpcev && polje[k][l] == 9){
                                bombNum++;
                            }
                        }
                    }
                  //na polje z niclo zapisemo st. nicel v okolici
                    polje[i][j] = bombNum;
                }
            }
        }
        return polje;
    }


    public static void izpis(int[][] polje){
        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++){
                System.out.print(polje[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
