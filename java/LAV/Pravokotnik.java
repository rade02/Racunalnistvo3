package car;
import java.util.Scanner;

public class Pravokotnik {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		int x1 = 0;
		int y1 = 0;
		int x2 = 1919;
		int y2 = 1079;
		
		System.out.println("Vnesi absciso tocke: ");
		int x = vhod.nextInt();
		System.out.println("Vnesi ordintao tocke: ");
		int y = vhod.nextInt();
		
		if ((x > x1) && (x < x2) && (y > y1) && (y < y2)){
			System.out.println("Je znotraj pravokotnika.");
		}
		else if ((x == x1) || (x == x2) || (y == y1) || (y == y2)){
			System.out.println("Je na robu pravokotnika.");
		}
		else{
			System.out.println("Je zunaj pravokotnika.");
		}
		vhod.close();
	}
}
