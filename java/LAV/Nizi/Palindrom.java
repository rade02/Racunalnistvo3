public class Palindrom {
    public static void main(String[] args){

        String niz = "pericarezeracirep";

        /*//z zanko:
        boolean jePalindrom = true;

        for(int i = 0; i < niz.length()/2; i++){
            if(niz.charAt(i) != niz.charAt(niz.length() - 1 - i)){
                jePalindrom = false;
                break;
            }
        }

        System.out.println((jePalindrom) ? (niz.concat(" je palindrom.")) : (niz.concat(" ni palindrom.")));
        */

        //brez zanke (StringBuffer):
        StringBuffer sb = new StringBuffer(niz);
        StringBuffer nizObr = sb.reverse();
        String nizObrnjen = nizObr.toString();

        System.out.println((niz.equals(nizObrnjen)) ? (niz.concat(" je palindrom.")) : (niz.concat(" ni palindrom.")));
        
    }
}
