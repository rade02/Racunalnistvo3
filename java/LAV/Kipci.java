package car;
import java.util.Scanner;

public class Kipci {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		int a = vhod.nextInt();
		int b = vhod.nextInt();
		int c = vhod.nextInt();
		
		if (a > b){
			if (b > c){
				System.out.println("Vzemi prvega in drugega.");
			}
			else{
				System.out.println("Vzemi prvega in tretjega.");
			}
		}
		else if (a < b){
			if (a > c){
				System.out.println("Vzemi drugega in prvega.");
			}
			else{
				System.out.println("Vzemi drugega in tretjega.");
			}
		}
		vhod.close();
	}

}
