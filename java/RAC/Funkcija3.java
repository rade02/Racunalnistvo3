package Naloge;

public class Funkcija3 {

	public static void main(String[] args) {
		
		double y = 0;
		for (double x = -4; x <= 4; x = x + 0.5) {
			if ((x >= -4) && (x < -3)) {
				y = 0;
			}
			else if ((x >= -3) && (x < -2)) {
				y = -2 * x - 6;
			}
			else if ((x >= -2) && (x < 2)) {
				y = x;
			}
			else if ((x >= 2) && (x < 3)) {
				y = -2 * x + 6;
			}
			else
				y = 0;
			System.out.format("(%.1f, ", x);
			System.out.format("%.1f)\n", y);
		}
	}

}
