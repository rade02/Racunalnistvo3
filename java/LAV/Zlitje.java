package nalogeLAV;
import java.util.Scanner;

public class Zlitje {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi dve trimestni stevili: ");
		int a = vhod.nextInt();
		int b = vhod.nextInt();
		vhod.close();
		
		if (((a >= 100) && (a <= 999) && (b >= 100) && (b <= 999))) {
			
			int ea = a % 10;
			a /= 10;
			
			int da = a % 10;
			a /= 10;
			
			int sa = a;
			
			int eb = b % 10;
			b /= 10;
			
			int db = b % 10;
			b /= 10;
			
			int sb = b;
			
			int zlitje = 100000 * sa + 10000 * sb + 1000 * da + 100 * db + 10 * ea + eb;
			
			System.out.println(zlitje);
		}
		else
			System.out.println("Napacen vnos");
	}

}
