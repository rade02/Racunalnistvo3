package Nizi;
import java.util.Arrays;

public class NiziMetode {
    public static void main(String[] args){
        String niz = "Danes je lep dan.";
        String podniz = "dan";
        String csv = "dan; noc; jutro";
        String niz2 = " jutri bo\nlep dan";
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        //METODE STRING:
        //niz.codePointAt(2)   //katera UNICODE code point je na tem indeksu
        //niz.codePointCount(2, 5) //koliko UNICODE code pointov je med dvema indeksoma
        //niz.compareTo(podniz)    //leksikografsko primerja niza (uposteva Case), ce je podniz po abecedi pred nizom, vrne int > 0, ce je podniz po abecedi za nizom, vrne int < 0, ce sta niza eneka vrne 0 (ce sta niza enaka, le da ima en vec crk, bo tisti z vec crkami za prvim nizom)
        //niz.compareToIgnoreCase(podniz)   //leksikografsko primerja niza (ne uposteva Case), ce je podniz po abecedi pred nizom, vrne int > 0, ce je podniz po abecedi za nizom, vrne int < 0, ce sta niza eneka vrne 0 (ce sta niza enaka, le da ima en vec crk, bo tisti z vec crkami za prvim nizom)
        //niz.concat(podniz)    //doda podniz na konec niza
        //niz.contains("dAn")   //vrne logicno vrednost, glede na to, ali je "dAn" vsebovan v niz (uposteva Case)
        //niz.contentEquals(podniz) //vrne logicno vrednost glede na to, ali je vsebina podniza enaka vsebini niza
        //niz.endsWith(podniz)  //vrne logicno vrednost glede na to, ali se niz konca s podnizom
        //niz.equals(podniz)    //vrne logicno vrednost glede na to, ali je podniz enak nizu (uposteva Case)
        //niz.equalsIgnoreCase(podniz)  //vrne logicno vrednost glede na to, ali je podniz enak nizu (ne uposteva Case)
        //niz.getBytes()    //vrne array bajtov od znakov iz ASCII tabele (izpis: System.out.println(Arrays.toString(niz.getBytes()));)
        //niz.hashCode()    //vrne hash code niza
        //niz.indent(n)     //vstavi presledke (n > 0), odstrani presledke (n < 0) na zacetku niza
        //niz.indexOf('a')  //vrne indeks, na katerem se prvic pojavi znak
        //niz.indexOf('a', 3)   //vrne indeks, na katerem se prvic pojavi znak, zacne iskati pri indeksu 3
        //niz.indexOf(podniz, 2)    //vrne indeks, na katerem se prvic pojavi niz, zacne iskati pri indeksu 2
        //niz.isEmpty()     //vrne true, ce je niz prazen ali ce vsebuje le presledke, drugace false
        //niz.lastIndexOf('a', 13)  //vrne indeks prvega pojava danega znaka iz zadnje strani, zacne iskati pri indeksu 13 in gre proti 0
        //niz.lastIndexOf("lep", 13)    //vrne indeks prvega znaka prvega pojava danega niza iz zadnje strani, zacne iskati pri 13
        //niz.length()  //vrne dolzino niza
        //niz.offsetByCodePoints(3, 4)  //vrne indeks, ki je od prvega indeksa (3) oddaljen za drugi argument (4)
        //niz.repeat(3) //vrne niz, ki je sestavljen iz 3x prvotnega niza (konkatenacija istega niza)
        //niz.replace('a', 'b') //vrne niz, v katerem so zamenjani znaki 'a' z znaki 'b'
        //niz.replace("lep", "soncen")  //vrne niz, v katerem so zamenjani nizi "lep" z nizi "soncen"
        //csv.split(";", 2)    //vrne array dveh (2) nizov, ki so bili v csv loceni z ";"
        //niz.startsWith("lep", 9) //vrne logicno vrednost glede na to, ali se niz od indeksa 9 zacne z "lep"
        //niz.strip()   //vrne niz, ki je enak prvotnemu, le da mu odstrani vse prazne znake na zacetku in koncu
        //niz2.stripIndent()    //vrne niz, ki je enak prvotnemu, le da mu odstrani na zacetku vsake vrstice toliko prazne znake, kolikor jih je odstranil vrstici z najmanj praznimi znaki na zacetku (dobimo vsaj eno vrstico brez praznih znakov na zacetku)
        //niz.stripLeading()    //vrne niz, ki je enak prvotnemu, le da mu odstrani vse prazne znake na zacetku
        //niz.stripTrailing()   //vrne niz, ki je enak prvotnemu, le da mu odstrani vse prazne znake na koncu
        //niz.subSequence(n, m) //vrne zaporednje znakov (niz), ki so na indeksih [n, m) v prvotnem nizu
        //niz.substring(n, m)   //vrne podniz prvotnega niza, ki je na indeksih [n, m) v prvotnem nizu
        //niz.toCharArray()     //vrne array znakov, narejen iz niza
        //niz.toLowerCase()     //vrne niz, ki ima vse znake male
        //niz.toUpperCase()     //vrne niz, ki ima vse znake velike
        //niz.trim()    //vrne niz, ki je enak prvotnemu, le da mu odstrani vse prazne znake (ki imajo ASCII kodo <= 'U+0020') na zacetku in koncu
        //niz.valueOf(true) //vrne niz, ki predstavlja logicni argument
        //niz.valueOf('c')  //vrne niz, ki predstavlja znakovni argument
        //niz.valueOf(c, 3, 4)    //vrne niz, ki predstavlja argument char[] c, pri tem vzame znake na indeksih [3, 3 + 4)
        //niz.valueOf(double / float / int / long / Object)

        System.out.println(Arrays.toString(niz.toCharArray()));

    }
}
