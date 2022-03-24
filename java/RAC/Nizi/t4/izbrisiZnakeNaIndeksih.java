package t4;
import java.util.Scanner;

public class izbrisiZnakeNaIndeksih {
    public static void main(String[] args){
        
        String s = "Danes je lep dan. Jutri bo tudi lep dan.";
        Scanner sc = new Scanner(System.in);

        int st;
        do{
            System.out.println("Vnesi stevilo 0 ali 1:");
            st = sc.nextInt();
        } while(st != 1 && st != 0);
        sc.close();

        System.out.println(izbrisi(s, st));
    }

    public static String izbrisi(String s, int prvi){

        StringBuffer sb = new StringBuffer(s);

        for(int i = prvi; i < sb.length(); i += 2){
            if(!Character.isWhitespace(sb.charAt(i))){
                //sb.deleteCharAt(i);
                //ali
                sb.delete(i, i+1);
                i--;
            }
        }
        return sb.toString();
    }
}
