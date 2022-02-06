import java.util.Scanner;

public class Loto {
    public static void main(String[] agrs)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Vnesi izzrebana stevila eno po eno: ");
        int[] izzrebane = new int[7];
        for(int i = 0; i < 7; i++){
            int st = s.nextInt();
            izzrebane[i] = st;
        }
        for(int j = 0; j < 7; j++)
            System.out.print(izzrebane[j] + " ");
        System.out.println();
        System.out.println("Koliko kombinacij? ");
        int n = s.nextInt();
        s.close();
        int stevil = 7;
        int[][] kombinacije = new int[n][stevil];

        for(int i = 0; i < kombinacije.length; i++){
            int ponavljanje[] = new int[10];
            int j = 0;
            int zadetkov = 0;
            for(;j < kombinacije[0].length; j++){
                int st = (int)(Math.random()*9 + 1);
                if(ponavljanje[st] == 0){
                    kombinacije[i][j] = st;
                    System.out.print(kombinacije[i][j] + " ");
                    ponavljanje[st]++;
                    if(izzrebane[j] == kombinacije[i][j])
                        zadetkov++;
                }
                else
                    j--;
            }
            System.out.println(" zadetkov: " + zadetkov);
        }
    }
}
