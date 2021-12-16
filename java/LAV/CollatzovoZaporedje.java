package preverjanje1;

public class CollatzovoZaporedje {

	public static void main(String[] args) {
		
		int maxClenov = 0;
		int stevilo = 0;
		
		for(int i = 100; i < 1000; i++) { //trimestno stevilo
			int n = i;
			int clenov = 1;
			while(n != 1) {
				if(n % 2 == 0) { //sodo stevilo
					n = n / 2;
				}
				else {	//liho stevilo
					n = 3*n + 1;
				}
				clenov++;
			}
			
			if(clenov > maxClenov) {
				maxClenov = clenov;
				stevilo = i;
			}
			
		}
		System.out.println(stevilo);

	}

}
