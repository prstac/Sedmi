import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadatak1 {

    /*
    Napišite program koji od korisnika učitava tekst u dvije varijable.
    U prvoj varijabli odvojeno razmakom ime i prezime, a u drugoj varijabli grad rođenja.
    Potrebno je ispisati ime i prezime,
    a ako je duljina imena veća od 7 znakova,
    tražiti korisnika da ponovi unos i ispisati mu poruku
    „Ime sadrži više od 7 znakova”.
    Razmaci prije i nakon imena i prezimena ne uzimaju se u obzir.
    Za grad rođenja potrebno je ispisati koje samoglasnike sadrži (provjera prema malim slovima).

    Primjer ispisa:
    Upišite ime i prezime:
    ”     Miro Mirić  ”
    Upišite grad rođenja:
    Varaždin
    upisali ste ime: Miro
    upisali ste prezime: Mirić
    grad ima samoglasnik a
    grad ima samoglasnik i

    bonus: prebrojati sve samoglasnike unutar rijeci grad
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] samoglasnici = { "a", "e", "i", "o", "u"};
        String ime = "";
        String prezime = "";
        String grad = "";
        boolean dozvoljenaDuljina = true;
        do {
            System.out.println("Upišite ime i prezime:");
            String imeIprezime = scanner.nextLine();

            System.out.println("Upišite grad rođenja:");
            grad = scanner.nextLine().trim();

            String trimmed = imeIprezime.trim();
            String[] imePrezimeArray = trimmed.split(" ");
            if (imePrezimeArray.length >= 1) {
                ime = imePrezimeArray[0];
            }
            if (imePrezimeArray.length >= 2) {
                prezime = imePrezimeArray[1];
            }

            System.out.println("Upisali ste ime: " + ime);
            System.out.println("Upisali ste prezime: " + prezime);

            if (ime.length() > 7) {
                dozvoljenaDuljina = false;
                System.out.println("Ime je dulje od 7 znakova, molimo ponovite unos");
            }
        } while (!dozvoljenaDuljina);

        int brojSvihSamoglasnika = 0;
        String[] gradArray = grad.toLowerCase().split("");
        for (String s : samoglasnici) {
            int brojac = 0;
            for (String znak : gradArray) {
                if (znak.equals(s)) {
                    brojac++;
                    if (brojac == 1) {
                        System.out.print("Grad ima samoglasnik: " + s);
                    }
                }
            }
            if (brojac > 0) {
                System.out.print(" " + brojac + " puta");
                System.out.println();
            }
            brojSvihSamoglasnika += brojac;
        }
        System.out.println("Ukupno " + brojSvihSamoglasnika + " samoglasnika");
    }

}
