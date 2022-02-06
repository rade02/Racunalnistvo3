public class PariIndeksov {
    public static void main(String[] args)
    {
        int[] tab = new int[40];
        int ciljnaVsota = 15;

        for(int i = 0; i < tab.length; i++){
            tab[i] = (int)(Math.random()*11);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < tab.length; i++){
            for(int j = i; j < tab.length; j++){
                if(tab[i] + tab[j] == ciljnaVsota){
                    System.out.println("tab[" + i + "] + tab[" + j + "] == " + ciljnaVsota);
                }
            }
        }
    }
}
