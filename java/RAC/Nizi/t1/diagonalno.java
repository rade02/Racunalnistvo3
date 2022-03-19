package t1;

public class diagonalno {
    
    public static void main(String[] args){

        String s = "lepa beseda";
        int presledek = 0;

        for(int i = 0; i < s.length(); i++){

            for(int j = 0; j < presledek; j++){
                System.out.print(" ");
            }
            System.out.println(s.charAt(i));
            presledek++;
        }
    }

}
