import java.util.Scanner;

public class Pretvorbamm {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi dolzino v mm: ");
		int milim = vhod.nextInt();
		
		int mm = milim;
		
		int m = (int)(mm / 1000);
		mm %= 1000;
		int dm = (int)(mm / 100);
		mm %= 100;
		int cm = (int)(mm / 10);
		mm %= 10;
		
		System.out.println(milim + " mm je enako " + m + " m " + dm + " dm " + cm + " cm " + mm + " mm.");
		vhod.close();
	}

}
