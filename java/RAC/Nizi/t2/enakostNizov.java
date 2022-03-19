package t2;

public class enakostNizov {
    public static void main(String[] args){

        String s1 = "mama";
        String s2 = "Mama";
        String s3 = "MAMA";
        
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s3.equals(s1));

    }
}
