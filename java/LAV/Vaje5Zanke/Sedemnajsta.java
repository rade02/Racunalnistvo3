package LAVvajeZanke;

public class Sedemnajsta {

	public static void main(String[] args) {
		
		int n = 2;
		for(int i = 0; i < 100; i++) {
			
			for(int j = 2; j <= Math.sqrt(n); j++) {
				if(n % j == 0) {
					break;
				}
				else
					System.out.println(n);
					
			}
			n++;
		}

	}

}
