package String_StringBuffer_Character;

public class PrevecPresledkov {
    public static void main(String[] args){

        String niz = "danes   je      petek";

        //z razredom String
        String niz2 = "";
        for(int i = 0; i < niz.length(); i++){
            if(Character.isWhitespace(niz.charAt(i))){
                int j = i + 1;
                int stevec = 0;
                while(Character.isWhitespace(niz.charAt(j))){
                    j++;
                    stevec++;
                }
                i += stevec;
            }
            niz2 += niz.charAt(i);
        }
        System.out.println(niz2);

        //z razredom StringBuffer
        StringBuffer sb = new StringBuffer(niz);
        for(int i = 0; i < sb.length(); i++){
            if(Character.isWhitespace(sb.charAt(i))){
                int j = i + 1;
                while(Character.isWhitespace(sb.charAt(j))){
                    sb.deleteCharAt(j);
                }
            }
        }
        System.out.println(sb);
    }
}
