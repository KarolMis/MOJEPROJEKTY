package lekcja38;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new LinkedList<>();
        Random random = new Random();
        generate(ints,10, () -> random.nextInt(1000));
        consumeList(ints, x -> System.out.println(x+ " "));
        System.out.println();
        filterList(ints, x -> x % 2 == 0);
        consumeList(ints, x -> System.out.println(x+ " "));


    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }


    private static <T> void filterList(List<T> list, Predicate<T> pred) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tmp = it.next();
            if (pred.test(tmp)) {
                it.remove();
            }
        }
    }


    private static <T> void generate(List<T> list, int num, Supplier<T> sup) {
        for(int i=0; i<num; i++) {
            list.add(sup.get());
        }
    }
}
