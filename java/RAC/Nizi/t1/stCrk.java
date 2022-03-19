package t1;

public class stCrk {
    
    public static void main(String[] args){

        String s = new String("Danes je lep dan in jutri bo tudi lep dan.");
        int stCrk = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                stCrk++;
            }
        }
        System.out.println("st. crk 'a' = " + stCrk);

    }
}
