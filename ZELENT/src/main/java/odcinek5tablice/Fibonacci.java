package odcinek5tablice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long[] fib = new long[99999999];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile wyrazów ciągu fibonacciego chcesz wyznaczyc?");
                
        int numb = scanner.nextInt();

        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < numb ; i++) {
            fib[i]= fib[i-1] + fib[i-2];
            System.out.println(i+" "+fib[i]);
        }


    }
}
