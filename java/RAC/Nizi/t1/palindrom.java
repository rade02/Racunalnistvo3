package t1;

public class palindrom {
    
    public static void main(String[] args){

        String s = "pericarezeracirep";
        boolean jePalindrom = true;

        for(int i = 0; i <= s.length()/2; i++){
            if(!(s.charAt(i) == s.charAt(s.length() - 1 - i))){
                jePalindrom = false;
                break;
            }
        }

        System.out.println((jePalindrom) ? ("je palindrom"):("ni palindrom"));
    }
}
