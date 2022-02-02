
public class MetanjeKrogle {

	public static void main(String[] args) {
		
		int tekmovalcev = 12;
		int serije = 6;
		
		int[][] r = new int[tekmovalcev][serije];
		
		nakljucnaSt(r);
		
		int serij = 1;
		for(int n = 0; n < serije; n++){
			double a = povprecjeSerije(r, n);
			System.out.format("Povprecje " + serij + ". serije: %.3f\n", a);
			serij++;
		}

	}
	
	public static double povprecjeSerije(int[][] r, int n){
		double vsota = 0;
		double povpr = 0;
		int stNicel = 0;
		
		for(int i = 0; i < r.length; i++){
			if(r[i][n] == 0){
				stNicel++;
			}
			else{
				vsota += r[i][n];
			}
				
		}
		
		povpr = vsota / (r.length - stNicel);
		return povpr;
	}
	
	public static void nakljucnaSt(int[][] r){
		int tekmoval = 1;
		for(int i = 0; i < r.length; i++){
			System.out.print((tekmoval < 10) ? (" " + tekmoval + ". tekmovalec: "):(tekmoval + ". tekmovalec: "));
			tekmoval++;
			for(int j = 0; j < r[0].length; j++){
				r[i][j] = (int)(Math.random()*5);
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
