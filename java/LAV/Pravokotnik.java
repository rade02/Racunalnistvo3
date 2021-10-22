import java.util.Scanner;

public class Pravokotnik {

	public static void main(String[] args) {
		
		int x1 = 0;
		int y1 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Doloci velikost pravokotnika. \nAbscisa tocke: ");
		int x2 = s.nextInt();
		System.out.println("Ordinata tocke: ");
		int y2 = s.nextInt();
		s.nextLine();
		System.out.println("Ce zelis sam vnesti tocko vnesi 'V', ce zelis nakljucno generiranje tocke vnesi 'N': ");
		char nacin = s.nextLine().charAt(0);
		
		if (nacin == ('V' | 'v')) {
			System.out.println("Vnesi absciso tocke: ");
			int x = s.nextInt();
			System.out.println("Vnesi ordinato tocke: ");
			int y = s.nextInt();
			
			if ((x > x1) && (x < x2) && (y > y1) && (y < y2))
				System.out.println("Tocka (" + x + ", " + y + ") je znotraj pravokotnika.");
			else if (((x == x1) && (y < y2) || (x == x2) && (y < y2) || (y == y1) && (x < x2) || (y == y2) && (x < x2)))
					System.out.println("Tocka (" + x + ", " + y + ") je na robu pravokotnika.");
			else
				System.out.println("Tocka (" + x + ", " + y + ") je izven pravokotnika.");
		}
		else if (nacin == ('N' | 'n')) {
			System.out.println("Vnesi kolikokrat zelis generirati stevilo: ");
			int n = s.nextInt();
			int i = 0;
			
			while (i <= n) {
			int x = (int)(Math.floor(Math.random() * 101));
			int y = (int)(Math.floor(Math.random() * 101));
		
			if ((x > x1) && (x < x2) && (y > y1) && (y < y2))
				System.out.println("Tocka (" + x + ", " + y + ") je znotraj pravokotnika.");
			else if (((x == x1) || (x == x2) || (y == y1) || (y == y2)))
					System.out.println("Tocka (" + x + ", " + y + ") je na robu pravokotnika.");
			else
				System.out.println("Tocka (" + x + ", " + y + ") je izven pravokotnika.");
			
			i++;
			}
		}
		s.close();
	}

}
