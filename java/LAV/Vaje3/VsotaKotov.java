public class VsotaKotov {

	public static void main(String[] args) {
		
		int alfast = 40, alfam = 40, alfas = 40;
		
		int betast = 65, betam = 30, betas = 50;
		
		int vsotas = alfas + betas;
		int vsotam = alfam + betam + vsotas / 60;
		vsotas = vsotas % 60;
		int vsotast = alfast + betast + vsotam / 60;
		vsotam = vsotam % 60;
		
		System.out.println(vsotast + " stopinj, " + vsotam + " minut, " + vsotas + " sekund");
		
	}

}
