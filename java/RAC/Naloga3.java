import java.util.Scanner;

public class Naloga3 {

	public static void main(String[] args) {
		
		System.out.println("Vnesi dolzine treh stranic trikotnika: ");
		
		Scanner vhod = new Scanner (System.in);
		int a = vhod.nextInt();
		int b = vhod.nextInt();
		int c = vhod.nextInt();
		vhod.close();
		
		if ((a + b > c) && (a + c > b) && (b + c > a)){
		
				double s = 1.0/2*(a + b + c);
				double p = Math.sqrt(s*(s-a)*(s-b)*(s-c));
				System.out.format("Trikotnik obstaja, ploscina je %.2f", p);}
		
		else {
			if ((a + b == c) || (a + c == b) || (b + c == a))
				System.out.println("Trikotnik je izrojen.");
			
			else
				System.out.println("Trikotnik ne obstaja.");}
	}

}
