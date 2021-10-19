import java.util.Scanner;

public class VsotaKotov {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Program izracuna vsoto dveh kotov. \nVnesi stopinje prvega kota: ");
		int alfaStopinje = vhod.nextInt();
		System.out.println("Vnesi minute prvega kota: ");
		int alfaMinute = vhod.nextInt();
		System.out.println("Vnesi sekunde prvega kota: ");
		int alfaSekunde = vhod.nextInt();
		System.out.println("Vnesi stopinje drugega kota: ");
		int betaStopinje = vhod.nextInt();
		System.out.println("Vnesi minute drugega kota: ");
		int betaMinute = vhod.nextInt();
		System.out.println("Vnesi sekunde drugega kota: ");
		int betaSekunde = vhod.nextInt();
		
		//pretvorba za napacen vnos (ko je vec kot 60 min ali sekund)
		if (alfaSekunde > 59) {
			alfaMinute = alfaMinute + (alfaSekunde / 60);
			alfaSekunde = (alfaSekunde % 60);
		}
		if (alfaMinute > 59) {
			
			alfaStopinje = alfaStopinje + (alfaMinute / 60);
			alfaMinute = (alfaMinute % 60);
			
		}
		if (betaSekunde > 59) {
			betaMinute = betaMinute + (betaSekunde / 60);
			betaSekunde = (betaSekunde % 60);
		}
		if (betaMinute > 59) {
			
			betaStopinje = betaStopinje + (betaMinute / 60);
			betaMinute = (betaMinute % 60);
			
		}
		
		int sestevekStopinje = alfaStopinje + betaStopinje;
		int sestevekMinute = alfaMinute + betaMinute;
		int sestevekSekunde = alfaSekunde + betaSekunde;
		
		//ce je minut ali sekund 60 ali vec, dodamo naslednji enoti ena
		if (sestevekSekunde > 59) {
			sestevekMinute = sestevekMinute + (sestevekSekunde / 60);
			sestevekSekunde = (sestevekSekunde % 60);
		}
		if (sestevekMinute > 59) {
			sestevekStopinje = sestevekStopinje + (sestevekMinute / 60);
			sestevekMinute = (sestevekMinute % 60);
		}
		
		System.out.println("Vsota kotov je " + sestevekStopinje + " stopinj, " + sestevekMinute + " minut, " + sestevekSekunde + " sekund.");
		vhod.close();
	}

}
