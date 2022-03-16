package car;

public class VelikeMale {

	public static void main(String[] args) {
		
		String s = new String("StringBuffer. append(char[] astr) is the inbuilt method which appends the string representation of the char array argument to this StringBuffer sequence. Parameter : The method accepts a single parameter astr which are the Char sequence whose string representation is to be appended.");

		/*
		//6. naloga
		StringBuffer sb = new StringBuffer(s);
		
		for(int i = 0; i < sb.length(); i++){
			if(Character.isUpperCase(sb.charAt(i))){
				sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
			}
			else if(Character.isLowerCase(sb.charAt(i))){
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
		}
		//System.out.println(sb);
		
		
		//7. naloga
		String[] tab = s.split(" ");
		
		for(int i = 0; i < tab.length; i++){
			StringBuffer a = new StringBuffer(tab[i]);
			a.reverse();
			tab[i] = a.toString();
			//System.out.print(tab[i] + " ");
		}
		//System.out.println();
		*/
		
		//8. naloga
		String niz = "AAAAAABBCCCCDDDDEFFF";
		StringBuffer novi = new StringBuffer();
		int st = 0;
		int i = 0;
		
		while(i < niz.length()){
			char c = niz.charAt(i);
			st = 0;
			for(int j = i; j < niz.length(); j++){
				if(niz.charAt(j) != c){
					break;
				}
				else{
					st++;
				}
			}
			
			novi.append(niz.charAt(i) + "" + st);
			i += st;
		}
		System.out.println(novi);
		
		//9. naloga
		String niz2 = "A6B2C4D4E1F3";
		StringBuffer b = new StringBuffer();
		
		for(int ii = 0; ii < niz2.length(); ii++){
			if(Character.isDigit(niz2.charAt(ii))){
				for(int jj = 0; jj < Integer.parseInt(Character.toString(niz2.charAt(ii))); jj++){
					b.append(niz2.charAt(ii - 1));
				}
			}
		}
		System.out.println(b);
		
	}

}
