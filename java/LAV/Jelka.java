public class Jelka{

     public static void main(String []args){
        
        int n = 10;
        
        for(int i = 0; i < n; i++){ //za visino drevesa
            for(int j = 0; j < n - i; j++){ //za prazne prostore pred *, do sredine
                System.out.print('-');
            }
            for(int k = 0; k < 2*i + 1; k++){ //za *, stevilo njih je 2*i+1
                System.out.print('*');
            }
            for(int l = 0; l < n - i; l++){ //crte na desni strani drevesa
                System.out.print('-');
            }
            System.out.println(); //skok v novo vrsto
        }
        
     }
}
