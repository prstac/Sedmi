import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // niz znakova - String
        String fakultet = "Fakultet organizacije i informatike Varaždin";
        String[] rijecFakultet = fakultet.split(" ");
        for(String s : rijecFakultet) {
            System.out.println(s);
        }

        List<String> niz = new ArrayList<>();
        niz = Arrays.stream(rijecFakultet).toList();

        char[] rijecFakultet2 = fakultet.toCharArray();

        String recenica = "   Danas je bio hladan dan  ";
        System.out.println(recenica);
        System.out.println("unos ima znakova: " + recenica.length());
        String recenicaTrimmed = recenica.trim();
        System.out.println("broj znakova nakon skracivanja je: " + recenicaTrimmed.length());
        System.out.println(recenicaTrimmed);
    }
}