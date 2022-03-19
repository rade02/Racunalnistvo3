package t1;

public class izbrisPreInLoc {
    
    public static void main(String[] args){

        String s = new String("Danes je lep dan, jutri bo tudi lep dan.");
        String s2 = new String();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                s2 += s.charAt(i);
            }
        }

        System.out.println(s2);
    }
}
