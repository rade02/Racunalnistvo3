package LAVvajeZanke;

public class Petindvajseta {

	public static void main(String[] args) {
		
		int n = 1003;

		int e = n % 10;
		int d = (n % 100) - e;
		int s = (n % 1000) / 100;
		int t = (n % 10000) / 1000;
		
		int vsota = e + d + s + t;
		System.out.println(vsota);
	}

}
