import java.util.Scanner;
public class UstrezniIndeksi {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int[] tab = new int[40];

        //napolnimo tabelo
        for(int i = 0; i < tab.length; i++)
            tab[i] = (int)(Math.random()*11);
        
        //vnos ciljne vsote
        int ciljnaVsota;
        do{
        System.out.println("Vnesi ciljno vsoto med 0 in 20: ");
        ciljnaVsota = s.nextInt();
        } while((ciljnaVsota < 0) || (ciljnaVsota > 20));
        System.out.println();
        s.close();

        //izpis indeksov, pri katerih je vsota vrednosti enaka ciljniVsoti
        for(int j = 0; j < tab.length; j++){
            for(int k = j; k < tab.length; k++){
                if(tab[j] + tab[k] == ciljnaVsota)
                    System.out.println(j + "," + k + "  ");
            }
        }
    }
}
