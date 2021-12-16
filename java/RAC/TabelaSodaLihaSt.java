package Naloge;

public class TabelaSodaLihaSt {

	public static void main(String[] args) {
		
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int zadnjeLiho = 0;
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] % 2 == 0) {
				int tmp = tab[i];
				tab[i] = tab[zadnjeLiho];
				tab[zadnjeLiho] = tmp;
				zadnjeLiho++;
			}
		}
		
		for(int x = 0; x < tab.length; x++) {
			System.out.print(tab[x] + " ");
		}

	}

}
