public class Premici {

	public static void main(String[] args) {
		
		double k1 = 2.5, k2 = 3, n1 = 4, n2 = -2, y1, y2;
		
		if(k1 != k2){
		    for(double x = -100; x <= 100; x += 0.5){
		        y1 = k1*x + n1;
		        y2 = k2*x + n2;
		        if(y1 == y2){
		            System.out.format("Seceta se v tocki: (%.1f, %.1f).", x, y1);
		            break;
		        }
		        
		    }
		}
		else if((k1 == k2) && (n1 == n2)){
		    System.out.println("Seceta se v neskoncno mnogo tockah.");
		}
		else{
		    System.out.println("Se ne seceta, sta vzporedni.");
		}

	}

}
