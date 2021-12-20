public class Sestnajsta{

     public static void main(String []args){
        
        int n = 129;
        
        for(int i = 2; i <= n; i++){
            boolean jePrastevilo = true;
            for(int j = 2; j <= Math.sqrt(i); j++){ //ali je i prastevilo
                if(i % j == 0)
                    jePrastevilo = false;
            }
            if((n % i == 0) && (jePrastevilo == true)){ //ce je i prastevilo in deli n
                System.out.print(i + " ");
                n /= i; //n postane n/i
                i = 2; //potrebno je ponastaviti i, da zanka zacne od zacetka (lahko imamo vec enakih prafaktorjev)
            }
            
        }
        
     }
}
