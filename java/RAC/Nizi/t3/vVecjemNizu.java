package t3;

import java.util.Arrays;

public class vVecjemNizu {
    public static void main(String[] args){

        String niz = "Danes je lep dan. Upamo, da bo na današnji prireditvi čim več obiskovalcev. Lansko leto jih je bilo 300, predlansko pa 270. V stavbi je prosotra za 400 obiskovalcev.";
        
        String nizLeCrke = "";

        for(int i = 0; i < niz.length(); i++){
            if(Character.isLetter(niz.charAt(i)) || Character.isDigit(niz.charAt(i)) || Character.isWhitespace(niz.charAt(i))){
                nizLeCrke += niz.charAt(i);
            }
        }

        String[] s = nizLeCrke.split(" ");
        
        //pricne na "dan"
        int pricneNaDan = 0;

        for(int i = 0; i < s.length; i++){
            if((s[i].toLowerCase()).startsWith("dan")){
                pricneNaDan++;
            }
        }
        System.out.println(Arrays.toString(s));
        System.out.println("Besed, ki se pricnejo na 'dan':" + pricneNaDan);

        //koliko je enakih besed??
        //...

        //tabela z dolzinami besed ter najdaljsa in najkrajsa beseda
        String najdaljsa = s[0];
        String najkrajsa = s[0];
        int[] tab = new int[s.length];

        for(int i = 0; i < s.length; i++){
            tab[i] = s[i].length();
            if(tab[i] > najdaljsa.length())
                najdaljsa = s[i];
            if(tab[i] < najkrajsa.length())
                najkrajsa = s[i];
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Najdaljsa beseda: " + najdaljsa + ", najkrajsa beseda: " + najkrajsa);

        //koliko je predlogov
        String[] predlogi = {"brez", "do", "iz", "od", "z", "s", "za", "h", "k", "proti", "kljub", "čez", "skozi", "zoper", "po", "o", "pri", "na", "ob", "med", "nad", "pod", "pred", "razen", "v", "zaradi"};
        int steviloPredlogov = 0;

        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < predlogi.length; j++){
                if(s[i].toLowerCase().equals(predlogi[j]))
                    steviloPredlogov++;
            }
        }
        System.out.println("Predlogov je: " + steviloPredlogov);

        //kolikokrat se pojavi "la"
        String zlog = "la";
        int stPojavitev = 0;

        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i].length(); j++){
                if(s[i].toLowerCase().startsWith(zlog, j))
                    stPojavitev++;
            }
        }
        System.out.println("Zlog " + zlog + " se pojavi: " + stPojavitev + "-krat");
        
    }
}
