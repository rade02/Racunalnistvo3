public class Funkcija{

     public static void main(String []args){
        
        double sp = -2*Math.PI;
        double zg = 2*Math.PI;
        double korak = Math.PI/3;
        double dolzina = Math.abs(sp) + Math.abs(zg);
        int elementov =(int)(dolzina / korak + 1);
        
        double tab[] = new double[elementov];
        int i = 0;
        
        for(double x = sp; x <= zg; x += korak){
            double y = (Math.round((2 * Math.sin(3*x+Math.PI/3))*Math.pow(10,3)))/Math.pow(10, 3);
            tab[i] = y;
            i++;
        }
        
        double x = -2;
        for(int j = 0; j < tab.length; j++){
            System.out.println("(" + (Math.round(x*Math.pow(10, 3))/Math.pow(10, 3)) + ", " + tab[j] + ")");
            x += korak;
        }
     }
}
