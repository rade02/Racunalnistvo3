package t1;

public class sodiElementi {
    public static void main(String[] args){

        String s = new String("Danes je lep dan in jutri bo tudi lep dan.");

        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                System.out.print(s.charAt(i));
            }
        }
    }
}
