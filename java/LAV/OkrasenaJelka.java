public class OkrasenaJelka{

     public static void main(String []args){
        
        int n = 15;
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n - i; j++){ //prazni prostori na levi
                System.out.print('-');
            }
            
            for(int k = 0; k < 2*i + 1; k++){ //drevo
                if(k % 2 != 0)
                    System.out.print('o');
                else
                    System.out.print('*');
            }
            
            for(int l = 0; l < n - i; l++){ //prazni prostori na desni
                System.out.print('-');
            }
            
            System.out.println(); //v novo vrsto
        }
        
     }
}
