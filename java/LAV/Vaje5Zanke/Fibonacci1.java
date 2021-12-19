public class Fibonacci1{

     public static void main(String []args){
        
        int n = 1;
        int clenov = 20;
        int n1 = 1, n2;
        
        System.out.println("F0 = " + n);
        for(int i = 0; i < clenov; i++){
            n2 = n + n1;
            n = n1;
            n1 = n2;
            System.out.println("F" + (i+1) + " = " + n);
        }
        
     }
}
