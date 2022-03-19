package t2;

public class sestevanje {
    public static void main(String[] args){

        String s1 = "12";
        String s2 = "13 ";

        int a = Integer.valueOf(s1);//.intValue();
        int b = Integer.parseInt(s2.trim());

        System.out.println(a + b);


        String s3 = "1.32";
        String s4 = "  3.1415926";

        float c = Float.valueOf(s3);//.floatValue();
        double d = Double.parseDouble(s4.strip());

        System.out.println(c + d);


        String z = "A";

        char znak = z.charAt(0);

        System.out.println(znak);
        System.out.println(423);
    }
}
