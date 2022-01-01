import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vnesi število: ");
		String num = s.nextLine();
		int length = num.length();
		char a = ' ';
		boolean jePalindrom = true;
		s.close();
		
		//System.out.println(length);
		for(int i = 0; i < length; i++) {
			a = num.charAt(i);
			if (a != (num.charAt((length - 1) - i)))
				jePalindrom = false;
		}
		if (jePalindrom == true) {
			System.out.println("Je palindrom");
		}
		else
			System.out.println("Ni palindrom");
	}

}
