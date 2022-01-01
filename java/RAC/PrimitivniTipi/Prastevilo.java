import java.util.Scanner;

public class Prastevilo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Vnesi celo stevilo: ");
		int st = s.nextInt();
		s.close();
		int j = 0;
		
		for(int i = 2; i <= Math.sqrt(st); i++) {
			if(st % i == 0) {
				if(j == 0) {
					System.out.print("Ni prastevilo");
					j++;
				}
				System.out.print(", deljivo z " + i);
			}
		}
		
		if(j == 0)
			System.out.println("Je prastevilo.");
		
	}

}
