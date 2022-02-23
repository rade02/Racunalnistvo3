package car;

public class nizi {

	public static void main(String[] args){
		
		String besedilo = "Razred StringBuffer pozna prav tako podobne metode, kot razred String (append, insert, length ipd). Za podrobnejši opis in razlago posameznih metod glej Java docs oz. poglavje na internetu.";
		int besede = 0, samoglasniki = 0, soglasniki = 0;
		String sgl = "aeiouAEIOU";
		
		for(int i = 0; i < besedilo.length();i++){
			char crka = besedilo.charAt(i);
			if(Character.isLetter(crka)){
				if(sgl.indexOf(crka) >= 0) samoglasniki++;
				else soglasniki++;
			}
			else if(Character.isWhitespace(crka)) besede++; //tudi \n in \t
		}
		
		System.out.println("Samoglasnikov: " + samoglasniki + ", soglasnikov: " + soglasniki + ", besed: " + (besede + 1));
		
		/*3.
		String beseda = "pericarezeracirep";
		//brez zanke
		StringBuffer beseda2 = new StringBuffer(beseda);
		beseda2.reverse();
		if(beseda.compareTo(beseda2.toString()) == 0){
			System.out.println("je palindrom");
		}
		else
			System.out.println("ni palindrom");
		
		int polovica = (int)(beseda.length()/2);
		int i = 0;
		boolean palindrom = true;
		while(i <= polovica){
			if(beseda.charAt(i) != (beseda.charAt(beseda.length()- 1 - i))){
				palindrom = false;
				break;
			}
			i++;
		}
		if(palindrom){
			System.out.println("je palindrom");
		}
		else
			System.out.println("ni palindrom");
		
		 for(int i = 0, j = beseda.length()-1; i<j;i++,j++){
		  	if(beseda.charAt(i) != beseda.charAt(j)){
		  		palindrom=false;
		  		break;
		  	}
		}*/
	}
	
	
	
	/*public static void main(String[] args){
		2.
		String ime = "Janez Novak";
		
		for(int i = ime.length()-1; i >= 0; i--){
			System.out.print(ime.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer(ime);
		System.out.println(sb.reverse());
		
	}*/
	
	/*public static void main(String[] args) {
		1.
		String niz = "danes je lep dan.";
		String podniz = "dan";
		
		int ponovitve = kolikokrat(niz, podniz);
		
		System.out.println(ponovitve);

	}
	
	public static int kolikokrat(String niz, String podniz){
		
		int stPojavitve = 0;
		int stevec = 0;
		while((stevec = niz.indexOf(podniz, stevec)) != -1){
			stPojavitve++;
			stevec+=podniz.length();
		}
		
		
		
		return stPojavitve;
	}*/

}
