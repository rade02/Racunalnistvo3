package razredi;

public class Ulomki {

	int stevec;
	int imenovalec;
	
	Ulomki(int s, int i){
		stevec = s;
		imenovalec = i;
	}
	
	public boolean equals(Ulomek a){
		
		
	}
	
	public int najSkupniDelitelj(int st, int im){
		int naj = 0;
		for(int i = 1; i <= Math.min(st, im); i++){
			if(st%i == 0 && im%i == 0){
				naj = i;
			}
		}
		//System.out.println(naj);
		return naj;
	}
	
	public void pokrajsaj(int s, int im){
		int delitelj = najSkupniDelitelj(s, im);
		s = s / delitelj;
		im = im / delitelj;
		System.out.println(s + "/" + im);
	}
	
}
