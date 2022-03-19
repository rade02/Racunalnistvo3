package t2;

public class leksikalnaPrimerjava {
    public static void main(String[] args){

        String s1 = "abcde";
        String s2 = "abcd";
        String s3 = "aa";
        String s4 = "a";
        String s5 = "Abcde";
        String s6 = "Ab";
        String s7 = "Abcd";

        System.out.println(s1.compareTo(s2));   //s1 > s2, izpis: 1     (en znak vec je pri s1)
        System.out.println(s4.compareTo(s3));   //s4 < s3, izpis: -1    (en znak manj je pri s4)
        System.out.println(s4.compareTo(s6));   //s4 > s6, izpis: 32    ((int)'a' - (int)'A')
        System.out.println(s5.compareTo(s6));   //s5 > s6, izpis: 3     (trije znaki vec so v s5)
        System.out.println(s1.compareToIgnoreCase(s5)); //s1 == s5, izpis: 0    (enaka)
        System.out.println(s7.compareTo(s5));   //s7 < s5, izpis: -1    (en znak manj je pri s7)

        //ce niza nista enako dolga, vrne stevilo znakov, ki jih je vec/manj v drugem nizu
        //velike crke imajo manjso ASCII kodo

    }
}
