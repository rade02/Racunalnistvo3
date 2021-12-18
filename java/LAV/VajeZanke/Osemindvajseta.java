public class Osemindvajseta{

     public static void main(String []args){
        
        int n = 999999;
        int vsota = 10;
        
        while(vsota >= 10){
            int e = (int)(n % 10);
            int d = (int)((n % 100) / 10);
            int s = (int)((n % 1000) / 100);
            int t = (int)((n % 10000) / 1000);
            int dt = (int)((n % 100000) / 10000);
            int st = (int)((n % 1000000) / 100000);
            int m = (int)((n % 10000000) / 1000000);
            
            vsota = e + d + s + t + dt + st + m;
            n = vsota;
            System.out.println(vsota);
        }
     }
}
