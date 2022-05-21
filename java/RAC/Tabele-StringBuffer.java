import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*String s1="xyz";
        String s2="xyz";
        String s3= new String("xyz");
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        */

        int[] tab = new int[] {3, 8, 2, 1, 8, 9, 4, 2};
        int vsota = 0;
        int idx = 0;
        int max = tab[0];
        for(int i = 0; i < tab.length; i++){
            vsota += tab[i];
            if(i % 2 == 0) System.out.println(tab[i]);
            if(tab[i] > max){
                max = tab[i];
                idx = i;
            }
        }
        System.out.println((double)vsota/tab.length +" tab[" + idx + "] = " + max);

        boolean menjaj = true;
        int neurejeni = tab.length;
        while(menjaj){
            menjaj = false;
            neurejeni--;
            for(int i = 0; i < neurejeni; i++){
                if(tab[i] > tab[i + 1]){
                    int tmp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tmp;
                    menjaj = true;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
        for(int i = tab.length - 1; i > tab.length - 4; i--){
            System.out.print(tab[i] + " ");
        }

        float y, zacetek = -2, konec = 2, korak = 0.5f;
        int i = 0;
        float[][] tabela = new float[2][(int) (Math.abs(konec - zacetek) / korak + 1)];
        for(float x = -2; x <= 2; x += korak){
            tabela[0][i] = x;
            tabela[1][i] = 2*x + 1;
            i++;
        }
        System.out.println(Arrays.toString(tabela[0]) + "\n" + Arrays.toString(tabela[1]));

        for(int a = tabela[0].length-1; a >= 0; a--)
            System.out.print(tabela[1][a] + " ");

        int[] t = {4, 2, 1, 6, 2, 7, 8, 9, 5};
        int soda = 0, liha = t.length-1;
        for(int j = 0; j < t.length; j++){
            if(t[j] % 2 == 0){
                int tmp = t[j];
                t[j] = t[soda];
                t[soda] = tmp;
                soda++;
            }
            else{
                int tmp = t[j];
                t[j] = t[liha];
                t[liha] = tmp;
                liha--;
            }
        }
        System.out.println(Arrays.toString(t));

        /*int ur = 0, nu = ur + 1;
        for(int l = nu; l < t.length; l++){
            for(int j = ur; j < nu; j++){
                if(t[j] > t[nu]){
                    int tmp = t[nu];
                    for(int k = nu - 1; k >= j; k--){
                        t[k + 1] = t[k];
                    }
                    t[j] = tmp;
                }
            }
            ur++;
            nu++;
        }
        System.out.println("-" + Arrays.toString(t));
        */

        int tab1[][] = new int[3][6];
        for(int i1 = 0; i1 < tab1.length; i1++){
            tab1[0][i1] = 2;
            tab1[2][i1] = 1;
        }
        System.out.println(Arrays.toString(tab1[0]) + " " + Arrays.toString(tab1[1]) + " " + Arrays.toString(tab1[2]));
    
        int[][] ta = new int[5][3];
        for(int j = 0; j < ta.length; j++){
            for(int k = 0; k < ta[0].length; k++){
                ta[j][k] = 1;
                if(k == 0) ta[j][k] = 2;
                if(j == ta[0].length-1) ta[j][k] = 3;
            }
        }
        System.out.println(Arrays.toString(ta[0]) + " " + Arrays.toString(ta[1]) + " " + Arrays.toString(ta[2]));

        int[][] a = new int[4][4];
        for(int j = 0; j < a.length; j++){
            for(int k = 0; k < a[0].length; k++){
                //if(j >= k) a[j][k] = 1;
                //if(j == 0 || j == a[0].length - 1 || k == 0 || k == a.length - 1) a[j][k] = 1;
                //if((j + k) % 2 == 0) a[j][k] = 1;
                if(j + k < a.length - 1) a[j][k] = 1;
                System.out.print(a[j][k] + " ");
            }
            System.out.println();
        }
        
        int[][] aa = new int[5][5];
        for(int j = 0; j < aa.length; j++){
            for(int k = 0; k < aa[0].length; k++){
                //if(j % 2 != 0 || k % 2 == 0) aa[j][k] = 1;
                if(j == k || j + k == aa.length - 1) aa[j][k] = 1;
                System.out.print(aa[j][k] + " ");
            }
            System.out.println();
        }

        /*int[][] aaa = new int[5][5];
        for(int j = 0; j < aaa.length; j++){
            
        }
        */


        String niz = "";
        String n = new String();
        char[] đ = {'a', 'b', 'c'};
        String w = new String(đ);
        System.out.println(đ);

        int dolzina = niz.length();

        String e = "Danes je lep dan";
        int presledkov = 0;
        for(int j = 0; j < e.length(); j++){
            for(int k = 0; k < presledkov; k++) System.out.print(" ");
            System.out.println(e.charAt(j));
            presledkov++;
        }

        String kl = "a?bc ba";
        boolean pal = true;
        for(int j = 0; j <= kl.length()/2; j++){
            if((kl.charAt(j) != kl.charAt((kl.length() - 1 - j)))){
                pal = false;
                break;
            }
        }
        System.out.println(pal);

        int crkA = 0, stSam = 0;
        String drugi = "";
        char[] s = new char[] {'a', 'e', 'i', 'o', 'u'};
        for(int j = 0; j < kl.length(); j++){
            if(Character.isLetter(kl.charAt(j)) || Character.isDigit(kl.charAt(j))) drugi += kl.charAt(j);
            if(kl.charAt(j) == 'a') crkA++;
            for(int k = 0; k < s.length; k++){
                if(kl.charAt(j) == s[k]) stSam++;
            }
        }
        drugi = drugi.toUpperCase();
        for(int j = 0; j < drugi.length(); j++){
            if(j % 2 == 0) System.out.println(drugi.charAt(j));
        }
        System.out.println(crkA + " " + stSam + " " + drugi);

        String st = "23";
        int ss = Integer.parseInt(st);
        int s2 = Integer.valueOf(st).intValue();

        int st2 = 23;
        String ss2 = String.valueOf(st2);
        String s3 = Integer.toString(st2);

        String st3 = "a";
        char m = st.charAt(0);

        String prvi1 = "abcded";
        String drugi1 = "abcdef";
        System.out.println(prvi1.equalsIgnoreCase(drugi1));
        System.out.println(prvi1.compareTo(drugi1));

        String niz1 = "abcdefgh";
        String niz2 = "aaadefgh";
        String niz3 = "aaa";
        String niz4 = "Abcdefgh";
        System.out.println(niz1.compareTo(niz3)); //izpis: 1 (b – a)
        System.out.println(niz3.compareTo(niz1)); //izpis: -1 (a – b)
        System.out.println(niz4.compareTo(niz1)); //izpis: -32 (A – a)
        System.out.println(niz4.compareToIgnoreCase(niz1)); //izpis: 0 (sta enaka)
    
        System.out.println(niz2.startsWith(niz3));
        System.out.println(niz2.startsWith(niz3, 1));
        System.out.println(niz2.endsWith(niz3));

        String[] tabel = {"danes", "jutri", "miza", "okno", "stol", "novica", "avto", "avion", "navitje"};
        String zlog = new String("av");
        int stZlogov = 0;
        for(int j = 0; j < tabel.length; j++){
            if(tabel[j].startsWith("da")) System.out.println(tabel[j]);
            if(tabel[j].endsWith("iza")) System.out.println(tabel[j]);
            for(int k = 0; k < tabel[j].length(); k++){
                if(tabel[j].startsWith(zlog, k)) stZlogov++;
            }

            boolean menjaj1 = true;
            int neurejenih = tabel.length;
            while(menjaj1){
                menjaj1 = false;
                neurejenih--;
                for(int k = 0; k < neurejenih; k++){
                    if(tabel[k].length() > tabel[k + 1].length()){
                        String tm = tabel[k];
                        tabel[k] = tabel[k+1];
                        tabel[k+1] = tm;
                        menjaj1 = true;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(tabel) + " " + stZlogov);
        int[] dolzine = new int[tabel.length];
        for(int j = 0; j < tabel.length; j++){
            dolzine[j] = tabel[j].length();
        }
        System.out.println(Arrays.toString(dolzine));

        String vn = "Danes je lep dan in jutri bo tudi lep dan, upamo, da bo tudi pojutrisnjem!";
        String[] besede = vn.split(" ");
        int zacZDan = 0;
        int[] dol = new int[besede.length];
        int najdInd = 0, najd = besede[0].length(), najmInd = 0, najm = besede[0].length();
        int predlogov = 0;
        String zlog1 = "la";
        int pojavitevLa = 0;
        for(int j = 0; j < besede.length; j++){
            int dolzina1 = 0;
            for(int k = 0; k < besede[j].length(); k++){
                if(Character.isLetter(besede[j].charAt(k)))
                    dolzina1++;
                if(besede[j].startsWith(zlog1, k)) pojavitevLa++;
            }
            dol[j] = dolzina1;
            if(dolzina1 > najd){
                najd = dolzina1;
                najdInd = j;
            }
            if(dolzina1 < najm){
                najm = dolzina1;
                najmInd = j;
            }
            if(dolzina1 <= 2) predlogov++;
            if(besede[j].toLowerCase().startsWith("dan")) zacZDan++;
        }
        System.out.println(zacZDan + " " + Arrays.toString(dol) + " besede[" + najmInd + "] = " + najm + " besede[" + najdInd + "] = " + najd + " " + predlogov + " " + pojavitevLa);
        
        String n1 = "nizZnakov";
        String n2 = n1.substring(3, 7);
        int IndexZnaka = n1.indexOf('a', 3);
        int IndexNiza = n1.indexOf("nako", 2);
        int LIndexNiza = n1.lastIndexOf("nako", 8);
        System.out.println(n2 + " " + IndexZnaka + " " + IndexNiza + " " + LIndexNiza);
    
        String niz5 = " staramama ";
        System.out.println(niz5.indexOf('a'));
        System.out.println(niz5.indexOf("a"));
        System.out.println(niz5.lastIndexOf("ma"));
        System.out.println(niz5.indexOf("a", 5));
    
        niz5.replace('a', 't');
        niz5.toUpperCase();
        niz5.trim();
        System.out.println(niz5);
        String[] tabelaNizov = niz5.split("a");


        StringBuffer sb = new StringBuffer("stringbuffer");
        System.out.println(sb.capacity() + " " + sb.length() + " " + sb.charAt(4));
        sb.setCharAt(8, 't');
        System.out.println(sb.toString());
        sb.insert(8, 't');
        sb.delete(0, 6);
        sb.deleteCharAt(4);
        System.out.println(sb.toString());
        
        sb.replace(2, 4, "rg");
        System.out.println(sb.toString() + " " + sb.reverse());
        sb.reverse();
        sb.append(" joint");
        System.out.println(sb.toString());

        sb.setLength(11);
        System.out.println(sb.toString() + " " + sb.indexOf("urge"));

        StringBuffer sb1 = new StringBuffer("sdjcyx");
        System.out.println(sb.compareTo(sb1));
        System.out.println(sb.equals(sb1) + " ");
        
        StringBuffer vn2 = new StringBuffer(vn);
        int presledkov1 = 0, sa = 0, povedi = 0, indexZadnjePike = vn2.lastIndexOf("."), indexNizaLa = vn2.indexOf("la");
        String samogl = "aeiou";
        for(int j = 0; j < vn2.length(); j++){
            if(Character.isWhitespace(vn2.charAt(j))) presledkov1++;
            for(int k = 0; k < samogl.length(); k++){
                if(Character.toLowerCase(vn2.charAt(j)) == samogl.charAt(k)) sa++;
            }
            if(vn2.charAt(j) == '.') povedi++;
        }
        
        String n4 = "?danes, je! lep dan.";
        obrniBesedniRed(n4);
        System.out.println(obrniBesedniRed(n4));
        urediZnake(new StringBuffer(n4));

        System.out.println(Integer.toString(stBesed(n4)));
        System.out.println(nadomestiLocila(new StringBuffer(n4)));
        System.out.println(izbrisiZnake(new StringBuffer(n4), 1));
    }

    public static StringBuffer obrniBesedniRed(String n){
        String[] a = n.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = a.length-1; i >= 0; i--){
            sb.append(a[i] + " ");
        }
        return sb;
    }

    public static void urediZnake(StringBuffer a){
        boolean menjaj = true;
        int neurejeni = a.length();
        while(menjaj){
            menjaj = false;
            neurejeni--;
            for(int i = 0; i < neurejeni; i++){
                if(a.charAt(i) > a.charAt(i+1)){
                    char tmp = a.charAt(i);
                    a.setCharAt(i, a.charAt(i+1));
                    a.setCharAt(i+1, tmp);
                    menjaj = true;
                }
            }
        }
        System.out.println(a.toString());
    }

    public static int stBesed(String a){
        String[] b = a.split(" ");
        return b.length;
    }

    public static StringBuffer nadomestiLocila(StringBuffer a){
        for(int i = 0; i < a.length(); i++){
            if(!(Character.isLetter(a.charAt(i)) || Character.isDigit(a.charAt(i)) || Character.isWhitespace(a.charAt(i)))){
                a.setCharAt(i, '#');
            }
        }
        return a;
    }

    public static StringBuffer izbrisiZnake(StringBuffer a, int st){
        if(st == 0){
            for(int i = 0; i < a.length(); i++){
                if(i % 2 == 0 && !Character.isWhitespace(a.charAt(i))) a.deleteCharAt(i);
            }
            return a;
        }
        else if(st == 1){
            for(int i = 0; i < a.length(); i++){
                if(i % 2 != 0 && !Character.isWhitespace(a.charAt(i))) a.deleteCharAt(i);
            }
            return a;
        }
        else return a;
    }
}
