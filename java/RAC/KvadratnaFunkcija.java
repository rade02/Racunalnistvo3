import java.util.Scanner;

public class KvadratnaFunkcija {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Vnesi zacetek intervala za izpis tock (celo stevilo): ");
		int zac = vhod.nextInt();
		System.out.println("Vnesi konec intervala za izpis tock (celo stevilo): ");
		int kon = vhod.nextInt();
		
		int ascii = (int)'A';
		double y = 0;
		for (double i = zac; i <= kon; i++) {
			if (i <= -3) {
				y = Math.pow(i, 2);
			}
			else if ((i > -3) && (i <= 1)) {
				y = 1.5;
			}
			else if ((i > 1) && (i <= 5)) {
				y = Math.pow(i, -0.5);
			}
			else
				y = Math.log(i);
			
			System.out.print((char)ascii);
			System.out.format("(%.1f, ", i);
			System.out.format("%.1f)\n", y);
			
			ascii += 1;
		}
		vhod.close();
	}

}
