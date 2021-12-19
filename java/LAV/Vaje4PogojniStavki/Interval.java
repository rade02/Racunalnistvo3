public class Interval {

	public static void main(String[] args) {
		
		int a = 10, b = 1;
		double x = 10.0;
		
		if(a > b){
		    int tmp = a;
		    a = b;
		    b = tmp;
		}
		
		if((x >= a) && (x <= b))
		    System.out.println(x + " LEZI na intervalu [" + a + ", " + b + "].");
		else
		    System.out.println(x + " NE LEZI na intervalu [" + a + ", " + b + "].");
		
	}

}
