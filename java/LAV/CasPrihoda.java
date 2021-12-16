package preverjanje1;
import java.util.Scanner;

public class CasPrihoda {

	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System.in);
	    System.out.println("Vnesi uro odhoda: ");
	    int ura = s.nextInt();
	    System.out.println("Vnesi minuto odhoda: ");
	    int min = s.nextInt();
	    System.out.println("Vnesi trajanje: ");
	    int trajanje = s.nextInt();
	    s.close();
	    
	    double minute = min + trajanje;
	    double ure = ura + minute%60;
	    minute %= 60;
	    
	    System.out.println("Prispe ob: " + ((ure < 10) ? ("0" + (int)ure):(int)ure) + ":" + ((min < 10) ? ("0" + (int)minute):(int)minute));
	    
	    }
		

}
