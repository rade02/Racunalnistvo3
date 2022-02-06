public class DrugNajvecje {
    public static void main(String[] args){

        int[] tab = new int[10];
        int kateroNajvecje = 2; //katero najvecje stevilo iscemo

        //napolnimo z nakljucnimi vrednostmi in izpisemo
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int)(Math.random()*20);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        //najdemo drugo najvecje stevilo v tabeli
        int a = 0, max = 0;
        while(a < kateroNajvecje){
            int imax = -1; //indeks najvecjega je na zacetku -1
            max = 0;    //najvecji je na zacetku 0
            //gremo cez tabelo in najdemo najvecji element
            for(int j = 0; j < tab.length; j++){
                if(tab[j] > max){
                    max = tab[j];
                    imax = j;
                }
            }
            //najvecji element nadomestimo z 0
            tab[imax] = 0;
            //povecamo a, da gremo se enkrat cez tabelo in tako dobimo drugo najvecje stevilo v njej
            a++;
        }
        System.out.println(kateroNajvecje + ". najvecje stevilo v tabeli je " + max);
    }
}
