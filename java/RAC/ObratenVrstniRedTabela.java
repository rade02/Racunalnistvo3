package Naloge;

public class ObratenVrstniRedTabela {

	public static void main(String[] args) {
		
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] tab1 = new int[tab.length];
		
		for(int i = 0; i < tab.length; i++) {
			tab1[i] = tab[(tab.length - 1) - i];
		}
		
		for(int j = 0; j < tab1.length; j++) {
			System.out.print(tab1[j] + " ");
		}

	}

}
