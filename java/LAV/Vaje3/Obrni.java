public class Obrni {

	public static void main(String[] args) {
		
		int n = 2143;
		
		int e = (int)(n % 10);
		int d = (int)((n % 100) / 10);
		int s = (int)((n % 1000) / 100);
		int t = (int)((n % 10000) / 1000);
		
		System.out.println(e*1000 + d*100 + s*10 + t);
		
	}

}
