import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String ime = "erik";
        int stevilo = 7;
        char[] chars = new char[ime.length()];

        for(int i = 0; i < ime.length(); i++){
            chars[i] = (char)((int)ime.charAt(i) + stevilo);
        }

        System.out.println(Arrays.toString(chars));
    }
}