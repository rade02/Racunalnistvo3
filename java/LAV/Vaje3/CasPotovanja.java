public class CasPotovanja {

	public static void main(String[] args) {
		
		int uraOdhoda = 12;
		int minOdhoda = 40;
	    	int uraPrihoda = 18;
	    	int minPrihoda = 30;
		int razMin, razUr;
		
		if(minOdhoda > minPrihoda){
		    razMin = 60 - minOdhoda + minPrihoda;
		    razUr = uraPrihoda - uraOdhoda - 1;
		}
		else{
		    razMin = minPrihoda - minOdhoda;
		    razUr = uraPrihoda - uraOdhoda;
		}
	    
		System.out.println("Trajanje: " + razUr + "ur in " + razMin + "min");
		 
	}

}
