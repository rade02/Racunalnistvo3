import java.util.Scanner;

public class CasPrihoda {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Vnesi uro odhoda: ");
		int uraOdhoda = vhod.nextInt();
		System.out.println("Vnesi minuto odhoda: ");
		int minutaOdhoda = vhod.nextInt();
		System.out.println("Vnesi uro casa potovanja: ");
		int uraPotovanja = vhod.nextInt();
		System.out.println("Vnesi minuto casa potovanja: ");
		int minutaPotovanja = vhod.nextInt();
		vhod.close();
		
		int uraPrihoda = uraOdhoda + uraPotovanja;
		int minutaPrihoda = minutaOdhoda + minutaPotovanja;
		
		if (minutaPrihoda > 59) {
			uraPrihoda = uraPrihoda + (minutaPrihoda / 60);
			minutaPrihoda %= 60;
		}
		if (uraPrihoda > 23) {
			uraPrihoda %= 24;
		}
		
		System.out.println("Cas prihoda je ob " + uraPrihoda + " uri in " + minutaPrihoda + " minuti.");
	}
}
