package preverjanje1;

public class StatistikaMetovKocke {

	public static void main(String[] args) {
		
		int ena = 0, dva = 0, tri = 0, stiri = 0, pet = 0, sest = 0;
		
		for(int i = 0; i < 1000; i++) {
			int a = (int)(Math.random()*6 + 1);
			switch(a) {
			case 1: ena++; break;
			case 2: dva++; break;
			case 3: tri++; break;
			case 4: stiri++; break;
			case 5: pet++; break;
			case 6: sest++; break;
			}
		}
		System.out.println("Enkra: " + ena + ", dvojka: " + dva + ", trojka: " + tri + ", stirica: " + stiri + ", petka: " + pet + ", sestica: " + sest);

	}

}
