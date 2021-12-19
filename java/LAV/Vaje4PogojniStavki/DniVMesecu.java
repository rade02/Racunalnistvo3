public class DniVMesecu {

	public static void main(String[] args) {
		
		int leto = 2000;
		int mesec = 2;
		int dni = 0;
		
		switch(mesec){
		    case 1: case 3: case 5: case 7: case 8: case 10: case 12: dni = 31; break;
		    case 4: case 6: case 9: case 11: dni = 30; break;
		    case 2:
		        if((leto % 4 == 0) && (leto % 100 != 0) || (leto % 400 == 0))
		            dni = 29;
		        else
		            dni = 28; break;
		    default: dni = -1; break;
		}
		
		if(dni != -1)
		    System.out.println(dni);
		else
		    System.out.println("Ni mesec!");
		
	}

}
