import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.IOException;

public class FunkcijaTabelaCSV {

	public static void main(String []args) throws IOException{
    
		String potDoDatoteke = "";
		BufferedWriter bw = new BufferedWriter(new FileWriter(potDoDatoteke));
		PrintWriter pw = new PrintWriter(bw);
	
		    //vnesemo podatke
        double spMeja = -2*Math.PI;
        double zgMeja = 2*Math.PI;
        double korak = Math.PI/3;
        double dolzina = Math.abs(spMeja) + Math.abs(zgMeja);
        int elementov = (int)(dolzina / korak + 1);
        
        //ustvarimo tabelo za vrednosti
        double tab[] = new double[elementov];
        int i = 0;
        
        //izracun in zapis vrednosti v tabelo
        for(double x = spMeja; x <= zgMeja; x += korak){
            double y = (Math.round((2 * Math.sin(3*x+Math.PI/3))*Math.pow(10,3)))/Math.pow(10, 3); //zaokrozimo vrednosti na 3 decimalke
            tab[i] = y;
            i++;
        }
        
        //naslovna vrstica v .csv datoteki
        pw.println("x, y");
        
        //zapis podatkov v datoteko
        double x = -2;
        for(int j = 0; j < tab.length; j++){
            try {
            	pw.println(x + "," + tab[j]);
            }
            catch (Exception E){
            	JOptionPane.showMessageDialog(null, "Napaka");
            }
            x += korak;
        }
        pw.close();
    }

}
