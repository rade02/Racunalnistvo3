import java.util.Scanner;

public class Naloga6 {

	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi crko kategorije vozila: ");
		char K = vnos.nextLine().charAt(0);
		vnos.close();
		
		switch (K) {
		case 'A': System.out.println("motorna kolesa");break;
		case 'B': System.out.println("motorna vozila z NDM < 3500 kg");break;
		case 'C': System.out.println("motorna vozila z NDM > 3500 kg");break;
		case 'D': System.out.println("motorna vozila za prevoz oseb");break;
		case 'E': System.out.println("motorna vozila s priklopnim vozilom");break;
		case 'F': System.out.println("traktorji in traktorski priklopniki");break;
		case 'G': System.out.println("delovni stroji in motokultivatorji");break;
		default: System.out.println("Napacen vnos kategorije vozila.");break;
		}
		
	}

}
