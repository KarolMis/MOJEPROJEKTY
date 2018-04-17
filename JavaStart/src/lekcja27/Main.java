package lekcja27;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int n){
        return n>1? n * factorial(n-1) : 1;
    }
}
