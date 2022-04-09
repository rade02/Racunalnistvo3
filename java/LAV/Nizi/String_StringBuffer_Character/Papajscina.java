package String_StringBuffer_Character;

public class Papajscina {
    public static void main(String[] args){

        String besedilo = "besedilo je zanimivo";

        String samoglasniki = "aeiouAEIOU";

        //z razredom String
        String nov = "";
        for(int i = 0; i < besedilo.length(); i++){
            for(int j = 0; j < samoglasniki.length(); j++){
                if(besedilo.charAt(i) == samoglasniki.charAt(j)){
                    nov += (besedilo.charAt(i) + "p");
                    break;
                }
            }
            nov += besedilo.charAt(i);
        }
        System.out.println(nov);

        //z razredom StringBuffer
        StringBuffer sb = new StringBuffer(besedilo);
        for(int i = 0; i < sb.length(); i++){
            for(int j = 0; j < samoglasniki.length(); j++){
                if(sb.charAt(i) == samoglasniki.charAt(j)){
                    sb.insert(i + 1, "p" + sb.charAt(i));
                    i += 2;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
