package t3;

public class sbNaloge {
    public static void main(String[] args){

        String niz = "Danes je lep dan. Upamo, da bo na današnji prireditvi čim več obiskovalcev. Lansko leto jih je bilo 300, predlansko pa 270. V stavbi je prosotra za 400 obiskovalcev.";

        StringBuffer sb = new StringBuffer(niz);

        //katera beseda se najveckrat ponovi??
        //..
    
        //koliko je presledkov
        int stPresledkov = 0;
        for(int i = 0; i < sb.length(); i++){
            if(Character.isWhitespace(sb.charAt(i)))
                stPresledkov++;
        }
        System.out.println(stPresledkov);
    }
}
