package car;

public class Interval2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		double x = 5;
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		if ((x >= min) && (x <= max)){
			System.out.println("X se nahaja na intervalu.");
		}
		else
			System.out.println("X se ne nahaja na intervalu.");

	}

}
