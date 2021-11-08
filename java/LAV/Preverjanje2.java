package nalogeLAV;
import java.util.Scanner;

public class Preverjanje2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ocena = s.nextInt();
		s.close();
		
		switch(ocena) {
		case 1: System.out.println("nezadostno");break;
		case 2: System.out.println("zadostno");break;
		case 3: System.out.println("dobro");break;
		case 4: System.out.println("prav dobro");break;
		case 5: System.out.println("odlicno");break;
		default: System.out.println("Napacna ocena");break;
		}
		

	}

}
