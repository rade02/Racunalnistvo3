public class TockaVPravokotniku {

	public static void main(String[] args) {
		
		int x1 = 0, y1 = 0, x2 = 10, y2 = 10;
		
		int x3 = (int)(Math.random()*13);
		int y3 = (int)(Math.random()*13);
		
		for(int i = y1; i <= y2; i++){
		    for(int j = x1; j <= x2; j++){
		        if((i == y3) && (j == x3))
		            System.out.print("X ");
		        else if((i == y1)||(i == y2))
		                System.out.print("- ");
		            else if((j == x1)||(j == x2))
		                    System.out.print("| ");
		                else 
		                      System.out.print("O ");
		    }
		    System.out.println();
		}
		
		if((x3 < x1)||(x3 > x2)||(y3 < y1)||(y3 > y2))
		    System.out.println("Tocka X lezi IZVEN pravokotnika, X(" + x3 + ", " + y3 + ").");
		else if((x3 == x1)||(x3 == x2)||(y3 == y1)||(y3 == y2))
		        System.out.println("Tocka X lezi NA ROBU pravokotnika, X(" + x3 + ", " + y3 + ").");
		    else
		        System.out.format("Tocka X lezi ZNOTRAJ pravokotnika, X(" + x3 + ", " + y3 + ").");
		
	}

}
