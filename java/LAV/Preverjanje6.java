package nalogeLAV;
import java.util.Scanner;

public class Preverjanje6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = 0;
		int y2 = 0;
		int x3 = 10;
		int y3 = 10;
		s.close();
		if((x1 == x2) || (x1 == x3) || (y1 == y2) || (y1 == y3))
			System.out.println("Tocka lezi na stranici pravokotnika");
		else if((x1 > x2) && (x1 < x3) && (y1 > y2) && (y1 < y3))
			System.out.println("Tocka lezi v pravokotniku");
		else
			System.out.println("Tocka lezi zunaj pravokotnika");

	}

}
