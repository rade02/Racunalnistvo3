package t3;

public class stringBuffer {
    public static void main(String[] args){

        String str = "Niz-besedila";
        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb.toString());
        System.out.println(sb.charAt(3));
        sb.setCharAt(3, '_');   //nastavi (zamenja znak) na indeksu
        System.out.println(sb);
        sb.insert(3, 'i');      //vstavi (vrine znak) na indeks
        System.out.println(sb);
        sb.delete(10, 13);      //briše znake [10, 13)
        System.out.println(sb);
        sb.replace(5, 10, "števil");    //izbriše [5, 10) in vrine nov niz
        System.out.println(sb);
        sb.append("_in_besed");
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.setLength(10);
        System.out.println(sb);
        System.out.println(sb.indexOf("ni"));
    }
}
