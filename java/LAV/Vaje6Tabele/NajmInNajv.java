public class NajmInNajv {
    public static void main(String[] args){
      
        int tab[] = new int[6];
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int)(Math.random()*10);
            System.out.print(tab[i] + " ");
        }
        int max = tab[0], min = tab[0];
        for(int j = 0; j < tab.length; j++){
            if(tab[j] > max){
                max = tab[j];
            }
            else if(tab[j] < min){
                min = tab[j];
            }
        }
        System.out.println();
        System.out.println("max = " + max + ", min = " + min);
    }
}
