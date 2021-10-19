import java.util.Scanner;

public class Obrni {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi stirimestno celo stevilo: ");
		int a = vhod.nextInt();
		
		if ((a >= 1000) && (a <= 9999)) {
			int e = a % 10;
			a /= 10;
		
			int d = a % 10;
			a /= 10;
		
			int s = a % 10;
			a /= 10;
		
			int t = a;
		
			int obrnjeno = e * 1000 + d * 100 + s * 10 + t;
			System.out.println(obrnjeno);
		}
		else
			System.out.println("Napacen vnos");
		vhod.close();
	}

}
