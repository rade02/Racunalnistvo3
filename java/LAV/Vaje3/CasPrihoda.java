public class CasPrihoda {

	public static void main(String[] args) {
		
		int uraOdhoda = 12;
		int minOdhoda = 40;
		int uraPotovanje = 5;
		int minPotovanje = 45;
		
		int minPrihoda = minOdhoda + minPotovanje;
		int uraPrihoda = uraOdhoda + uraPotovanje + minPrihoda / 60;
		minPrihoda %= 60;
		
		System.out.println("Cas prihoda: " + ((uraPrihoda < 10)?("0" + uraPrihoda):uraPrihoda) + ":" + ((minPrihoda < 10)?("0" + minPrihoda):minPrihoda));
	}

}
