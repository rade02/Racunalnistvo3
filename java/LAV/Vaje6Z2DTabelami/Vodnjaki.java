public class Vodnjaki {

    /* delovanje:
    V tabelo obmocja vstavimo doloceno stevilo vodnjakov. Za vsakega si zapomnimo njegove koordinate v posebni tabeli "koordV".
    Ce zelimo izpisemo tabelo obmocja in tabelo koordinat vodnjakov. Naredimo 1d tabelo, ki bo shranjevala stevilo celic obmocja, ki
    jih pokriva vodnjak (ki je najblizji). Gremo cez vse elemente obmocja in za vsak vodnjak izracunamo razdaljo od tocke do njega 
    (gledamo na koordinate vodnjaka v tabeli "koordV"). Zapomnimo si najmanjso razdaljo in tudi indeks najblizjega vodnjaka. V tabeli,
    ki hrani povrsine vodnjakov ("povrVodnj"), po izracunu razdalj za vse vodnjake do te tocke, povecamo vrednost na indeksu vodnjaka za 1.
    Tako dobimo tabelo, ki hrani stevilo tock, ki pripadajo posameznemu vodnjaku.
    */
  
    public static void main(String[] args){

        int obmocje[][] = new int[50][50];
        int vodnjakov = 10;

        //naredimo tabelo, v kateri so koordinate vseh vodnjakov
        int[][] koordV = vodnjaki(obmocje, vodnjakov);
        izpis(obmocje);
        System.out.println("Koordinate vodnjakov: ");
        System.out.println("x | y");
        izpis(koordV);

        //naredimo 1d tabelo, v kateri shranjujemo povrsino, ki jo posamezen vodnjak pokriva
        int[] povrVodnj = povrsina(obmocje, koordV, vodnjakov);

        //izpis
        int vsotaPovrsin = 0;
        for(int i = 0; i < povrVodnj.length; i++){
            System.out.println(((i + 1 < 10) ? (" " + (i + 1)):((i + 1))) + ". vodnjak ima povrsino " + ((povrVodnj[i] < 100) ? (" " + povrVodnj[i]):(povrVodnj[i])) + ".");
            vsotaPovrsin += povrVodnj[i];
        }
        System.out.println("Vsota povrsin vodnjakov (povrsina obmocja) je " + vsotaPovrsin + " (" + (int)(Math.sqrt(vsotaPovrsin)) +"x" + (int)(Math.sqrt(vsotaPovrsin)) + ").");
        System.out.println();
    }

    public static int[] povrsina(int[][] obmocje, int[][] koord, int vodnjakov){

        int[] povrVodnj = new int[vodnjakov];

        //gremo cez vse elemente obmocja
        for(int i = 0; i < obmocje.length; i++){
            for(int j = 0; j < obmocje[0].length; j++){

                //preverimo razdaljo od vsake tocke do vsakega vodnjaka
                double minRazdalja = 49;
                int vodnjak = 0;
                for(int k = 0; k < koord.length; k++){ //za vsak vodnjak
                    double razdalja = Math.sqrt(Math.pow((koord[k][0] - i), 2) + Math.pow((koord[k][1] - j), 2));
                    //ce je razdalja najmanjsa, je ta celica obmocje tega vodnjaka, zapomnimo si ga
                    if(razdalja < minRazdalja){
                        minRazdalja = razdalja;
                        vodnjak = k;
                    }
                }
                //vsakemu vodnjaku pristevamo, ce celica pripada njemu
                povrVodnj[vodnjak]++;
            }
        }
        return povrVodnj;
    }


    public static int[][] vodnjaki(int[][] obmocje, int vodnjakov){
        
        int[][] koord = new int[vodnjakov][2];
        
        //za vsak vodnjak nakljucno izberemo x in y in ju zapisemo v tabelo koordinat
        for(int k = 0; k < vodnjakov; k++){
            int x = (int)(Math.random()*49 + 1);
            int y = (int)(Math.random()*49 + 1);
            obmocje[x][y] = 11;
            koord[k][0] = x;
            koord[k][1] = y; 
        }
        return koord;
    }


    //izpis 2d tabele 
    public static void izpis(int[][] tab){
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
