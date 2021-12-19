public class Jelka{

     public static void main(String []args){
        
        int n = 10;
        
        
        for(int i = 0; i < n; i++){ //za visino smreke
            for(int j = 0; j < n - i; j++){ //za prazne prostore pred *, do sredine
                System.out.print('-');
            }
            for(int k = 0; k < 2*i + 1; k++){ //za *, stevilo njih je 2*i+1
                System.out.print('*');
            }    
            //crte na desni strani smreke
            for(int l = 0; l < n - i; l++){
                System.out.print('-');
            }
            //v novo vrsto
            System.out.println();
        }
        
     }
}
