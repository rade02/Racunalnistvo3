public class Stirimestno {

	public static void main(String[] args) {
		
		int n = 2143;
		
		int e = (int)(n % 10);
		int d = (int)((n % 100) / 10);
		int s = (int)((n % 1000) / 100);
		int t = (int)((n % 10000) / 1000);
		
		int dk = (int)(Math.pow(d, 2) % 10);
		int sk = (int)(Math.pow(s, 2) % 10);
		
		System.out.println(e*1000 + sk*100 + dk*10 + t);
		
	}

}
