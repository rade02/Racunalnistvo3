package Naloge;

public class StD7VsotaStM7 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 1000; i++) {
			if(i % 7 == 0) {
				int e = i % 10;
				int d = (i / 10) % 10;
				int s = (i / 100) % 10;
				int t = i / 1000;
				
				if(e + d + s + t < 10)
					System.out.println(i);
			}
		}

	}

}
