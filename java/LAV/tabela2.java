public class tabela2 {

	public static void main(String[] args) {
		
		int[][] tab = new int[9][9];
		
		int vsota = 0;
		for(int i = 0; i < tab.length; i++){
			vsota += tab[i][i];
			vsota += tab[tab.length - i - 1][i];
			
		}

	}

}
