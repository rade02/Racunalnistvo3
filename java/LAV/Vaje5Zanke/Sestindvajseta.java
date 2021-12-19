package LAVvajeZanke;

public class Sestindvajseta {

	public static void main(String[] args) {
		
		int min = 1; 
		int max = 10000;
		int vsota = 0;
		
		for(int i = min; i <= max; i++) { //interval
			
			for(int j = 1; j < i; j++) {
				if(i % j == 0)
					vsota += j;
			}
			if(vsota == i) {
				System.out.println(i);
			}
			
		}

	}

}
