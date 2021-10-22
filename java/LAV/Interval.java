package nalogeLAV;
import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vnesi prvo krajisce intervala: ");
		int a = s.nextInt();
		System.out.println("Vnesi drugo krajisce intervala: ");
		int b = s.nextInt();
		System.out.println("Vnesi realno stevilo za preverjanje: ");
		double x = s.nextDouble();
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		if ((x <= max) && (x >= min))
			System.out.println(x + " lezi na intervalu [" + min + ", " + max + "]");
		else
			System.out.println(x + " ne lezi na intervalu [" + min + ", " + max + "]");
		
		s.close();
	}	

}
