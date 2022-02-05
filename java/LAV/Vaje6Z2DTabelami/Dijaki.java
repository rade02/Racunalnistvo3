public class Dijaki {
    public static void main(String[] args){

        int dijakov = 32;
        int prof = 8;
        int[][] redovalnica = new int[dijakov][prof];
        double[][] povprecne = new double[dijakov][1];

        //izpis dijakov, njihovih ocen in povprecih ocen
        int stDijaka = 1;
        for(int i = 0; i < redovalnica.length; i++){
            System.out.print(((stDijaka < 10) ? (" " + stDijaka):(stDijaka)) + ". dijak: ");
            double vsotaOcen = 0;

            for(int j = 0; j < redovalnica[0].length; j++){
                redovalnica[i][j] = (int)(Math.random()*5 + 1);
                System.out.print(redovalnica[i][j] + " ");
                vsotaOcen += redovalnica[i][j];
            }

            double povprOcena = vsotaOcen / prof;
            povprecne[i][0] = povprOcena; //zapis povprecnih ocen vsakega dijaka v tabelo
            System.out.println(" Povprecna ocena je " + povprOcena);
            stDijaka++;
        }
        System.out.println();


        //najboljsa povprecna ocena
        double najOce = 0;
        int najDijak = 1;
        for(int i = 0; i < povprecne.length; i++){
            if(povprecne[i][0] > najOce){
                najDijak = i + 1;
                najOce = povprecne[i][0];
            }
        }
        System.out.println(najDijak + ". dijak ima najboljso povprecno oceno: " + najOce + ".");


        //prof z najslabso povprecno oceno
        double najsl = 5;
        int najslProf = 0;
        for(int i = 0; i < redovalnica[0].length; i++){
            double vsota = 0;
            int j = 0;
            for(;j < redovalnica.length; j++){
                vsota += redovalnica[j][i];
            }
            double povp = vsota / dijakov;
            if(povp < najsl){
                najsl = povp;
                najslProf = i;
            }
        }
        System.out.println("Najslabse povprecje ocen je pri profesorju " + najslProf + ", in sicer " + najsl + ".");
        System.out.println();
    }
}
