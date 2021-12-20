public class Sestnajsta{

     public static void main(String []args){
        
        int n = 125;
        //System.out.println("1");
        for(int i = 2; i <= n; i++){ // prastevila do vkljucno n
            boolean jePrastevilo = true;
            for(int j = 2; j <= Math.sqrt(i); j++){ // ali je i prastevilo
                if(i % j == 0)
                    jePrastevilo = false;
            }
            if((jePrastevilo == true)&&(n % i == 0)){
                System.out.println(i);
                n /= i;
            }
        }
        
     }
}
