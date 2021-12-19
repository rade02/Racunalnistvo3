public class Zlitje {

	public static void main(String[] args) {
		
		int a = 123;
		int b = 456;
		
		int ae = (int)(a % 10);
		int ad = (int)((a % 100) / 10);
		int as = (int)(a / 100);
		
		int be = (int)(b % 10);
		int bd = (int)((b % 100) / 10);
		int bs = (int)(b / 100);
		
		int sestmestno = 100000*as + 10000*bs + 1000*ad + 100*bd + 10*ae + be;
		
		System.out.println(sestmestno);
		
	}

}
