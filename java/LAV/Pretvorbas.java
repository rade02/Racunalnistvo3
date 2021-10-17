import java.util.Scanner;

public class Pretvorbas {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi cas v sekundah: ");
		int sek = vhod.nextInt();
		vhod.close();
		int sekunde = sek;
		int h = (int)(sek / 3600);
		sek %= 3600;
		int min = (int)(sek / 60);
		sek %= 60;
		
		System.out.println(sekunde + " sekund je enako " + h + " ur, " + min + " minut in " + sek + " sekund.");
	}

}
