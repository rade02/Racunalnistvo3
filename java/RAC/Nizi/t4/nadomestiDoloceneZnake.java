package t4;

public class nadomestiDoloceneZnake {
    public static void main(String[] args){

        String s = "Danes je lep dan! Jutri bo tudi lep dan, kot včeraj. Kakšen pa bo pojutrišnjem?";
        String znaki = ".,!?";
        StringBuffer sb = new StringBuffer(s);

        for(int i = 0; i < sb.length(); i++){
            if(znaki.contains(Character.toString(sb.charAt(i)))){
                sb.setCharAt(i, '#');
            }
        }
        System.out.println(sb);
    }

}
