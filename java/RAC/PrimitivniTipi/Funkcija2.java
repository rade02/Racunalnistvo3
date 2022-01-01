public class Funkcija2 {

	public static void main(String[] args) {
		
		double y = 0;
		int ascii = (int)'A';
		
		for (double x = -4; x <= 4; x = x + 0.5) {
			if (x < -3) 
				y = -1.5 * x - 6;
			else if (x < -2)
				y = -1.5;
			else if (x < 0) 
				y = 1.5 * x + 1.5;
			else if (x < 1)
				y = -1.5 * x + 1.5;
			else if (x < 2)
				y = x - 1;
			else if (x < 3)
				y = 1;
			else
				y = -x + 4;
			
			System.out.print((char)ascii);
			System.out.format(" (%.1f", x);
			System.out.format(", %.1f)\n", y);
			
			ascii += 1;
		}

	}

}
