package car;

public class Obrni {

	public static void main(String[] args) {
		int x = 1234;
		int obrnjeno = 0;
		
		obrnjeno += (x % 10) * 1000;
		x /= 10;
		obrnjeno += (x % 10) * 100;
		x /= 10;
		obrnjeno += (x % 10) * 10;
		x /= 10;
		obrnjeno += x % 10;
		x /= 10;
		
		System.out.println(obrnjeno);
	}

}
