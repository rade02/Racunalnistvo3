public class Papajscina {

	public static void main(String[] args) {
		
		String niz = "matura je enostavna";
		
		StringBuffer sb = new StringBuffer(niz);
		char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};
		
		for(int i = 0; i < sb.length(); i++){
			for(int j = 0; j < samoglasniki.length; j++){
				if(Character.toLowerCase(sb.charAt(i)) == samoglasniki[j]){
					sb.insert(i+1, ("p" + samoglasniki[j]));	//vstavimo na vecjem indeksu (i+1), ker ostalo premakne naprej
					i+=2;
				}
			}
		}
		System.out.println(sb.toString());

		/*
		 * String s = "Danes je lep dan.";
		 * String samoglasniki = "aeiouAEIOU";
		 * for(int i = 0; i < niz.length(); i++){
		 * 		if(samoglasniki.indexOf(niz.charAt(i)) >= 0)
		 * 			System.out.print(x + "p" + x);
		 * 		else
		 * 			System.out.print(x);
		 * }
		 */
		/*
		 * StringBuffer niz2 = new StringBuffer(s);
		 * for(int i = 0; i < niz2.length(); i++){
		 * 		char x = niz2.charAt(i);
		 * 		if(samoglasniki.indexOf(x) >= 0){
		 * 			niz2.insert(i+1, "p"+x);
		 * 			i+=2;
		 *		}
		 * }
		 * System.out.println(niz2);
		 */
	}

}
