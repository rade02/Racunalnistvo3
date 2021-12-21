public class Osemnajsta{

     public static void main(String []args){
        
        int stevec = 1, n = 100, st = 2; //n-to prastevilo, st je prvo prastevilo
        
        while(stevec <= n){ //pregledamo vsa prastevila do n-tega
            boolean jePrastevilo = true;
            for(int i = 2; i <= Math.sqrt(st); i++){ //ali je st prastevilo
                if(st % i == 0){
                    jePrastevilo = false;
                    break;
                }
            }
            
            if(jePrastevilo == true){ //ce je prastevilo povecamo stevec
                if(stevec == n)
                    System.out.print(st);
                stevec++;
            }
            st++; //da z naslednjo iteracijo preverjamo novo stevilo
        }
        
     }
}
