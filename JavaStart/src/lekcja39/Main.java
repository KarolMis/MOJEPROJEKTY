package lekcja39;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jacek","adam", "grażyna", "tomek", "Ewa");

        Collections.sort(names, String::compareToIgnoreCase);

        for (String name: names) {
            System.out.println(name);
        }
    }
}
