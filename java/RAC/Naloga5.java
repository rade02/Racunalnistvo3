import java.util.Scanner;

public class Naloga5 {

	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi stevilko meseca v letu: ");
		int mesec = vnos.nextInt();
		System.out.println("Vnesi leto: ");
		int leto = vnos.nextInt();
		int dni = 0;
		
		switch (mesec) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: dni = 31;break;
			case 4: case 6: case 9: case 11: dni = 30; break;
			case 2:
				if (((leto % 4 == 0) && !(leto % 100 == 0)) || (leto % 400 == 0)) {
					dni = 29;
				}
				else {
					dni = 28;
				};
				System.out.println("Mesec ima " + dni + " dni.");break;
			default: System.out.println("Ni mesec.");
		}
	}
}
