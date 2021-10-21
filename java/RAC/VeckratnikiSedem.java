package Naloge;
import java.util.Scanner;

public class VeckratnikiSedem {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vnesi spodnjo mejo: ");
		int z = s.nextInt();
		System.out.println("Vnesi zgornjo mejo: ");
		int k = s.nextInt();
		System.out.println("Vnesi veckratnik: ");
		int v = s.nextInt();
		int i = z;
		s.close();
		
		do {
			if (i % v == 0)
				System.out.println("veckratnik = " + i);
			i++;
		}
		while (i <= k);
			
	}

}
