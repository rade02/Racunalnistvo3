package Naloge;

public class SimKocka {

	public static void main(String[] args) {
		int izbrana = (int)(Math.random() * 6 + 1);
		String vodoravno = " - - - - - ";
		String prazno = "|         |";
		String dve = "|  *   *  |";
		String enaSredina = "|    *    |";
		String enaLevo = "|  *      |";
		String enaDesno = "|      *  |";
		
		switch (izbrana) {
		case 1:
			System.out.println(vodoravno);
			System.out.println(prazno);
			System.out.println(enaSredina);
			System.out.println(prazno);
			System.out.println(vodoravno);break;
		case 2:
			System.out.println(vodoravno);
			System.out.println(enaLevo);
			System.out.println(prazno);
			System.out.println(enaDesno);
			System.out.println(vodoravno);break;
		case 3:
			System.out.println(vodoravno);
			System.out.println(enaLevo);
			System.out.println(enaSredina);
			System.out.println(enaDesno);
			System.out.println(vodoravno);break;
		case 4:
			System.out.println(vodoravno);
			System.out.println(dve);
			System.out.println(prazno);
			System.out.println(dve);
			System.out.println(vodoravno);break;
		case 5:
			System.out.println(vodoravno);
			System.out.println(dve);
			System.out.println(enaSredina);
			System.out.println(dve);
			System.out.println(vodoravno);break;
		case 6:
			System.out.println(vodoravno);
			System.out.println(dve);
			System.out.println(dve);
			System.out.println(dve);
			System.out.println(vodoravno);break;
		}
	}

}
