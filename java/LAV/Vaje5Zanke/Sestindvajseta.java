public class Sestindvajseta {

	public static void main(String[] args) {
		
		int min = 10, max = 9000;
		
		for(int i = min; i <= max; i++){
		    int vsota = 0;
		    for(int j = 1; j <= i/2; j++){
		        if(i % j == 0){
		            vsota += j;
		        }
		    }
		    if(vsota == i)
		        System.out.println(i);
		}
		
	}

}
