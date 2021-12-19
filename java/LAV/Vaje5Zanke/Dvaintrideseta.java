import java.util.Scanner;

public class Dvaintrideseta {

	public static void main(String[] args) {
		
		  Scanner s = new Scanner(System.in);
		  System.out.println("Vnesi prvi clen zaporedja: ");
      int n = s.nextInt();
      s.close();
        
        System.out.print(n + " ");
        while(n != 1){
            if(n % 2 == 0)
                n = n / 2;
            else
                n = 3*n + 1;
            System.out.print(n + " ");
        }

	}

}
