public class Pravokotnik2 {

	public static void main(String[] args) {
		
		//vnos nasprotnih oglisc pravokotnika
		int x1 = 5, y1 = 5;
		int x2 = 10, y2 = 10;
		
		//nakljucna tocka
		int x3 = (int)(Math.random()*(x2 + (x2 - x1)) + 1);
		int y3 = (int)(Math.random()*(y2 + (y2 - y1)) + 1);
		
		//prikaz
		for(int i = 0; i <= y2 + (y2 - y1); i++){
		    for(int j = 0; j <= x2 + (x2 - x1); j++){
		        if((i == y3) && (j == x3))
		            System.out.print('X');
		        else if(((j == x1)||(j == x2)) && ((i > y1)&&(i < y2)) || (j == 0)||(j == x2 + (x2 - x1)))
		            System.out.print('|');
		        else if(((i == y1)||(i == y2)) && ((j > x1)&&(j < x2)) || (i == 0)||(i == y2 + (y2 - y1)))
		                System.out.print('-');
		        else if((i > y1)&&(i < y2)&&(j > x1)&&(j < x2))
		            System.out.print('O');
		        else
		            System.out.print(' ');
		    }
		    System.out.println();
		}
		System.out.println();
		//zapis
		if((y3 < y1)||(y3 > y2)||(x3 < x1)||(x3 > x2))
		        System.out.println("Tocka (" + x3 + ", " + y3 + ") lezi izven pravokotnika.");
		    else if((y3 == y1)||(y3 == y2)||(x3 == x1)||(x3 == x2))
		        System.out.println("Tocka (" + x3 + ", " + y3 + ") lezi na robu pravokotnika.");
		    else
		        System.out.println("Tocka (" + x3 + ", " + y3 + ") lezi znotraj pravokotnika.");
	}

}
