public class Sudoku {
    public static void main(String[] args)
    {
        int[][] polje = new int[9][9];

        polje = napolni(polje); //nakljucno generiramo stevila

        System.out.println("Napake v vrsticah:");
        preveriVrstice(polje);
        System.out.println("Napake v stolpcih:");
        preveriStolpce(polje);
        System.out.println("Napake v kvadratih:");
        preveriKvadrate(polje);
        
    }

    public static void preveriKvadrate(int[][] tab)
    {
        for(int a = 0; a < 9; a += 3){  //gremo cez vse tri navpicne kvadrate
            for(int b = 0; b < 9; b += 3){  //gremo cez vse tri vodoravne kvadrate
            int[] ponavljanje = new int[10];
            for(int i = a; i <= a + 2; i++){    //gremo cez vse elemente kvadrata in zapisujemo v tabelo, kolikokrat se pojavijo
                for(int j = b; j <= b + 2; j++)
                    ponavljanje[tab[i][j]]++;
            }
            for(int i = a; i <= a + 2; i++) //gremo se enkrat cez elemente kvadrata in izpisemo indekse, na katerih so vrednosti, ki se veckrat pojavijo
                for(int j = b; j <= b + 2; j++)
                    if(ponavljanje[tab[i][j]] > 1)
                        System.out.print("[" + i + "][" + j + "] ");
            }
        }
        System.out.println();
    }

    public static void preveriStolpce(int[][] tab)
    {
        int[] pojavnost = new int[10]; //v tabeli bomo shranjevali, kolikokrat se pojavi stevka v stolpcu
        for(int i = 0; i < tab[0].length; i++){ //gremo cez vse stolpce
            pojavnost = new int[10];
            for(int j = 0; j < tab.length; j++) //gremo cez vse elemente v stolpcu in zapisujemo v tabelo, kolikokrat se pojavijo
                pojavnost[tab[j][i]]++;
            for(int j = 0; j < tab.length; j++) //gremo se enkrat cez elemente stolpca in izpisemo indekse, na katerih so vrednosti, ki se veckrat pojavijo
                if(pojavnost[tab[j][i]] > 1)
                    System.out.print("[" + j + "][" + i + "] ");
        }
        System.out.println();
    }

    public static void preveriVrstice(int[][] tab)
    {
        int[] pojavnost = new int[10];  //v tabeli bomo shranjevali, kolikokrat se pojavi stevka v vrstici
        for(int i = 0; i < tab.length; i++){ //gremo cez vse vrstice
            pojavnost = new int[10];
            for(int j = 0; j < tab[0].length; j++) //gremo cez vse elemente v vrstici in zapisujemo v tabelo, kolikokrat se pojavijo
                pojavnost[tab[i][j]]++;
            for(int j = 0; j < tab[0].length; j++) //gremo se enkrat cez elemente vrstice in izpisemo indekse, na katerih so vrednosti, ki se veckrat pojavijo
                if(pojavnost[tab[i][j]] > 1)
                    System.out.print("[" + i + "][" + j + "] ");
        }
        System.out.println();
    }

    public static int[][] napolni(int[][] tab)
    {
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*9 + 1); //napolnimo s stevili od 1 do 9
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        return tab;
    }
}
