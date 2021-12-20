public class DesnaTrikotnikaIzZvezdic{

     public static void main(String []args){
        
        int n = 10;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j >= i)
                    System.out.print('*');
                else
                    System.out.print('-');
            }
            System.out.println();
        }
        for(int k = 0; k < n; k++){
            for(int l = 0; l < n; l++){
                if(k + l >= n-1)
                    System.out.print('*');
                else
                    System.out.print('-');
            }
            System.out.println();
        }
     }
}
