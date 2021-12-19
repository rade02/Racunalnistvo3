public class Blok{

     public static void main(String []args){
        
        int d = 52, v = 35;
        
        for(int i = 0; i < v; i++){
            for(int j = 0; j < d; j++){
                if((i % 2 == 0) || (i == v-1))
                    System.out.print('-');
                else if(j % 3 == 0)
                    System.out.print('|');
                    else
                        System.out.print('O');
            }
            System.out.println();
        }
        
     }
}
