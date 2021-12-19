public class CelzijFahrenheitKelvin {

	public static void main(String[] args) {
		
		double stC = 28.5;
		
		double stF = 1.8 * stC + 32;
		
		double K = stC + 273.15;
		
		System.out.format("%.1f stopinj Celzija = %.1f stopinj Fahrenheita = %.1f Kelvinov", stC, stF, K);
		
	}

}
