package nalogeLAV;
import java.util.Scanner;

public class VsotaStevk {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi celo stirimestno stevilo: ");
		int a = vhod.nextInt();
		vhod.close();
		if ((a >= 1000) && (a <= 9999)) {
			int e = a % 10;
			a /= 10;
			
			int d = a % 10;
			a /= 10;
			
			int s = a % 10;
			a /= 10;
			
			int t = a;
			
			int vsota = e + d + s + t;
			System.out.println("Vsota stevk je " + vsota + ".");
		}
		else
			System.out.println("Napacen vnos");
	}

}
