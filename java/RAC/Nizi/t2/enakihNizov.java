package t2;

public class enakihNizov {
    public static void main(String[] args){

        String[] s = {"dan", "jutro", "dan", "noc", "dan"};
        int stevilo = 0;
        
        //dela samo do trikratnega ponavljanja enega elementa
        for(int i = 0; i < s.length - 1; i++){
            for(int j = i + 1; j < s.length; j++){
                if(s[i].equals(s[j]))
                    stevilo++;
            }
        }
        System.out.println(stevilo);
    }
}
