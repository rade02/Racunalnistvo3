import java.util.Scanner;
public class Tabele1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		/*
		int[] tab = new int[15];
		for(int i = 0; i < tab.length; i++) {
			if(i % 2 != 0)
				tab[i]++;
			else
				tab[i] += 2;
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		*/
		/*
		String[] nizi = new String[5];
		for(int j = 0; j < nizi.length; j++) {
			nizi[j] = s.nextLine();
		}
		for(int k = nizi.length - 1; k >= 0; k--)
			System.out.print(nizi[k] + " ");
		System.out.println();
		*/
		/*
		int[] a = {1, 2, 3, 4, -1, 6, 7, 8, 9};
		int najmanjsi = a[0];
		int indeks = 0;
		for(int l = 1; l < a.length; l++) {
			if(a[l] < najmanjsi) {
				najmanjsi = a[l];
				indeks = l;
			}
		}
		System.out.println("a[" + indeks + "] = " + najmanjsi);
		*/
		/*NE DELA
		int n = 2;
		int[] z = new int[n + 1];
		z[0] = 1;
		int[] tab = new int[n + 1];
		
		while(n > 0) {
			for(int m = 0; m < z.length; m++) {
				
				if(m == 0)
					tab[m] = z[m];
				else if(m < z.length) 
					tab[m] = z[m] + z[m - 1];
				else
					tab[m] = z[m - 1];
				
			}
			z = tab;
			
			n--;
		}
		
		for(int i = 0; i < tab.length; i++)
			System.out.print(tab[i]);
		System.out.println();
		*/
		/*
		int[] t = {3, -1, 7, -5, 3, 7, 4, -10};
		int[] indeksiNeg = new int[t.length];
		int stNeg = 0;
		for(int i = 0; i < t.length; i++) {
			if(t[i] < 0){
				stNeg++;
				indeksiNeg[i]++;
				System.out.print(t[i] + " ");
			}
			if(t[i] % 3 == 0)
				System.out.print(t[i] + " ");
		}
		System.out.println();
		System.out.println("Stevilo negativnih vrednosti: " + stNeg);
		System.out.print("Indeksi negativnih vrednosti: ");
		for(int j = 0; j < indeksiNeg.length; j++) {
			if(indeksiNeg[j] != 0)
				System.out.print(j + " ");
		}
		System.out.println();
		*/
		/*
		int[] t1 = {-2, 4, 5, 2, -1, 7, -4};
		int indeksZadnjegaNegativnega = -1;
		for(int i = 0; i < t1.length; i++) {
			if(t1[i] < 0) {
				t1[i] = 0;
				indeksZadnjegaNegativnega = i;
			}
			System.out.print(t1[i] + " ");
		}
		System.out.println();
			System.out.println("Indeks zadnjega negativnega stevila je: " + indeksZadnjegaNegativnega);	
		*/
		
		/*//urejanje z izbiranjem
		int[] t2 = {4, 2, 7, 2, 1, 6, 8};
		
		for(int i = 0; i < t2.length; i++) { //cez celotno tabelo
			
			int n = i; //indeks za najmanjsi element
			int min = t2[i];
			
			for(int j = i; j < t2.length; j++) { //cez neurejen del
				if(t2[j] < min) {
					min = t2[j];
					n = j;
				}
			}
			int tmp = t2[i];
			t2[i] = t2[n];
			t2[n] = tmp;
		}
		for(int k = 0; k < t2.length; k++)
			System.out.print(t2[k] + " ");
		System.out.println();
		*/
		/*NI NAREJENO
		int[] t3 = {4, 6, 1, 2, 8};
		int najvecji = t3[0], indeksNajv = 0;
		for(int i = 0; i < t3.length; i++) {
			if(t3[i] > najvecji) {
				najvecji = t3[i];
				indeksNajv = i;
			}
		}
		int druginajvecji = t3[0];
		for(int j = 0; j < t3.length; j++) {
			if((t3[j] < najvecji) && )
		}
		*/
		/*
		int ciljnaVsota = 3;
		int t4[] = {2, 6, 7, 1, 2, 3, 0, 1};
		for(int i = 0; i < t4.length; i++) {
			for(int j = 0; j < t4.length; j++) {
				if(t4[i] + t4[j] == ciljnaVsota) {
					System.out.println("t4[" + i + "] + t4[" + j + "] = " + ciljnaVsota);
				}
			}
		}
		*/
		/*
		int t5[] = {1, 2, 3, 4, 5, 6};
		boolean razlicni = true;
		for(int i = 0; i < t5.length - 1; i++) {
			if(t5[i] == t5[i + 1]) {
				razlicni = false;
				break;
			}
		}
		System.out.println((razlicni) ? "DA":"NE");
		*/
		/*NE DELA
		String[] imena = {"Ales", "Luka", "Janez", "Joze", "Klemen", "Andrej"};
		int stBesed = 10;
		int i = 0;
		for(;i < stBesed; i++) {
			int stevec = i;
			if(stevec > imena.length) {
				stevec %= imena.length;
			}
			i += stevec;
			System.out.println(imena[i]);
		}
		*/
		
	}

}
