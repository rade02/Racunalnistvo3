public class Sedemnajsta{

     public static void main(String []args){
        
        int stevec = 0, n = 2;
        
        while(stevec < 100){
            boolean jePrastevilo = true;
            for(int i = 2; i <= Math.sqrt(n); i++){ //ali je n prastevilo (zacnemo z 2, da se zanka lahko ujame v pogoj)
                if(n % i == 0){
                    jePrastevilo = false;
                    break;
                }
            }
            
            if(jePrastevilo == true){ //ce je prastevilo, ga izpisemo in povecamo stevec
                System.out.print(n + " ");
                stevec++;
            }
            n++;
        }
     }
}
