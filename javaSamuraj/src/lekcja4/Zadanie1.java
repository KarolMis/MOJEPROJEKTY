package lekcja4;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        /*
        1. Sprawdź, czy wprowadzona przez użytkownika liczba jest pierwsza (0 i 1 nie są pierwsze, 2 jest liczbą pierwszą,
         dalej standardowa definicja). Do sprawdzenia użyj prostego algorytmu sprawdzającego,
        czy liczba dzieli się przez wszystkie liczby mniejsze od jej połowy. Jeśli dzieli się przez którąkolwiek, nie jest pierwsza.
         */
        System.out.println("Czy liczba jest liczba pierwszą?");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(isPrimary(x));

    }

    private static boolean isPrimary(int x){ // zadanie 1
        boolean isPrimary = true;

        if(x == 0 || x ==1) {
            isPrimary = false;
        } else {
            for (int i = 2; i < (x/2)+1; i++) {
                if (x % i == 0) {
                    isPrimary = false;
                }
            }
        }
        return isPrimary;
    }
}
