import java.util.Scanner;

public class LeibnizevaEnacba {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Program izracuna število pi po Leibnizevi enacbi (pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 ...). \nNatancnost je odvisna od stevila clenov. Vnesi stevilo clenov: ");
		long clenov = s.nextLong();
		s.close();
		
		double c = 0;
		double predznak = 1;
		double im = 1;
		
		for(int i = 1; i <= clenov; i++) {
			if(i % 2 == 0) {
				predznak = -1;
			}
			else
				predznak = 1;
			c = c + (predznak * 1/im);
			im = im + 2;
		}
		System.out.println("Stevilo je enako: " + 4*c);
	}

}
