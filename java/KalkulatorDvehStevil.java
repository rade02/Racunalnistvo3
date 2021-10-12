package nalogeLAV;
import java.util.Scanner;

public class KalkulatorDvehStevil {

	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi C za racunanje s celimi stevili in D za racunanje z decimalnimi: ");
		char tip = vnos.nextLine().charAt(0);
		
		switch (tip) {
		case 'C':
			System.out.println("Vnesi prvo celo stevilo: ");
			int a = vnos.nextInt();
			System.out.println("Vnesi drugo celo stevilo: ");
			int b = vnos.nextInt();
			System.out.println("Vnesi znak za operacijo med vnesenima steviloma (+, -, *, /, %, & za bitni 'in', | za bitni 'ali', ^ za bitni 'ekskluzivni ali'): ");
			vnos.nextLine();
			char operacija = vnos.nextLine().charAt(0);
			
			switch(operacija) {
			case '+': {int rezultat = a + b; System.out.println(rezultat);break;}	//uporabimo {}, da ni napake s podvojeno spremenljivko rezultat
			case '-': {int rezultat = a - b;System.out.println(rezultat);break;}
			case '*': {int rezultat = a * b;System.out.println(rezultat);break;}
			case '/': {int rezultat = a / b;System.out.println(rezultat);break;}
			case '%': {int rezultat = a % b;System.out.println(rezultat);break;}
			case '&': {int rezultat = a & b;System.out.println(rezultat);break;}
			case '|': {int rezultat = a | b;System.out.println(rezultat);break;}
			case '^': {int rezultat = a ^ b;System.out.println(rezultat);break;}
			default: System.out.println("Napacen vnos");break;
			};break;
		case 'D':
			System.out.println("Vnesi prvo stevilo: ");
			double c = vnos.nextDouble();
			System.out.println("Vnesi drugo stevilo: ");
			double d = vnos.nextDouble();
			System.out.println("Vnesi znak za operacijo med vnesenima steviloma (+, -, *, /): ");
			vnos.nextLine();
			char operacija2 = vnos.nextLine().charAt(0);
			
			switch(operacija2) {
			case '+': {double rezultat2 = c + d; System.out.format("%.2f", rezultat2);;break;}	//uporabimo {}, da ni napake s podvojeno spremenljivko rezultat2
			case '-': {double rezultat2 = c - d; System.out.format("%.2f", rezultat2);;break;}
			case '*': {double rezultat2 = c * d; System.out.format("%.2f", rezultat2);;break;}
			case '/': {double rezultat2 = c / d; System.out.format("%.2f", rezultat2);;break;}
			default: System.out.println("Napacen vnos");break;
			};break;
		default: System.out.println("Napacen vnos");break;
		}

	}

}
