public class Sedemindvajseta{

     public static void main(String []args){
        
        int n = 1434054, vsota = 0;
        
        while(n != 0){
            int a = n % 10;
            vsota += a;
            n /= 10;
        }
        
        System.out.println(vsota);
        
     }
}
