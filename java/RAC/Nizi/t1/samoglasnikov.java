package t1;

import java.util.Arrays;

public class samoglasnikov {
    public static void main(String[] args){

        String s = new String("Danes je lep dan in jutri bo tudi lep dan.");

        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};
        int[] stevilo = new int[5];

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < samoglasniki.length; j++){
                if(s.charAt(i) == samoglasniki[j]){
                    stevilo[j]++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(stevilo));

    }
}
