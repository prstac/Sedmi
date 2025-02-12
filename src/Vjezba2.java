import jdk.jfr.Unsigned;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

        System.out.println("Unesite recenicu");
        Scanner scanner = new Scanner(System.in);
        String linija = scanner.nextLine();
        pobroji(linija);

        // 2. zadatak
        // rijeci pomocu skenera obrnuti ijeci unazad
        /*
            Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i okrenuti redoslijed riječi u unesenom stringu. Prikazati transformirani string s obrnutim redoslijedom riječi.
            Primjer ulaza: Dobar dan svima
            Primjer izlaza: svima dan Dobar
        */
        System.out.println("Unesite recenicu:");
        String recenica = scanner.nextLine();
        System.out.println("Obrnuta recenica je:");
        System.out.println(obrniRecenicu(recenica));
    }

    public static String obrniRecenicu(String recenica) {
        List<String> recenicaList = Arrays.stream(recenica.split(" ")).toList();
        for (int j = 0; j <  recenicaList.size() / 2; j++) {
            Collections.swap(recenicaList, j, recenicaList.size() - 1 - j);
        }
        return String.join(" ",recenicaList);
    }

    public static void pobroji(String recenica) {
        int brojSlova = 0;
        int brojBrojeva = 0;
        int brojOstalih = 0;
        for (char znak : recenica.toCharArray()) {
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
    }
}
