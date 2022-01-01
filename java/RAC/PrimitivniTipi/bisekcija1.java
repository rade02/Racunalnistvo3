package Naloge;

public class bisekcija1 {

	public static void main(String[] args) {
		
		double spMeja = 0;
		double zgMeja = Math.PI/2;
		double y = 1;
		double x;
		
		while(Math.abs(y) > Math.pow(10, -6)) {
			x = (spMeja + zgMeja) / 2;
			y = x - Math.cos(x);
			if(y > 0)
				zgMeja = x;
			else
				spMeja = x;
			System.out.format("x = %.9f, y = ", x);
			System.out.format("%.9f\n", y);
		}

	}

}
