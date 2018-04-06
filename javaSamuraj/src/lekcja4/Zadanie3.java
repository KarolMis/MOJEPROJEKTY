package lekcja4;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        /*
        3. Stwórz system do obliczania punktów. Użytkownik wprowadza po kolei 3 ilości, punkty za styl, punkty za efekty i punkty ze rezultat.
         Punkty za styl pomnóż przez 0.2, punkty za efekty przez 0.3, a punkty za rezultat przez 0.5 i wydrukuj sumę tych działań.
         */
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double d = a * 0.2 + b * 0.3 + c * 0.5;

        System.out.println(d);


    }
}
