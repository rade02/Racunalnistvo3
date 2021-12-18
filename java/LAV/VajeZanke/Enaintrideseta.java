import java.util.Scanner;

public class Enaintrideseta {

	public static void main(String[] args) {
		
		System.out.println("Vnesi znesek: ");
		Scanner s = new Scanner(System.in);
        int znesek = s.nextInt();
        
        int sto = 0, petdeset = 0, dvajset = 0, deset = 0;
        
        sto = znesek / 100;
        petdeset = (znesek % 100) / 50;
        dvajset = (znesek % 50) / 20;
        deset = znesek % 20;
        
        System.out.print(znesek + " = " + ((sto == 0)?(""):(sto + "x100€, ")) +  ((petdeset == 0)?(""):(petdeset + "x50€, ")) +  ((dvajset == 0)?(""):(dvajset + "x20€, ")) +  ((deset == 0)?(""):(deset + "x10€, ")));

	}

}
