public class RazsirjanjeNiza {
    public static void main(String[] args){

        String niz = "A6B2C4D4E1F3";

        int stevilo = 0;
        char znak = ' ';
        StringBuffer novNiz = new StringBuffer();

        int i = 0;
        while(i < niz.length()){

            if(Character.isDigit(niz.charAt(i))){
                stevilo = Integer.parseInt(Character.toString(niz.charAt(i)));
                znak = niz.charAt(i - 1);
                for(int j = 0; j < stevilo; j++)
                    novNiz.append(znak);
            }
            i++;
        }
        System.out.println(novNiz);
    }
}
