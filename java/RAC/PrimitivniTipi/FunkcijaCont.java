import java.util.Scanner;

public class FunkcijaCont {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vnesi najmanjso vrednost intervala: ");
		int z = s.nextInt();
		System.out.println("Vnesi najvecjo vrednost intervala: ");
		int n = s.nextInt();
		double y = 0;
		s.close();
		
		for (double i = z; i <= n; i = i + 0.1) {
			if (i == -2)
				continue;
			else
				y = 1/(i + 2);
			
			System.out.format("(%.1f, ", i);
			System.out.format("%.1f)%n", y);
		}
	}

}
