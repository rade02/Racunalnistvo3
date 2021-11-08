import java.util.Scanner;

public class Preverjanje10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Vnesi dan: ");
		int d = s.nextInt();
		System.out.println("Vnesi mesec: ");
		int m = s.nextInt();
		String lc = "";
		s.close();
		
		if(d < 21) {
			switch(m) {
			case 1: case 2: case 3: lc = "zima";break;
			case 4: case 5: case 6: lc = "pomlad";break;
			case 7: case 8: case 9: lc = "poletje";break;
			case 10: case 11: case 12: lc = "jesen";break;
			}
		}
		else {
			switch(m) {
			case 12: case 1: case 2: lc = "zima";break;
			case 3: case 4: case 5: lc = "pomlad";break;
			case 6: case 7: case 8: lc = "poletje";break;
			case 9: case 10: case 11: lc = "jesen";break;
			}
		}
		System.out.println("Trenutni čas je " + lc + ".");		

	}

}
