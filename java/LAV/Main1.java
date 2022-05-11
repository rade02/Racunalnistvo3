public class Main1 {
	public static void main(String[] args){
		MotornoVozilo avto = new MotornoVozilo("Audi", 90, 160.0);
		Tovornjak t = new Tovornjak("Scania", 130, 160.0, 6.0);
		avto.izpisiVse();
		t.izpisiVse();
	}
}

class MotornoVozilo{
	String proizvajalec;
	int mocMotorja;
	double maxHitrost;
	public MotornoVozilo(String p, int m, double h){
		this.proizvajalec = p;
		this.mocMotorja = m;
		this.maxHitrost = h;
	}
	public void izpisiVse(){
		System.out.println(proizvajalec + " " + mocMotorja + " " + maxHitrost);
	}
}

class Tovornjak extends MotornoVozilo{
	double nosilnost;
	public Tovornjak(String p, int m, double h, double n){
		super(p, m, h);
		/*ce ni konstruktorja v MotornoVozilo:
		 * proizvajalec = p;
		 * mocMotorja = m;
		 * maxHitrost = h;
		 * */
		this.nosilnost = n;
	}
	public void izpisiVse(){
		super.izpisiVse();
		System.out.println(nosilnost);
	}
}
