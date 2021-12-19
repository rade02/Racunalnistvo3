public class VsotaStevk {

	public static void main(String[] args) {
		
		int n = 1234;
		
		int e = (int)(n % 10);
		int d = (int)((n % 100) / 10);
		int s = (int)((n % 1000) / 100);
		int t = (int)(n / 1000);
		
		int vsota = e + d + s + t;
		
		System.out.println(vsota);
	}

}
