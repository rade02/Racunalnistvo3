package Naloge;
import java.util.Random;

public class DesetNakljSt {

	public static void main(String[] args) {
		
		Random naklj = new Random();
		int a, max = 0, min = 200;
		
		for(int i = 0; i < 10; i++) {
			a = naklj.nextInt(200 + 1);
			if(a > max)
				max = a;
			if(a < min)
				min = a;
			System.out.print(a + ", ");
		}
		System.out.println("\nnajvecje stevilo je  " + max + ", najmanjse stevilo pa  " + min + ".");

	}

}
