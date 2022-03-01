public class Nizi1 {
    public static void main(String[] args){

        String niz = "r ad,a!r";

        /*//diagonalno
        for(int i = 0; i < niz.length(); i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println(niz.charAt(i));
        }*/

        /*//palindrom
        boolean jePalindrom = true;
        for(int i = 0; i < niz.length()/2; i++){
            if(niz.charAt(i) != niz.charAt(niz.length() - i - 1)){
                jePalindrom = false;
                break;
            }
        }
        System.out.println((jePalindrom) ? ("je palindrom"):("ni palindrom"));
        */

        /*//stevilo crk
        char a = 'a';
        int stevec = 0;
        for(int i = 0; i < niz.length(); i++){
            if(niz.charAt(i) == a)
                stevec++;
        }
        System.out.println(stevec + "-krat se pojavi '" + a + "' v nizu.");
        */

        /*//samoglasniki
        String samoglasniki = "AEIOUaeiou";
        int st = 0;
        for(int i = 0; i < niz.length(); i++){
            for(int j = 0; j < samoglasniki.length();j++){
                if(niz.charAt(i) == samoglasniki.charAt(j))
                    st++;
            }
        }
        System.out.println("Samoglasnikov je " + st + " v nizu.");
        */

        /*//brisanje presledkov in locil
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < niz.length(); i++){
            if(Character.isLetter(niz.charAt(i))){
                sb.append(niz.charAt(i));
            }
        }
        System.out.println(sb);
        */

        /*//izpis le sodih elementov
        for(int i = 0; i < niz.length(); i++){
            if(i % 2 == 0)
                System.out.print(niz.charAt(i));
        }
        */

        //samo velike crke
        StringBuffer stb = new StringBuffer();
        for(int i = 0; i < niz.length(); i++){
            char c = niz.charAt(i);
            if(Character.isLowerCase(niz.charAt(i)))
                c = Character.toUpperCase(niz.charAt(i));
            stb.append(c);
        }
        System.out.println(stb);

    }
}
