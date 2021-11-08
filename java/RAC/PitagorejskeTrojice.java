package Naloge;

public class PitagorejskeTrojice {

	public static void main(String[] args) {
		
		for(int a = 0; a <= 1000; a++) {
			for(int b = 0; b <= 1000; b++) {
				double c = Math.sqrt(a*a + b*b);
				if((c % 1 == 0) && (a + b > c))
					System.out.println(a + ", " + b + ", " + (int)c);
			}
		}

	}

}
