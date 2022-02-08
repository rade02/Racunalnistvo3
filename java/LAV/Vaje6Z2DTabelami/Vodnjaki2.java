public class Vodnjaki2 {
    public static void main(String[] args)
    {
        int[][] obmocje = new int[50][50];
        int vodnjakov = 10;
        int[][] koordVodnjakov = new int[vodnjakov][2];

        for(int i = 0; i < vodnjakov; i++){
            int a = (int)(Math.random()*48 + 1);
            int b = (int)(Math.random()*48 + 1);
            obmocje[a][b] = 1;
            koordVodnjakov[i][0] = a;
            koordVodnjakov[i][1] = b;
        }
        
        izpisi(obmocje);
        System.out.println();

        
        int[] povrsineVodnjakov = povrsine(obmocje, vodnjakov, koordVodnjakov);

        int vsotaCelic = 0;
        for(int i = 0; i < povrsineVodnjakov.length; i++){
            vsotaCelic += (int)povrsineVodnjakov[i];
            System.out.print(povrsineVodnjakov[i] + " ");
        }
        System.out.println("\nVsota celic, ki jih pokrivajo vodnjaki: " + vsotaCelic);
    }

    public static int[] povrsine(int[][] obmocje, int vodnjakov, int[][] koordVodnjakov)
    {
        int[] povrsineVodnjakov = new int[vodnjakov]; //tabela z povrsinami vodnjakov
        //gremo cez celotno obmocje
        for(int i = 0; i < obmocje.length; i++){
            for(int j = 0; j < obmocje[0].length; j++){
                
                double min = 48; //najmanjsa razdalja
                int vodnjak = 0;
                for(int k = 0; k < povrsineVodnjakov.length; k++){
                    double razdalja = Math.sqrt(Math.pow(koordVodnjakov[k][0] - i, 2) + Math.pow(koordVodnjakov[k][1] - j, 2)); //odsteti moramo i in j, da dobimo dejansko razliko mde koordinatami vodnjaka in tocke
                    if(razdalja < min){
                        min = razdalja;
                        vodnjak = k;
                    }
                }
                povrsineVodnjakov[vodnjak]++;
            }
        }
        return povrsineVodnjakov;
    }

    public static void izpisi(int[][] obmocje)
    {
        for(int i = 0; i < obmocje.length; i++){
            for(int j = 0; j < obmocje[0].length; j++){
                System.out.print(obmocje[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
