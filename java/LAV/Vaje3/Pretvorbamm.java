public class Pretvorbamm {

	public static void main(String[] args) {
		
		int mm = 21387;
		
		int m = (int)(mm / 1000);
		int cm = (int)((mm % 1000) / 10);
		mm = mm % 10;
		
		System.out.println(m + "m " + cm + "cm " + mm + "mm");
	}

}
