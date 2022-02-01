public class Sudoku {
    public static void main(String[] args){
        int[][] polje = new int[9][9];

        polnjenjePolja(polje);

        izpis(polje);

        System.out.println("Pravil ne krsijo vrednosti z indeksi: ");
        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++){
                boolean krsi = false;
                
                //za vrstice in stolpce
                for(int k = 0; k < polje.length; k++){
                    //za vrstico
                    if((k != j) && (polje[i][j] == polje[i][k])){
                        krsi = true;
                        break;
                    }
                    //za stolpec
                    else if((k != i) && (polje[i][j] == polje[k][j])){
                        krsi = true;
                        break;
                    }
                }

                //za pregled kvadratov
                //zacetek in konec kvadrata navpicno
                /*int zi = 0;
                int ki = 2;

                if((i <= 5) && (i > 2)){
                    zi = 3;
                    ki = 5;
                }
                else if((i <= 8) && (i > 5)){
                    zi = 6;
                    ki = 8;
                }

                //zacetek in konec kvadrata vodoravno
                int zj = 0;
                int kj = 2;

                if((j <= 5) && (j > 2)){
                    zj = 3;
                    kj = 5;
                }
                else if((j <= 8) && (j > 5)){
                    zj = 6;
                    kj = 8;
                }
                

                int[] tab = new int[9];
                
                for(int k = zi; k <= ki; k++){
                    for(int l = zj; l <= kj; l++){
                        tab[polje[k][l]]++;
                        if(tab[polje[k][l]] > 1){
                            krsi = true;
                            i = k;
                            j = l;
                            break;
                        }
                    }
                }
*/
                if(!krsi)
                    System.out.println("[" + i + "][" + j + "]");
                
            }
        }
        
    }

    public static int[][] polnjenjePolja(int[][] polje){
        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++){
                polje[i][j] = (int)(Math.random()*9 + 1);
            }
        }
        return polje;
    }

    public static void izpis(int polje[][]){
        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++)
                System.out.print(polje[i][j] + " ");
            System.out.println();
        }
    }
}
