public class Enaindvajseta {

	public static void main(String[] args) {
		
		int a = 32;
		int b = 160;
		
		if(b > a){
		    int temp = a;
		    a = b;
		    b = temp;
		}
		
		//gcd
		int c = a;
		int d = b;
		while(d != 0){
		    int tmp = d;
		    d = c % d;
		    c = tmp;
		}
		System.out.println("gcd = " + c);
		
		//lcm
		int t = a;
		int i = 2;
		while(a % b != 0){
		    a *= i;
		    i++;
		    
		}
		System.out.println("lcm = " + a);
	}

}
