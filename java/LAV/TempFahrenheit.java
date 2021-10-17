package nalogeLAV;
import java.util.Scanner;

public class TempFahrenheit {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Program pretvarja med stopinjami Celzija in Fahrenheita.\nVneseni podatki bodo v (C|F): ");
		
		char vnos = vhod.nextLine().charAt(0);
		vhod.close();
		System.out.println("Vnesi temperaturo: ");
		
		switch (vnos){
		case 'c' | 'C': 
			double celzij = vhod.nextDouble();
			double fahrenheit = celzij * 1.8 + 32;
			System.out.format("%.1f stopinj Celzija je enako ", celzij);
			System.out.format("%.1f stopinj Fahrenheita.", fahrenheit);break;
		case 'f' | 'F':
			double fahrenheit2 = vhod.nextDouble();
			double celzij2 = (fahrenheit2 - 32) / 1.8;
			System.out.format("%.1f stopinj Fahrenheita je enako ", fahrenheit2);
			System.out.format("%.1f stopinj Celzija.", celzij2);break;
		default: System.out.println("Napacen vnos");
		}
	}

}
