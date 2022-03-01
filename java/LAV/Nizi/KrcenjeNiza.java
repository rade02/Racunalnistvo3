public class KrcenjeNiza {
    public static void main(String[] args){

        String niz = "AAAAAABBCCCCDDDDEFFF";

        int i = 0;
        StringBuffer novNiz = new StringBuffer();

        while(i < niz.length()){
            char a = niz.charAt(i);
            int stevec = 0;
            for(int j = i; j < niz.length(); j++){
                if(niz.charAt(j) != a)
                    break;
                else
                    stevec++;
            }
            novNiz.append(a + "" + stevec);
            i += stevec;
        }
        
        System.out.println(novNiz);

    }
}
