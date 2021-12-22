public class Starost{

     public static void main(String []args){
        
        int leto = 2021;
        int rojstvo = 2000;
        int rojstniDan = 0, mesec = 0;
        int stPrestopnih = 0;
        
        for(int i = rojstvo; i <= leto; i++){
            
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
                rojstniDan = 29;
                stPrestopnih++;
            }
            else{
                rojstniDan = 1;
            }
            
        }
        
        System.out.println("Leta " + leto + " bo praznovala " + ((rojstniDan == 29)?(rojstniDan + ". februarja."):(rojstniDan + ". marca.")) + ", njena prava starost je " + stPrestopnih);
     }
}
