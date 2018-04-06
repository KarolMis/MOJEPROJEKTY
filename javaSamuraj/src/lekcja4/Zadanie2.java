package lekcja4;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        //2. Użytkownik wprowadza 3 liczby od 1 do 100. Wydrukuj je w kolejności malejącej.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>b && a>c){
            if(b>c){
                System.out.println(a + ", " + b + ", " + c);
            } else if (c>b){
                System.out.println(a + ", " + c + ", " + b);

            }
        } else if (b>a && b>c) {
            if (a>c) {
                System.out.println(b + ", " + a + ", " + c);
            } else if (c>a) {
                System.out.println(b + ", " + c + ", " + a);
            }

        } else if (c>a && c>b) {
            if(a>b) {
                System.out.println(c + ", " + a + ", " + b);
            } else if (b>a) {
                System.out.println(c + ", " + b + ", " + a);
            }
        }

    }
}
