package t1;

public class samoVelikeCrke {
    public static void main(String[] args){

        String s = new String("Danes je lep dan in jutri bo tudi lep dan.");
        String s2 = new String();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                s2 += Character.toUpperCase(s.charAt(i));
            }
            else{
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
