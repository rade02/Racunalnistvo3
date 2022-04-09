package String_StringBuffer_Character;

public class VelikeMaleCrke {
    public static void main(String[] args){

        String niz = "KaMeLa";
        
        //z razredom String
        String niz2 = "";

        for(int i = 0; i < niz.length(); i++){
            if(Character.isUpperCase(niz.charAt(i))){
                niz2 += Character.toLowerCase(niz.charAt(i));
            }
            else if(Character.isLowerCase(niz.charAt(i))){
                niz2 += Character.toUpperCase(niz.charAt(i));
            }
        }
        System.out.println(niz2);

        //z razredom StringBuffer
        StringBuffer sb = new StringBuffer(niz);

        for(int i = 0; i < sb.length(); i++){
            if(Character.isUpperCase(sb.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            else if(Character.isLowerCase(sb.charAt(i))){
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        System.out.println(sb);

    }
}
