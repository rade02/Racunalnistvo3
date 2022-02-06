public class RazlicniElementi {
    public static void main(String[] args){
        int[][] tab = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        boolean razlicni = true;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length - 1; j++){
                if(tab[i][j] == tab[i][j + 1]){
                    razlicni = false;
                    break;
                }
            }
        }
        System.out.println((razlicni) ? ("DA"):("NE"));

    }
}
