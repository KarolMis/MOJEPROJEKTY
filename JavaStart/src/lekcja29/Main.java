package lekcja29;

public class Main {
    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("one", "two");
        Pair<Integer, String> pair2 = new Pair<>(90, "Ka");
        Pair<String, Double> pair3 = new Pair<>("Dua", 90.90009);
        print("siemka", 90);
        print(90.90, "elo");

        printPair(pair1);
        printPair(pair2);
        printPair(pair3);

    }


    private static <T,V> void print(T one, V two){
        System.out.println(one+" " + two);

    }

    private static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("<" + pair.getOne() + " ; " + pair.getTwo() + ">");
    }
}

