package Naloge;

public class SimKocki {

	public static void main(String[] args) {
		int met1 = (int)(Math.random()*6 + 1);
		int met2 = (int)(Math.random()*6 + 1);
		System.out.println(met1 +"," + met2);
		
		String vodoravno = " - - - - - 		";
		String prazno = "|         |		";
		String dve = "|  *   *  |		";
		String enaSredina = "|    *    |		";
		String enaLevo = "|  *      |		";
		String enaDesno = "|      *  |		";
		
		for(int i = 0; i < 5; i++) {
		
			switch (met1) {
			case 1:
				if (i == 0) System.out.print(vodoravno);
				if (i == 1) System.out.print(prazno);
				if (i == 2) System.out.print(enaSredina);
				if (i == 3) System.out.print(prazno);
				if (i == 4) System.out.print(vodoravno);break;
			case 2:
				if (i == 0) System.out.print(vodoravno);
				if (i == 1) System.out.print(enaLevo);
				if (i == 2) System.out.print(prazno);
				if (i == 3) System.out.print(enaDesno);
				if (i == 4) System.out.print(vodoravno);break;
			case 3:
				if (i == 0) System.out.print(vodoravno);
				if (i == 1) System.out.print(enaLevo);
				if (i == 2) System.out.print(enaSredina);
				if (i == 3) System.out.print(enaDesno);
				if (i == 4) System.out.print(vodoravno);break;
			case 4:
				if (i == 0) System.out.print(vodoravno);
				if (i == 1) System.out.print(dve);
				if (i == 2) System.out.print(prazno);
				if (i == 3) System.out.print(dve);
				if (i == 4) System.out.print(vodoravno);break;
			case 5:
				if (i == 0) System.out.print(vodoravno);
				if (i == 1) System.out.print(dve);
				if (i == 2) System.out.print(enaSredina);
				if (i == 3) System.out.print(dve);
				if (i == 4) System.out.print(vodoravno);break;
			case 6:
				if (i == 0) System.out.print(vodoravno);
				if (i == 1) System.out.print(dve);
				if (i == 2) System.out.print(dve);
				if (i == 3) System.out.print(dve);
				if (i == 4) System.out.print(vodoravno);break;
			}
			
			switch (met2) {
			case 1:
				if (i == 0) System.out.println(vodoravno);
				if (i == 1) System.out.println(prazno);
				if (i == 2) System.out.println(enaSredina);
				if (i == 3) System.out.println(prazno);
				if (i == 4) System.out.println(vodoravno);break;
			case 2:
				if (i == 0) System.out.println(vodoravno);
				if (i == 1) System.out.println(enaLevo);
				if (i == 2) System.out.println(prazno);
				if (i == 3) System.out.println(enaDesno);
				if (i == 4) System.out.println(vodoravno);break;
			case 3:
				if (i == 0) System.out.println(vodoravno);
				if (i == 1) System.out.println(enaLevo);
				if (i == 2) System.out.println(enaSredina);
				if (i == 3) System.out.println(enaDesno);
				if (i == 4) System.out.println(vodoravno);break;
			case 4:
				if (i == 0) System.out.println(vodoravno);
				if (i == 1) System.out.println(dve);
				if (i == 2) System.out.println(prazno);
				if (i == 3) System.out.println(dve);
				if (i == 4) System.out.println(vodoravno);break;
			case 5:
				if (i == 0) System.out.println(vodoravno);
				if (i == 1) System.out.println(dve);
				if (i == 2) System.out.println(enaSredina);
				if (i == 3) System.out.println(dve);
				if (i == 4) System.out.println(vodoravno);break;
			case 6:
				if (i == 0) System.out.println(vodoravno);
				if (i == 1) System.out.println(dve);
				if (i == 2) System.out.println(dve);
				if (i == 3) System.out.println(dve);
				if (i == 4) System.out.println(vodoravno);break;
			}
		}
	}

}
