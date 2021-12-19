public class Fibonacci2{

     public static void main(String []args){
        
        int n = 1;
        int stevilo = 10946;
        int clenov = 0;
        int n1 = 1, n2;
        
        while(n != stevilo){
            n2 = n + n1;
            n = n1;
            n1 = n2;
            clenov++;
        }
        System.out.print("F" + clenov + " = " + stevilo);
     }
}
