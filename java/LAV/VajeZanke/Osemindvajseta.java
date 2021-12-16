package LAVvajeZanke;

public class Osemindvajseta {

	public static void main(String[] args) {
		
		int a = 9999;
		int vsota = 10;
		
		while(vsota >= 10) {
		int e = a % 10;
		int d = (a % 100) / 10;
		int s = (a % 1000) / 100;
		int t = (a % 10000) / 1000;
		
		vsota = e + d + s + t;
		System.out.println(vsota);
		a = vsota;
		}
		
	}

}
