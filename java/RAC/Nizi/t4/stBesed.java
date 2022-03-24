package t4;

public class stBesed {
    public static void main(String[] args){

        String s = "Danes je lep dan. Jutri bo tudi lep dan.";
        System.out.println(kolikoBesed(s));
    }

    public static int kolikoBesed(String s){

        String[] a = s.split(" ");
        int stevecBesed = 0;
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals("")){
                stevecBesed++;
            }
        }
        return stevecBesed;
    }
}
