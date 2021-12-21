public class Devetindvajseta {

	public static void main(String[] args) {
		
	    double a = 98765;
	    double b = 43210;
	    int decMest = 3;
	    
	    double kolicnik = a / b;
	    //System.out.println(kolicnik);
	    kolicnik = kolicnik * Math.pow(10, decMest);
	    kolicnik = Math.round(kolicnik);
	    //System.out.println(kolicnik);
	    kolicnik=kolicnik/Math.pow(10, decMest);
	    //System.out.println(kolicnik);
	    
	}

}
