import java.util.Scanner;

public class Datum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Vnesi letnico: ");
		int leto = s.nextInt();
		System.out.println("Vnesi zaporedno številko dneva v letu: ");
		int dan = s.nextInt();
		s.close();
		
		int jan = 31;
		int feb = 28;
		int mar = 31;
		int apr = 30;
		int maj = 31;
		int jun = 30;
		int jul = 31;
		int avg = 31;
		int sep = 30;
		int okt = 31;
		int nov = 30;
		int dec = 31;
		int mesec = 1;
		
		if ((leto % 4 == 0) && (leto % 100 != 0) || (leto % 400 == 0)) {
			feb = 29;
		}
		
		if (dan > jan) {
			dan -= jan;
			mesec = 2;
			if (dan > feb) {
				dan -= feb;
				mesec = 3;
				if (dan > mar) {
					dan -= mar;
					mesec = 4;
					if (dan > apr) {
						dan -= apr;
						mesec = 5;
						if (dan > maj) {
							dan -= maj;
							mesec = 6;
							if (dan > jun) {
								dan -= jun;
								mesec = 7;
								if (dan > jul) {
									dan -= jul;
									mesec = 8;
									if (dan > avg) {
										dan -= avg;
										mesec = 9;
										if (dan > sep) {
											dan -= sep;
											mesec = 10;
											if (dan > okt) {
												dan -= okt;
												mesec = 11;
												if (dan > nov) {
													dan -= nov;
													mesec = 12;
													if (dan > dec) {
														dan = 0;
														System.out.println("Napacna stevilka dneva.");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		if (dan != 0)
			System.out.println("Dan je " + dan + ". " + mesec + ". " + leto + ".");
	}

}
