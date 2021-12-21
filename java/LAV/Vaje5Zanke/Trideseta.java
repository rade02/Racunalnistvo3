public class Trideseta {

	public static void main(String[] args) {
		
	    double a = 1945391;
	    double b = 242184;
	    int natancnost = 4;
	    
	    double kolicnik = a / b;
	    kolicnik = Math.round(kolicnik * Math.pow(10, natancnost));
	    kolicnik = kolicnik * Math.pow(10, -natancnost);
	    System.out.println(kolicnik);
	    
	    double napaka = Math.abs(kolicnik - a / b);
	    System.out.println(napaka);
	}

}
