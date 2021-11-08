public class VsotaSt8 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 100; i++) {
			int e = i % 10;
			int d = (i/10) % 10;
			int s = i/100;
			
			if(e + d + s == 8)
				System.out.println(i);
		}

	}

}
