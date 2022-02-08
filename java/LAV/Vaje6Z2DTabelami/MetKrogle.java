package vaje2dtabele;

public class MetKrogle {
    public static void main(String[] args)
    {
        int tekmovalcev = 12;
        int metov = 6;

        int[][] r = new int [tekmovalcev][metov];

        int tekmovalec = 0;
        for(int i = 0; i < r.length; i++){
            double vsota = 0;
            int veljavni = 0;
            System.out.print(((++tekmovalec < 10) ? (" " + tekmovalec):(tekmovalec)) + ". tekmovalec: ");
            for(int j = 0; j < r[0].length; j++){
                r[i][j] = (int)(Math.random()*9);
                System.out.print(r[i][j] + " ");
                if(r[i][j] != 0){
                    veljavni++;
                    vsota += r[i][j];
                }
            }
            double povprecje = vsota/veljavni;
            System.out.format(", povprecje: %.3f ", povprecje);
            System.out.println();
        }
        System.out.println();

        //po serijah
        int serija = 0;
        for(int i = 0; i < r[0].length; i++){
            double vsota1 = 0;
            int veljavni1 = 0;
            for(int j = 0; j < r.length; j++){
                if(r[j][i] != 0){
                    veljavni1++;
                    vsota1 += r[j][i];
                }
            }
            double povprecje1 = vsota1/veljavni1;
            System.out.format(++serija + ". serija povprecje: %.3f", povprecje1);
            System.out.println();
        }
    }
}
