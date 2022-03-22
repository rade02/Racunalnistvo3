import java.util.Arrays;

public class sbNaloge {
    public static void main(String[] args){

        String niz = "Danes je lep dan. Upamo, da bo na današnji prireditvi čim več obiskovalcev. Lansko leto jih je bilo 300, predlansko pa 270. V stavbi je prosotra za 400 obiskovalcev.";

        StringBuffer sb = new StringBuffer(niz);

        //katera beseda se najveckrat ponovi
        for(int i = 0; i < sb.length(); i++){   //naredimo StringBuffer brez locil
            if(!(Character.isLetter(sb.charAt(i)) || (Character.isWhitespace(sb.charAt(i)) || (Character.isDigit(sb.charAt(i)))))){
                sb.deleteCharAt(i);
            }
        }
        String n = new String(sb.toString());   //naredimo String za .split()
        String[] tab = n.split(" ");
        Arrays.sort(tab);   //sortiramo tabelo

        int stevec = 0, najvecEnakih = 0, enakih = 0;
        String najveckratPonovljena = "";
        //System.out.println(Arrays.toString(tab));

        while(stevec < tab.length - 1){ //gremo cez celo tabelo
            enakih = 1;
            int s = stevec;
            
            while(true){   //dokler so enaki elementi, iscemo, koliko je enakih
                if(!(tab[s].equals(tab[s + 1]))){
                    break;
                }
                enakih++;
                s++;
            }
            if(enakih > najvecEnakih){
                najvecEnakih = enakih;
                najveckratPonovljena = tab[stevec];
            }
            stevec += enakih;
        }
        System.out.println("Najveckrat se ponovi beseda: " + najveckratPonovljena + ", in sicer " + najvecEnakih + "-krat.");
        
        //koliko je presledkov
        int stPresledkov = 0;
        for(int i = 0; i < sb.length(); i++){
            if(Character.isWhitespace(sb.charAt(i)))
                stPresledkov++;
        }
        System.out.println("vsebuje: " + stPresledkov + " presledkov");

        //koliko je samoglasnikov
        char[] samogl = {'a', 'e', 'i', 'o', 'u'};
        int stSamogl = 0;
        for(int i = 0; i < sb.length(); i++){
            for(int j = 0; j < samogl.length; j++){
                if(sb.charAt(i) == samogl[j]){
                    stSamogl++;
                    break;
                }
            }
        }
        System.out.println("vsebuje: " + stSamogl + " samoglasnikov");

        //koliko povedi je v nizu
        int stPovedi = 0;
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '.'){
                stPovedi++;
            }
        }
        System.out.println("skupaj je " + stPovedi + " povedi");

        //prvi niz "la" v nizu
        String niz2 = "la";
        int indeks = 0;
        for(int i = 0; i < sb.length(); i++){
            indeks = sb.indexOf(niz2); //ne dela metoda .toLowerCase() za StringBuffer
        }
        System.out.println("prvi niz " + niz2 + " se nahaja na indeksu " + indeks); //upošteva tudi razliko med velikimi/malimi črkami

        //kje je zadnja pika v nizu
        int i2 = sb.lastIndexOf(".");
        System.out.println(i2);
        
    }
}
