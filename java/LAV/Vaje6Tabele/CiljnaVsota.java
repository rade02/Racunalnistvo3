import java.util.Scanner;
public class CiljnaVsota {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int[] tab = new int[40];
        System.out.println("Vnesi ciljno vsoto: ");
        int ciljVsota = s.nextInt();
        s.close();

        //napolnitev in izpis
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int)(Math.random()*30);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        //ciljna vsota
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){
                if(tab[i] + tab[j] == ciljVsota){
                    System.out.println("tab[" + i + "] + tab[" + j + "] = " + ciljVsota);
                }
            }
        }
    }
}
