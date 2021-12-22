public class Fibonaccijevo{

     public static void main(String []args){
        
        int n = 10;
        int i = 0;
        
        int vsota = 0;
        int clen = 0, clen2 = 1;
        
        while(i < n){
            int tmp = clen;
            clen = clen2; //drugi clen postane prvi
            clen2 = tmp + clen2; //vsota clenov je nov drugi clen
            vsota += clen; //vsota je sestevek vseh clenov
            i++;
        }
        System.out.println(vsota);
        
     }
}
