public class PodobnostDvehBesed {

	public static void main(String[] args) {
		
		String n1 = "telefon";
		String n2 = "velikost";
		int podobnost = 0;
		
		for(int i = 0; i < Math.min(n1.length(), n2.length()); i++){
			if(n1.charAt(i) == n2.charAt(i)){
				podobnost++;
			}
		}
		System.out.println(podobnost);

	}

}
