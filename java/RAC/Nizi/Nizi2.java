package Naloge;

public class Nizi2 {

	public static void main(String[] args) {
		
		String niz = "danes je zelo lep dan in vceraj je bil prav tako lep dan upamo da bo jutri tudi lep dan";
		
		String[] besede = niz.split(" ");
		
		int stevec1 = 0;
		for(int i = 0; i < besede.length; i++) {
			if(besede[i].startsWith("dan")) stevec1++;
		}
		
		
		/*int st = 0;
		for(int i = 0; i < besede.length; i++) {
			for(int j = i + 1; j < besede.length; j++) {
				if(besede[i].equals(besede[j])) {
					st++;
					break;
				}
			}
		}
		//System.out.println(st);*/
		
		
		
		for(int i = 0; i < besede.length; i++) {
			int stevec2 = 0;
			for(int j = 0; j < besede.length; j++) {
				if(besede[i].equals(besede[j])) {
					stevec2++;
					break;
				}
			}
			//System.out.println(besede[i] + ": " + stevec2);
		}
		
		
		int najd = 0;
		int najkr = besede[0].length();
		int stPredlogov = 0;
		int stle = 0;
		for(int i = 0; i < besede.length; i++) {
			int crk = 0;
			for(int j = 0; j < besede[i].length(); j++) {
				if(Character.isLetter(besede[i].charAt(j))) {
					crk++;
				}
				if(besede[i].startsWith("le", j))
					stle++;
			}
			if(crk > najd) {
				najd = crk;
			}
			if(crk < najkr) {
				najkr = crk;
			}
			if(crk <= 2) {
				stPredlogov++;
			}
			besede[i] = Integer.toString(crk);
			System.out.println(besede[i]);
		}
		System.out.println("Najdaljsa: " + najd + ", najkrajsa: " + najkr + ", predlogov: " + stPredlogov + ", stle: " + stle);

	}

}
