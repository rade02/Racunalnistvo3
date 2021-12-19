import java.util.Scanner;
public class CasPrihoda{

     public static void main(String []args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Vnesi uro odhoda: ");
        int ura = s.nextInt();
        System.out.println("Vnesi minuto odhoda: ");
        int min = s.nextInt();
        System.out.println("Vnesi trajanje v min: ");
        int trajanje = s.nextInt();
        s.close();
        
        int skMin = min + trajanje; //najprej sestejemo minute
        int skUre = ura + skMin / 60; //uri pristejemo polne ure minut
        skMin = skMin % 60; //minutam odstranimo ure
        
        System.out.print("Cas prihoda: " + ((skUre < 10)?("0" + skUre):skUre) + ":" + ((skMin < 10)?("0" + skMin):skMin));
     }
}
