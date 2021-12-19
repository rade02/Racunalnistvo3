package LAVvajeZanke;
import java.util.Scanner;

public class Petnajsta {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Vnesi pozitivno celo stevilo: ");
		int n = s.nextInt();
		s.close();
		boolean jePrastevilo = true;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				jePrastevilo = false;
		}
		
		if(jePrastevilo == true)
			System.out.println("Je prastevilo");
		else
			System.out.println("Ni prastevilo");
	}

}
