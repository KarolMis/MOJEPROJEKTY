package lekcja15;

import java.util.Scanner;

public class Zadanie1 {
    /*
    1. Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb użytkownik chce wprowadzić.
     Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie.
    W programie wykorzystaj co najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne liczników pętli)
     i nie używaj tablic.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ile?");
        int numb = scanner.nextInt();
        int sum= 0;
        while (numb>0){
            sum+=scanner.nextInt();
            numb--;
        }
        System.out.println(sum);
    }
}
