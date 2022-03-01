public class BesedeSamoglSogl {
    public static void main(String[] args)
    {
        String besedilo = "Besedilo je po slovarju slovenskega knjižnega jezika z določenimi besedami izražena misel, vendar vsako besedno sporočilo še ni besedilo. Mednje prištevamo le tista sporočila, ki imajo prepoznavno temo in namen, so sovisna in vsebinsko ter oblikovno zaokrožena.";

        int stBesed = 1;
        String samoglasniki = "aeiouAEIOU";
        int stSamoglasnikov = 0;
        int stSoglasnikov = 0;
        int stLocil = 0;
        int stZnakovSPresledki = 0;
        int stZnakovBrezPresledkov = 0;

        for(int i = 0; i < besedilo.length(); i++)
        {
            if(besedilo.charAt(i) == ' ')
                stBesed++;
            else
                stZnakovBrezPresledkov++;

            if(Character.isLetter(besedilo.charAt(i)))
            {
                boolean jeSamoglasnik = false;
                for(int j = 0; j < samoglasniki.length(); j++)
                {
                    if(besedilo.charAt(i) == samoglasniki.charAt(j))
                    {
                        jeSamoglasnik = true;
                        stSamoglasnikov++;
                        break;
                    }
                }
                if(!jeSamoglasnik) stSoglasnikov++;
            }
            else    //ce ni crka, je lahko stevilo ali presledek ali locilo
            {
                if(!Character.isDigit(besedilo.charAt(i)) && !Character.isWhitespace(besedilo.charAt(i)))
                    stLocil++;
                
                /*try     //poskusimo ce je stevilo (ce ga lahko brez napake parsamo v integer)
                {
                    Integer.parseInt(Character.toString(besedilo.charAt(i)));
                } catch (NumberFormatException e)   
                    {   //ce pride do napake in znak ni presledek, je locilo
                        if(!(Character.isWhitespace(besedilo.charAt(i))))
                            stLocil++;
                    }*/
            }
            stZnakovSPresledki++;
        }

        System.out.println("V besedilu je:\n" + stBesed + " besed, znakov je " + stZnakovSPresledki + " (brez presledkov " + stZnakovBrezPresledkov + ").\nSamoglasnikov je " + stSamoglasnikov + ", soglasnikov je " + stSoglasnikov + ", locil je " + stLocil + ".");
    }
}
