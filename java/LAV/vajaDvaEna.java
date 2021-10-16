package nalogeLAV;
import java.util.Scanner;

public class vajaDvaEna {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Vnesi starost: ");
		byte starost = vhod.nextByte();
		
		System.out.println("Vnesi leto rojstva: ");
		short letoRojstva = vhod.nextShort();
		
		System.out.println("Vnesi stevilo glasov: ");
		int steviloGlasov = vhod.nextInt();
		
		System.out.println("Vnesi rezultat potence: ");
		long rezultatPotence = vhod.nextLong();
		
		vhod.nextLine();
		System.out.println("Vnesi spol: ");
		char spol = vhod.nextLine().charAt(0);
		
		System.out.println("Vnesi visino: ");
		float visina = vhod.nextFloat();
		
		System.out.println("Vnesi tezo: ");
		double teza = vhod.nextDouble();
		
		System.out.println("Vnesi ali je izposojeno (true|false): ");
		boolean izposojeno = vhod.nextBoolean();
		
		vhod.nextLine();
		System.out.println("Vnesi ime: ");
		String ime = vhod.nextLine();
		vhod.close();
		
		System.out.println(ime + " je " + spol + ", rojen je leta " + 
		letoRojstva + ", star je " + starost + ", visok " + visina + 
		", tezek " + teza + ". Dobil je " + steviloGlasov + " glasov,"
		+ " rezultat izbrane potence je " + rezultatPotence + ", si je izposodil: " + izposojeno + ".");
	}

}
