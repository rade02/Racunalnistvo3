package Naloge;

public class Funkcija1 {

	public static void main(String[] args) {
		
		double y = 0;
		int ascii = (int)'A';
		
		for (double x = -2; x <= 2; x = x + 0.5) {
			if (x < -1)
				y = -x - 2;
			else if ((x >= -1) && (x < 1))
				y = x;
			else if (x >= 1)
				y = -x + 2;
			System.out.print((char)ascii);
			System.out.format(" (%.1f", x);
			System.out.format(", %.1f)\n", y);
			ascii += 1;
		}

	}

}
