public class SahTrdnjava{

     public static void main(String []args){
        
        int n = 8; //obseg polja
        int ty = 5; //pozicija trdnajve y
        int tx = 4; //pozicija trdnjave x
        
        for(int y = 1; y <= n; y++){ // navpicno polje
            for(int x = 1; x <= n; x++){ //vodoravno polje
                if((y == ty)&&(x == tx)) //pozicija trdnjave
                    System.out.print('T');
                        else if(y == ty) //vodoravni doseg
                            System.out.print('-');
                            else if(x == tx) //navpicni doseg
                                System.out.print("|");
                            else if((x + y) % 2 == 0)
                                    System.out.print('B');
                                    else
                                        System.out.print('C'); //prazna crna polja
            }
            System.out.println();
        }
        
     }
}
