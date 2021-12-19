public class Kipci {

	public static void main(String[] args) {
		
		int a = 700, b = 100, c = 300;
		
		if(a > b){
		    if(a > c){
		        if(c > b)
		            System.out.println("a + c");
		        else
		            System.out.println("a + c");
		    }
		    else
		        System.out.println("c + a");
		}
		else if(b > a){
		    if(b > c){
		        if(a > c)
		            System.out.println("b + a");
		        else
		            System.out.println("b + c");
		    }
		    else
		        System.out.println("c + b");
		}
		
		
	}

}
