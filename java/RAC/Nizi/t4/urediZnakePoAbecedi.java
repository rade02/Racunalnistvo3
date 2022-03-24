package t4;

public class urediZnakePoAbecedi {
    public static void main(String[] args){
        String str = "Danes je lep dan. Jutri bo tudi lep dan.";
        StringBuffer sb = new StringBuffer(str);

        urediZnake(sb);
    }

    public static void urediZnake(StringBuffer a){

        for(int i = 0; i < a.length() - 1; i++){
            //najdemo najmanjsi znak (prvi po abecedi)
            char najmanjsi = a.charAt(i + 1);
            int indeksNajmanjsega = i + 1;
            for(int j = i + 1; j < a.length(); j++){
                if(najmanjsi > a.charAt(j)){
                    najmanjsi = a.charAt(j);
                    indeksNajmanjsega = j;
                }
            }

            if(najmanjsi < a.charAt(i)){
                char tmp = a.charAt(i);
                a.setCharAt(i, najmanjsi);
                a.setCharAt(indeksNajmanjsega, tmp);
            }

        }
        System.out.println(a.toString().trim());
    }
}
