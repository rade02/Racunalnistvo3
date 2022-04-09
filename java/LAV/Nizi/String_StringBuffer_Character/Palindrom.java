package String_StringBuffer_Character;

public class Palindrom {
    public static void main(String[] args){

        String niz = "Peter pazi se, če si za pretep!";

        String niz2 = "";

        for(int i = 0; i < niz.length(); i++){
            if(Character.isLetter(niz.charAt(i))){
                niz2 += Character.toLowerCase(niz.charAt(i));
            }
        }

        boolean jePalindrom = true;
        for(int i = 0; i < niz2.length()/2; i++){
            if(niz2.charAt(i) != niz2.charAt(niz2.length() - 1 - i)){
                jePalindrom = false;
                break;
            }
        }
        System.out.println((jePalindrom) ? ("je palindrom"):("ni palindrom"));

    }
}
