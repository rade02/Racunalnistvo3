import java.util.Scanner;
public class KombinacijeLoto {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int stevilaDo = 10;
        int stevil = 7;
        int[] izzrebana = new int[stevil];

        //vnos stevil izzrebane kombinacije
        int stevec = 1;
        do{
        System.out.println("Vnesi " + stevec + ". stevilo izzrebane kombinacije: ");
        izzrebana[stevec - 1] = s.nextInt();
        stevec++;
        } while(stevec <= 7);
        
        //izpis izzrebane kombinacije
        for(int i = 0; i < izzrebana.length; i++)
            System.out.print(izzrebana[i] + " ");
        System.out.println();

        System.out.println("Koliko kombinacij? ");
        int n = s.nextInt();
        s.close();
        System.out.println();
        
        int[][] tab = new int[n][stevil];
        

        for(int i = 0; i < tab.length; i++){

            int st[] = new int[stevilaDo + 1]; //da se stevila ne ponovijo, njihovo pojavnost zapisemo v tabelo
            int zadetkov = 0;

            for(int j = 0; j < tab[0].length; j++){

                tab[i][j] = (int)(Math.random()*(stevilaDo + 1));

                if(st[tab[i][j]] == 0){ //ce se nakljucno stevilo se ni pojavilo v kombinaciji
                    System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
                    st[tab[i][j]]++;
                    //ce je vrednost v tabeli enaka izzrebani vrednosti
                    if(tab[i][j] == izzrebana[j]){
                        zadetkov++;
                    }
                }
                else
                    j--;
            }
            System.out.println(" Zadeli smo " + zadetkov + " stevil v kombinaciji.");
        }
    }
}
