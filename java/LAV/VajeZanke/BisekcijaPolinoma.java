public class BisekcijaPolinoma{

     public static void main(String []args){
        //f(x) = x^3+(2x)^2+x-1
        double min = -0.5, max = 1;
        double y = 1, x = 0;
        
        while(Math.abs(y) > Math.pow(10,-5)){
            x = (min + max) / 2;
            y = Math.pow(x, 3) + Math.pow(2*x, 2) + x - 1;
            if(y > 0)
                max = x;
            else
                min = x;
        }
        System.out.print(x);
     }
}
