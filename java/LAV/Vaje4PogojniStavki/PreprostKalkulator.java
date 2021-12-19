public class PreprostKalkulator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		char operacija = '/';
		
		switch(operacija){
		    case '+': System.out.println(a + b); break;
		    case '-': System.out.println(a - b); break;
		    case '*': System.out.println(a * b); break;
		    case '/': System.out.println(a / b); break;
		    default: System.out.println("Napacna operacija!");
		}
		
	}

}
