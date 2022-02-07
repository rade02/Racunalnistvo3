public class OceneDijakov {
    public static void main(String[] args)
    {
        int dijakov = 32;
        int prof = 8;

        int redovalnica[][] = new int[dijakov][prof];

        redovalnica = nakljucneOcene(redovalnica);

        izpis(redovalnica);

        ocenePriProf(redovalnica, prof);
    }

    public static int[][] nakljucneOcene(int[][] tab)
    {
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tab[i][j] = (int)(Math.random()*5 + 1);
            }
        }
        return tab;
    }

    public static void izpis(int[][] tab)
    {
        int dijak = 0;
        double najPovp = 0;
        int najDijak = 0;
        for(int i = 0; i < tab.length; i++){
            double vsota = 0;
            System.out.print(((++dijak < 10) ? (" " + dijak):(dijak)) + ". dijak: ");
            for(int j = 0; j < tab[0].length; j++){
                vsota += tab[i][j];
                System.out.print(tab[i][j] + " ");
            }
            double povprecje = vsota/tab[0].length;
            if(povprecje > najPovp){
                najPovp = povprecje;
                najDijak = dijak;
            }
            System.out.println(" povprecje: " + povprecje);
        }
        System.out.println();
        System.out.println(najDijak + ". dijak ima najboljse povprecje: " + najPovp);
    }

    public static void ocenePriProf(int[][] tab, int prof)
    {
        double[] profesorji = new double[prof];
        for(int i = 0; i < tab[0].length; i++){
            double vsota = 0;
            for(int j = 0; j < tab.length; j++){
                vsota += tab[j][i];
            }
            profesorji[i] += (vsota/tab.length);
        }

        int profesor = 0;
        int najzahtevnejsi = 0;
        double najslabsePovpr = 5;
        for(int i = 0; i < profesorji.length; i++){
            if(profesorji[profesor] < najslabsePovpr){
                najslabsePovpr = profesorji[profesor];
                najzahtevnejsi = profesor + 1;
            }
            System.out.println("Povprecje pri " + ++profesor + ". profesorju je: " + profesorji[profesor - 1]);
        }
        System.out.println("Najzahtevnejsi profesor je " + najzahtevnejsi + ". profesor, saj ima povprecno oceno: " + najslabsePovpr);
    }
}
