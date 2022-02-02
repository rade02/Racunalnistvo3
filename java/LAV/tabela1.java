public class tabela1 {

	public static void main(String[] args) {
		
		int[][] tabela = new int[6][7];
		int st = 1;
		for(int i = 0; i < tabela.length; i++){
			for(int j = 0; j < tabela[0].length; j++){
				tabela[i][j] = st;
				st++;
				System.out.print(((tabela[i][j] < 10) ? (" " + tabela[i][j]):(tabela[i][j])) + " ");
			}
			System.out.println();
		}

	}

}
