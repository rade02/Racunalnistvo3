public class PovpLihaSt {

	public static void main(String[] args) {
		
		int i = 0;
		int vsota = 0;
		double povprecje = 0;
		while (i <= 30) {
			if (i % 2 == 1)
				vsota += i;
			i++;
		}
		povprecje = vsota / 30;
		System.out.println(povprecje);

	}

}
