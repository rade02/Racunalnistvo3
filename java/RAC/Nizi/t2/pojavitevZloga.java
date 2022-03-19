package t2;

public class pojavitevZloga {
    public static void main(String[] args){

        String[] s = {"avto", "motor", "avtobus", "avion", "vlak", "avdav"};
        String zlog = "av";
        int pojavitev = 0;

        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i].length(); j++){
                if(s[i].startsWith(zlog, j)){
                    pojavitev++;
                }
            }
        }

        System.out.println(pojavitev);

    }
}
