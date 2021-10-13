import java.util.Scanner;

public class Naloga7 {

	public static void main(String[] args) {

		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi kategorijo vozila za cestninjenje: ");
		String K = vnos.nextLine();
		vnos.close();
		int cena = 0;
		
		switch(K) {
		case "C1": case "D": case "C1E": cena = 14; 
		System.out.println("Vrednost cestnine je " + cena + " €.");break;
		case "C": case "CE": case "DE": cena = 19;
		System.out.println("Vrednost cestnine je " + cena + " €.");break;
		case "A": case "B":
		System.out.println("Vrednost cestnine je " + cena + " €.");break;
		default:System.out.println("Napacen vnos kategorije.");break;
		}
	}

}
