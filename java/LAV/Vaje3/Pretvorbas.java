public class Pretvorbas {

	public static void main(String[] args) {
		
		int s = 849312;
		
		int h = (int)(s / 3600);
		int min = (int)((s % 3600) / 60);
		s = s % 60;
		
		System.out.println(h + "ur " + min + "min " + s + "s");
	}

}
