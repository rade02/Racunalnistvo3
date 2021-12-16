package LAVvajeZanke;
import java.util.Scanner;

public class Sestnajsta {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Vnesi pozitivno celo stevilo: ");
		int a = s.nextInt();
		s.close();
		int[] tab = new int[1000];
		int z = 0;
		
		for(int i = 0; i < tab.length; i++) {
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0)
					continue;
				else {
					tab[z] = i;
					z++;
				}
			}
			
		}
		
		for(int k = z; k >= 0; k--) {
			if(a % tab[k] == 0) {
				System.out.println(tab[k]);
			}
		}
		

	}

}
