public class IndeksNajmanjsega {
    public static void main(String[] args){

        int[] a = new int[10];
        int stevilDo = 10;
        int min = stevilDo;
        int imin = 0;

        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*stevilDo);
            System.out.print(a[i] + " ");
            if(a[i] < min){
                min = a[i];
                imin = i;
            }
        }
        System.out.println();
        System.out.println("Najmanjsi element je: a[" + imin + "] = " + min + ".");

    }
}
