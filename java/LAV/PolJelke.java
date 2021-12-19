public class PolJelke{

     public static void main(String []args){
        
        int n = 3, m = 50;
        
        for(int a = 0; a < n; a++){
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    if(j <= i)
                        System.out.print('*');
                }
                System.out.println();
            }
            System.out.println();
        }
        
        
     }
}
