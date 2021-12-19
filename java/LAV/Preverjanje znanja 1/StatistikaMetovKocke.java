public class StatistikaMetovKocke{

     public static void main(String []args){
        
        int enka = 0, dvojka = 0, trojka = 0, stirica = 0, petka = 0, sestica = 0;
        
        for(int i = 0; i < 1000; i++){
            int n = (int)(Math.random()*6+1);
            switch(n){
                case 1: enka++;break;
                case 2: dvojka++;break;
                case 3: trojka++; break;
                case 4: stirica++;break;
                case 5: petka++; break;
                case 6: sestica++; break;
            }
        }
        System.out.println(enka  + " " + dvojka + " " + trojka + " " + stirica + " " + petka + " " + sestica + " | " + (enka+dvojka+trojka+stirica+petka+sestica));
     }
}
