package Naloge;

public class Bisekcija2 {

	public static void main(String[] args) {
		
		double spMeja = 0;
		double zgMeja = Math.PI/2;
		double y = 1;
		double x;
		
		while(Math.abs(y) > Math.pow(10, -6)) {
			x = (spMeja + zgMeja) / 2;
			y = 2 * x - Math.cos(x) + Math.sin(2*x);
			if(y > 0)
				zgMeja = x;
			else
				spMeja = x;
			System.out.println(x + ", " + y);
		}
		
	}

}
