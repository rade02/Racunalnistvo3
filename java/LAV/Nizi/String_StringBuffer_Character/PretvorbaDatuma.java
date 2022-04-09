package String_StringBuffer_Character;
import java.util.Arrays;
import java.util.Scanner;

public class PretvorbaDatuma {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Vnesi datum (dd.mm.yyyy): ");
        String vnos = s.nextLine();
        s.close();

        String[] podatki = vnos.split("\\.");

        System.out.println(vnos);
        System.out.println(Arrays.toString(podatki));

        boolean napaka = false;
        switch(podatki[1]){
            case "1": podatki[1] = "januar"; break;
            case "2": podatki[1] = "februar"; break;
            case "3": podatki[1] = "marec"; break;
            case "4": podatki[1] = "april"; break;
            case "5": podatki[1] = "maj"; break;
            case "6": podatki[1] = "junij"; break;
            case "7": podatki[1] = "julij"; break;
            case "8": podatki[1] = "avgust"; break;
            case "9": podatki[1] = "september"; break;
            case "10": podatki[1] = "oktober"; break;
            case "11": podatki[1] = "november"; break;
            case "12": podatki[1] = "december"; break;
            default: napaka = true;
        }

        System.out.println((napaka) ? ("Napacen vnos"):(podatki[0] + ". " + podatki[1] + " " + podatki[2]));
    }
}
