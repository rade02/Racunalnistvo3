public class ObrVrstniRedBesed {
    public static void main(String[] args){

        String niz = "leva sredina desna";

        String[] besede = niz.split(" ");

        StringBuffer novNiz = new StringBuffer();
        for(int i = besede.length - 1; i >= 0; i--){
            novNiz.append(besede[i] + " ");
        }

        System.out.println(novNiz);
        
    }
}
