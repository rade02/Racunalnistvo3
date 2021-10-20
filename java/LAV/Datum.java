package car;
import java.util.Scanner;

public class Datum {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Vnesi letnico: ");
		int letnica = vhod.nextInt();
		System.out.println("Vnesi zaporedno stevilko dneva: ");
		int zap = vhod.nextInt();
		
		if ((letnica % 4 == 0) && (letnica % 100 == 0) || (letnica % 400 == 0)){
			
		}
		vhod.close();
	}

}
