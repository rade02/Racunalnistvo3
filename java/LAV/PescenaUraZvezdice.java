public class PescenaUraZvezdice{

     public static void main(String []args){
        
        int n = 5;
        /* Izpis:
            -***********-
            --*********--
            ---*******---
            ----*****----
            -----***-----
            ------*------
            ------*------
            -----***-----
            ----*****----
            ---*******---
            --*********--
            -***********-
        */
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){ //- levo od *
                if(j <= i)
                    System.out.print('-');
            }
            for(int k = n; k > 0; k--){ //* padajoce
                if(k < n)
                    System.out.print('*');
            }
            /*for(int l = 0; l < n; l++){
                
                    System.out.print('-');
            }*/
            System.out.println();
        }
     }
}
