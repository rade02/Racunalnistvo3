public class Dvaindvajseta {

     public static void main(String []args){
        
        int osnova = 5, eksponent = 4, i = 1, rezultat = 1;
        
        while(i <= eksponent){
            rezultat *= osnova;
            i++;
        }
        System.out.println(rezultat);
     }
}
