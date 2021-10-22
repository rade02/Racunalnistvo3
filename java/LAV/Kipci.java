package nalogeLAV;
import java.util.Scanner;

public class Kipci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vnesi vrednost prvega: ");
		float a = s.nextFloat();
		System.out.println("Vnesi vrednost drugega: ");
		float b = s.nextFloat();
		System.out.println("Vnesi vrednost tretjega: ");
		float c = s.nextFloat();
		
		if ((a > b) && (a > c)) {
			if (b > c)
				System.out.println("Vzemi prvega in drugega.");
			else
				System.out.println("Vzemi prvega in tretjega.");
		}
		else if ((b > a) && (b > c)){
			if (a > c)
				System.out.println("Vzemi drugega in prvega.");
			else
				System.out.println("Vzemi drugega in tretjega.");
		}
		else if ((c > a) && (c > b)){
			if (a > b)
				System.out.println("Vzemi tretjega in prvega.");
			else
				System.out.println("Vzemi tretjega in drugega.");
		}
		else
			System.out.println("Vzemi katerakoli.");
		s.close();
	}

}
