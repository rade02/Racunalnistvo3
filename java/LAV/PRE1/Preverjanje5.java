import java.util.Scanner;

public class Preverjanje5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double stopinje = s.nextDouble();
		s.close();
		
		if((stopinje > 337.25) || (stopinje <= 22.5))
			System.out.println("sever");
		else if((stopinje <= 337.25) && (stopinje > 292.5))
			System.out.println("severozahod");
		else if((stopinje <= 292.5) && (stopinje > 247.5))
			System.out.println("zahod");
		else if((stopinje <= 247.5) && (stopinje > 202.5))
			System.out.println("jugozahod");
		else if((stopinje <= 202.5) && (stopinje > 157.5))
			System.out.println("jug");
		else if((stopinje <= 157.5) && (stopinje > 112.5))
			System.out.println("jugovzhod");
		else if((stopinje <= 112.5) && (stopinje > 67.5))
			System.out.println("vzhod");
		else if((stopinje <= 67.5) && (stopinje > 22.5))
			System.out.println("severovzhod");
	}

}
