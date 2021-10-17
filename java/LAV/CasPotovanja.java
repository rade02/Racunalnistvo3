import java.util.Scanner;

public class CasPotovanja {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Vnesi uro odhoda: ");
		int uraOdhoda = vhod.nextInt();
		System.out.println("Vnesi minuto odhoda: ");
		int minutaOdhoda = vhod.nextInt();
		System.out.println("Vnesi uro prihoda: ");
		int uraPrihoda = vhod.nextInt();
		System.out.println("Vnesi minuto prihoda: ");
		int minutaPrihoda = vhod.nextInt();
		vhod.close();
		
		int ura = uraPrihoda - uraOdhoda;
		int minuta = minutaPrihoda - minutaOdhoda;
				
		if (minuta > 59) {				// ce je 60 minut ali vec, dodamo ure
			ura = ura + (minuta / 60);
			minuta %= 60;
		}		
				
		System.out.println("Cas potovanja je " + ura + " ur in " + minuta + " minut.");
	}

}
