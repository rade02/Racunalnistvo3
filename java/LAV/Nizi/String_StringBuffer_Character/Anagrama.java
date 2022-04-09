package String_StringBuffer_Character;

public class Anagrama {
    public static void main(String[] args){

        String n1 = "A decimal point";
        String n2 = "I'm a dot in place";

        StringBuffer sb1;
        StringBuffer sb2;
        
        if(n1.length() > n2.length()){
            sb1 = new StringBuffer(n1);
            sb2 = new StringBuffer(n2);
        }
        else{
            sb1 = new StringBuffer(n2);
            sb2 = new StringBuffer(n1);
        }

        boolean nadaljuj = false;
        boolean anagrama = true;
        for(int i = 0; i < sb1.length(); i++){
            if(!Character.isLetter(sb1.charAt(i))){
                sb1.deleteCharAt(i);
                break;
            }
            for(int j = 0; j < sb2.length(); j++){
                if(Character.toLowerCase(sb1.charAt(i)) == Character.toLowerCase(sb2.charAt(j))){
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);
                    nadaljuj = true;
                    break;
                }
                if(sb2.length() == 0){
                    if(sb1.length() != 0){
                        nadaljuj = false;
                        break;
                    }
                }
            }
            if(!nadaljuj){
                anagrama = false;
                break;
            } 
        }

        System.out.println((anagrama) ? ("sta anagrama"):("nista anagrama"));
        
    }
}
