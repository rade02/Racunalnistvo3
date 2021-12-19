public class PrestopnoLeto {

	public static void main(String[] args) {
		
		int leto = 2000;
		
		if((leto % 4 == 0) && (leto % 100 != 0) || (leto % 400 == 0))
		    System.out.println("Leto je prestopno.");
		else
		    System.out.println("Leto ni prestopno.");
	}

}
