import java.util.Scanner;

public class Naloga1 {
	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi diagonalo TV v incih: ");
		int inch = vnos.nextInt();
		
		double d = inch * 2.54;
		
		int m = (int)(d / 100);
		int dm = (int)((d % 100)/10);
		int cm = (int)(d % 10);
		int mm = (int)(Math.round((d % 1) * 10)); //zaokrozimo
		
		System.out.println(m + "m " + dm + "dm " + cm + "cm " + mm + "mm");
	}
}
