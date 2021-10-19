import java.util.Scanner;

public class vajaDvaDva {
	
	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi celo število: ");
		int x = vhod.nextInt();
		
		
		int vrstic = x;
		String y = "*";
		
		for (int i = 1; i <= vrstic; i++) {
			System.out.println(y.repeat(x));
		}
		vhod.close();
	}
}
