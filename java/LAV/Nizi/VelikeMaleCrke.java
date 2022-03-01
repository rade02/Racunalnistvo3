public class VelikeMaleCrke {
    public static void main(String[] args){
        
        String niz = "ASCII (kratica za angleško American Standard Code for Information Interchange), ameriški standardni nabor za izmenjavo informacij je 7-bitni nabor znakov; obsega 27 = 128 znakov. Znaki s kodami od 0 do 31 so kontrolni znaki, znaki od 32 do 126 pa so izpisljivi, glej tabelo spodaj:";

        StringBuffer sb = new StringBuffer(niz);

        for(int i = 0; i < sb.length(); i++){
            if(Character.isLetter(sb.charAt(i))){
                if(Character.isUpperCase(sb.charAt(i))){
                    char n = Character.toLowerCase(sb.charAt(i));
                    sb.replace(i, i + 1, Character.toString(n));
                }
                else{
                    char m = Character.toUpperCase(sb.charAt(i));
                    sb.replace(i, i + 1, Character.toString(m));
                }
            }
            System.out.print(sb.charAt(i));
        }
    }
}
