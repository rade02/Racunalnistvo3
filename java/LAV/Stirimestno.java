package nalogeLAV;
import java.util.Scanner;

public class Stirimestno {

	public static void main(String[] args) {
		
		System.out.println("Vnesi stirimestno stevilo: ");
		Scanner vhod = new Scanner(System.in);
		
		int a = vhod.nextInt();
		vhod.close();
		
		if ((a >= 1000) && (a <= 9999)) {
			
			int e = a % 10;
			a /= 10;
		
			int d = a % 10;
			a /= 10;
		
			int s = a % 10;
			a /= 10;
		
			int t = a;
		
			int d2 = (int)(Math.pow(d, 2) % 10);
			int s2 = (int)(Math.pow(s, 2)% 10);
		
			int stirimestno = 1000 * e + 100 * s2 + 10 * d2 + t;
			System.out.println(stirimestno);
		}
		else
			System.out.println("Napacen vnos");
		
	}

}
