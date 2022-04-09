package String_StringBuffer_Character;

public class KodiranjeBesedila {
    public static void main(String[] args){

        String besedilo = "skrivnostno besedilo";

        String zakodiranoBesedilo = zakodiraj(besedilo);

        System.out.println(odkodiraj(zakodiranoBesedilo));
    }

    public static String zakodiraj(String s){
        String n1 = "";
        String n2 = "";
        int polovica = s.length()/2 - 1;

        for(int i = 0; i < s.length(); i++){
            if(i <= polovica){
                n1 += s.charAt(i);
            }
            else{
                n2 += s.charAt(i);
            }
        }

        String zakodirano = "";

        for(int i = 0; i < n1.length(); i++){
            zakodirano += n1.charAt(i);
            zakodirano += n2.charAt(i);
        }

        return zakodirano;
    }

    public static String odkodiraj(String s){
        String a1 = "";
        String a2 = "";

        for(int i = 0; i < s.length(); i++){
            if(i % 2 != 0){
                a1 += s.charAt(i);
            }
            else{
                a2 += s.charAt(i);
            }
        }

        return (a2 + a1);
    }
}
