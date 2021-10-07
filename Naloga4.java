package Naloge;
import java.util.Scanner;

public class Naloga4 {

	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi znesek osnovne place: ");
		double osnovnaPlaca = vnos.nextDouble();
		
		//R - realizacija, N - norma, st - stimulacija
		System.out.println("Vnesi realizacijo norme v %: ");
		double R = (vnos.nextDouble()) / 100;
		int N = 1;
		double st = 0;
		
		if (R <= 0.8*N) {
			st = -0.5;
		}
		else {
			if (R <= 0.9*N) {
				st = -0.15;
				}
			else {
				if (R <= 1.1*N) {
					st = 0;
					}
				else {
					if (R <= 1.3*N) {
						st = 0.15;
						}
					else {
						st = 0.25;
					}
				}
			}
		}
		System.out.print("Stimulacija znasa " + st * 100 + " % osnovne place, kar je ");
		System.out.format("%.2f €.\n", st*osnovnaPlaca);
		
		double placa = osnovnaPlaca*(1 + st);
		System.out.format("Placa je %.2f €.", placa);
	}

}
