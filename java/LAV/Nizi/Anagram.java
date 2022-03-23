public class Anagram {

	public static void main(String[] args) {
		
		//anagram - če sta sestavljena iz enakih črk
		
		String n1 = "računalnik";
		String n2 = "kinlanučar";
		
		StringBuffer sb = new StringBuffer(n2);
		
		for(int i = 0; i < n1.length(); i++){
			for(int j = 0; j < sb.length(); j++){
				if(sb.charAt(j) == n1.charAt(i)){
					sb.deleteCharAt(j);
				}
			}
		}
		if(sb.toString().trim().isEmpty()){
			System.out.println("Sta anagrama");
		}
		else{
			System.out.println("Nista anagrama");
		}
		System.out.println(sb.toString());

		/*
		 * StringBuffer niz1 = new StringBuffer("mother in law");
		 * StringBuffer niz2 = new StringBuffer("woman hitler");
		 * 
		 * for(int i = 0; i < niz1.length(); i++){
		 * 		if(niz2.indexOf(niz1.charAt(i) + "") >= 0){
		 * 			niz1.deleteCharAt(i--);
		 * 			System.out.println(niz1);
		 * 		}
		 * 		//if(niz.isEmpty()) System.out.println("Sta anagrama");
		 * 		//else System.out.println("Nista anagrama");
		 * 
		 * 		System.out.println((niz1.isEmpty() ? "Sta":"Nista") + "anagrama");
		 * }
		 */
	}

}
