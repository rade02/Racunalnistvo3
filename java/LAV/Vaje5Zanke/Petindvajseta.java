public class Petindvajseta{

     public static void main(String []args){
        
        int n = 12305, vsota = 0;
        
        while(n > 0){
            int a = n % 10;
            vsota += a;
            n /= 10;
        }
        System.out.println(vsota);
        
     }
}
