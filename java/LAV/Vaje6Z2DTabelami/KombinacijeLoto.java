import java.util.Scanner;
public class KombinacijeLoto {
  
    public static void main(String[] args){
      
        Scanner s = new Scanner(System.in);
        System.out.println("Koliko kombinacij? ");
        int n = s.nextInt();
        s.close();
        int stevil = 7;
        int[][] tab = new int[n][stevil];
        int stevilaDo = 10;
        
        for(int i = 0; i < tab.length; i++){
            int st[] = new int[stevilaDo + 1]; //da se stevila ne ponovijo, njihovo pojavnost zapisemo v tabelo
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*(stevilaDo + 1));
                if(st[tab[i][j]] == 0){ //ce stevila se ni v kombinaciji, ga izpisemo
                    System.out.print(((tab[i][j] < 10) ? (" " + tab[i][j]):(tab[i][j])) + " ");
                    st[tab[i][j]]++;
                }
                else //ce je stevilo ze v kombinaciji, ga preskocimo in zmanjsamo stevec stevil v kombinaciji
                    j--;
            }
            System.out.println();
        }
    }
}
