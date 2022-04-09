package String_StringBuffer_Character;

public class PrvaCrkaVBesedi {
    public static void main(String[] args){

        String niz = "danes je petek";

        //z razredom String
        String niz2 = "";
        for(int i = 0; i < niz.length(); i++){
            if(i == 0){
                niz2 += Character.toUpperCase(niz.charAt(i));
            }
            else if(Character.isWhitespace(niz.charAt(i - 1))){
                niz2 += Character.toUpperCase(niz.charAt(i));
            }
            else{
                niz2 += niz.charAt(i);
            }
        }
        System.out.println(niz2);

        //z razredom StringBuffer
        StringBuffer sb = new StringBuffer(niz);

        for(int i = 0; i < sb.length(); i++){
            if(i == 0){
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
            else if(Character.isWhitespace(sb.charAt(i - 1))){
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        System.out.println(sb);
    }
}
