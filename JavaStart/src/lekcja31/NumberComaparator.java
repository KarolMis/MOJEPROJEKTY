package lekcja31;

import java.util.Arrays;
import java.util.Comparator;

/*
Napisz program, w którym utworzysz tablicę 20 dowolnych liczb całkowitych,
 a następnie posortujesz tablicę w porządku rosnącym i malejącym,
  za każdym razem wyświetlając wynik posortowania na ekranie.
Wykorzystaj interfejs Comparator i anonimowe klasy wewnętrzne.
 */
public class NumberComaparator {
    public static void main(String[] args) {
        Integer[] ints = {1,20,2,19,3,18,4,17,5,16,6,15,7,14,8,13,9,12,10,11};
        System.out.println("Nieposortowana: " + Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println("Posortowana rosnąco: " + Arrays.toString(ints));

        Arrays.sort(ints, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer1, Integer integer2) {
                return -(integer1.compareTo(integer2));
            }
        });
        System.out.println("Posortowana malejąco: " + Arrays.toString(ints));
    }

}
