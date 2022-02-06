public class PascalovTrikotnik {
    public static void main(String[] args){

        int n = 10; //st. vrstic trikotnika
        int[][] tab = new int[n][n];

        for(int i = 0; i < tab.length; i++){ //cez vrstice
            
            for(int j = 0; j < tab[0].length; j++){ //cez stolpce
                
                if(j <= i){
                    //na zacetku je vedno 1
                    if((j == 0) || (i == 0))
                        tab[i][j] = 1;
                    //potem pa je sestevek prejsnjih dveh stevil iz prejsnje vrstice
                    else
                        tab[i][j] = tab[i - 1][j] + tab[i - 1][j - 1];
                    
                    System.out.print(tab[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
