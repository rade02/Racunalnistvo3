import java.util.Scanner;

public class Naloga2 {

	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi dolzino prve katete pravokotnega trikotnika: ");
		double a = vnos.nextDouble();
		System.out.println("Vnesi dolzino druge katete pravokotnega trikotnika: ");
		double b = vnos.nextDouble();
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));	//hipotenuza
		
		double alfaR = Math.atan(a/b);	//kot v radianih
		double betaR = Math.atan(b/a);
		
		double alfa = alfaR * 57.296;	//kot v stopinjah
		double beta = betaR * 57.296;
		
		double p = (a * b)/2; //ploscina
		
		System.out.format("Hipotenuza je dolga %.1f, ", c);
		System.out.format("alfa je velik %.1f stopinj, beta je velik ", alfa);	//izpis kota na eno decimalko
		System.out.format("%.1f stopinj, ploscina trikotnika pa je ", beta);	//izpis kota na eno decimalko
		System.out.format("%.1f.", p);
		vnos.close();
	}
}
