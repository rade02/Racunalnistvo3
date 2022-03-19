package t2;

import java.util.Arrays;

public class urejanjePoVelikosti {
    public static void main(String[] args){

        String[] s = {"a", "abcd", "abcde", "ab", "abc"};

        /*//s selection sortom
        int neurejen = 0;
        while(neurejen < s.length){
            int min = neurejen;
            for(int j = neurejen; j < s.length; j++){
                if(s[j].length() < s[min].length()){
                    min = j;
                }
            }
            String tmp = s[neurejen];
            s[neurejen] = s[min];
            s[min] = tmp;
            neurejen++;
        }
        System.out.println(Arrays.toString(s));
        */

        //z bubble sortom
        boolean menjaj = true;

        while(menjaj){
            menjaj = false;
            for(int i = 0; i < s.length - 1; i++){
                if(s[i].length() > s[i + 1].length()){
                    String temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                    menjaj = true;
                }
            }
        }

        System.out.println(Arrays.toString(s));

    }
}
