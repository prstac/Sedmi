import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vjezba2 {
    public static void main(String[] args) {

        // hint Character library (is digit)
        /*
            Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje koliko ima slova,
            koliko brojeva i koliko "ostalih znakova".
            Npr. ako je uneseni niz znakova "Danas je 27.02.2010.", program treba ispisati:

            Slova: 7
            Brojevi: 8
            Ostali znakovi: 5
         */

        Scanner scanner = new Scanner(System.in);
        String linija = scanner.nextLine();

        int brojSlova = 0;
        int brojBrojeva = 0;
        int brojOstalih = 0;
        for (int i = 0;  i < linija.length(); i++) {
            char znak = linija.charAt(i);
            if (Character.isAlphabetic(znak)) {
                brojSlova++;
            } else if (Character.isDigit(znak)) {
                brojBrojeva++;
            } else {
                brojOstalih++;
            }
        }
        System.out.println("Slova: " + brojSlova);
        System.out.println("Brojeva: " + brojBrojeva);
        System.out.println("Ostali znakovi: " + brojOstalih);

        // 2. zadatak
        // rijeci pomocu skenera obrnuti ijeci unazad
        /*
            Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i okrenuti redoslijed riječi u unesenom stringu. Prikazati transformirani string s obrnutim redoslijedom riječi.
            Primjer ulaza: Dobar dan svima
            Primjer izlaza: svima dan Dobar
        */

        String recenica = scanner.nextLine();
        String[] recenicaArray = recenica.split(" ");
        /*
        for (int j=0; j <  recenicaArray.length / 2; j++) {
            String rijec = recenicaArray[j];
            recenicaArray[j] = recenicaArray [recenicaArray.length -1 -j];
            recenicaArray [recenicaArray.length -1 -j] = rijec;
        }
        */

        for (int j = 0; j <  recenicaArray.length / 2; j++) {
            Collections.swap(Arrays.asList(recenicaArray), j, recenicaArray.length - 1 - j);
        }
        /*
        String obrnutaRecenica = "";
        for (String s : recenicaArray) {
            obrnutaRecenica  += " " + s;
        }
        obrnutaRecenica = obrnutaRecenica.trim();
         */
        String obrnutaRecenica = String.join(" ", recenicaArray);
        System.out.println(obrnutaRecenica);
    }
}
