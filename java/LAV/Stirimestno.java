package car;
import java.util.Scanner;

public class Stirimestno {

	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		
		int x = vnos.nextInt();
		int zmesano = 0;
		
		
		int e = x % 10;
		e *= 1000;
		x /= 10;
		
		int d = x % 10;
		d = (d*d) % 10;
		x /= 10;
		
		int s = x % 10;
		s = (s*s) % 10;
		s *= 10;
		x /= 10;
		
		int t = x;
		
		
		zmesano = e + d + s + t;
		System.out.println(zmesano);
		
		
	}

}
