package t3;

import java.util.Arrays;

public class ostaliUkazi {
    public static void main(String[] args){


        String s = " programiranje   ";
        String s2 = s.substring(4, 8);
        String s3 = s.substring(12);

        System.out.println("1 " + s2 + " " + s3.trim() + " 0.001 kg");


        String i = "rog";
        String i2 = "ra";

        System.out.println(s.indexOf(i));
        System.out.println(s.indexOf(i2, 5));
        System.out.println(s.lastIndexOf((int)'r', 6));


        System.out.println(s.replace('i', 'e').trim());
        System.out.println(s.toUpperCase().strip());
        System.out.println(s.trim());
        System.out.println(Arrays.toString(s.split("a")));
    }
}
