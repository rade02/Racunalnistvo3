import java.util.Arrays;

public class OdstranjevanjeVeckratnihPresledkov {

	public static void main(String[] args) {
		
		String n = "iz   niza     odstrani  vse veckratne     pojavitve   presledkov";
		StringBuffer sb = new StringBuffer(n);
		
		//String[] a = n.split(" ");
		//System.out.println(Arrays.toString(a));
		
		for(int i = 0; i < sb.length(); i++){
			while(Character.isWhitespace(sb.charAt(i)) && Character.isWhitespace(sb.charAt(i + 1))){
				sb.deleteCharAt(i + 1);
			}
			if(Character.isLetter(sb.charAt(i + 1))){
				Character.toUpperCase(sb.charAt(i + 1));
			}
		}
		System.out.println(sb.toString());

	}

}
