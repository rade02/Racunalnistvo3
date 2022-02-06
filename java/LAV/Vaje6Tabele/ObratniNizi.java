import java.util.Scanner;
public class ObratniNizi {
    public static void main(String[] args){
      
        Scanner s = new Scanner(System.in);
        int stevec = 5;
        String[] tab = new String[stevec];

        do{
            String niz = s.nextLine();
            tab[5 - stevec] = niz;
            stevec--;
        } while(stevec > 0);

        for(int i = tab.length - 1; i >= stevec; i--)
            System.out.print(tab[i] + " ");
        System.out.println();
    }
}

		
