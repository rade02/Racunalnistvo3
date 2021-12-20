public class Devetnajsta{

     public static void main(String []args){
        
        int n = 130;
        
        for(int i = 2; i <= n; i++){
            boolean jePrastevilo = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0)
                    jePrastevilo = false;
            }
            
            if(jePrastevilo == true)
                System.out.print(i + " ");
        }
        
     }
}
