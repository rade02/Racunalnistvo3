public class Dvajseta{

     public static void main(String []args){
        
        int n = 200;
        boolean jePrastevilo = false;
        
        while(jePrastevilo == false){
            n++;
            jePrastevilo = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0)
                    jePrastevilo = false;
            }
        }
        System.out.print(n);
     }
}
