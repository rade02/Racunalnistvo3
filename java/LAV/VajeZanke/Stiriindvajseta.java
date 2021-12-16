package LAVvajeZanke;

public class Stiriindvajseta {

	public static void main(String[] args) {
		
		int a = 0;
		
		while(true) {
			if((a % 5 == 3) && (a % 7 == 1)) {
				System.out.println(a);
				break;
			}
			a++;
		}

	}

}
