package car;
import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		int a = vhod.nextInt();
		int b = vhod.nextInt();
		double x = vhod.nextDouble();
		
		if (a > b){
			if ((x <= a) && (x >= b)){
				System.out.println("X lezi na intervalu.");
			}
			else {
				System.out.println("X ne lezi na intervalu.");
			}
		}
		else {
			if ((x <= b) && (x >= a)){
				System.out.println("X lezi na intervalu.");
			}
			else {
				System.out.println("X ne lezi na intervalu.");
			}
		}
		vhod.close();
	}

}
