package lekcja4;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        /*
        4. Zadanie po angielsku. Stwórz system do robienia wizytówek. Odpytaj użytkownika o imię (name), nazwisko (surname),
         numer telefonu (telephone w typie int). Następnie wydrukuj to w ładny sposób, tzn ramka i może jakieś efekty, wedle woli i chęci.
         */

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String telephone = scanner.nextLine();

        System.out.println(name + " " + surname + " " + telephone);
    }
}
