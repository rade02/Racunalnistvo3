public class UrejanjeCrkPoAbecedi {
    public static void main(String[] args){

        String niz = "We can check whether the given character in a string is a number/letter by using isDigit() method of Character class.";

        StringBuffer crke = new StringBuffer();
        StringBuffer koncen = new StringBuffer();

        int od = 97;   //ASCII za 'a'
        int do1 = 98;    //ASCII za 'b'

        for(int i = 0; i < niz.length(); i++){
            if(Character.isLetter(niz.charAt(i))){
                char c = Character.toLowerCase(niz.charAt(i));
                crke.append(c);
            }
        }
        
        while(do1 != 123){
            for(int j = 0; j < crke.length(); j++){
                if(((byte)(crke.charAt(j))) < do1 && ((byte)(crke.charAt(j))) >= od)
                    koncen.append(crke.charAt(j));
            }
            od++;
            do1++;
        }

        System.out.println(koncen);
    }
}
