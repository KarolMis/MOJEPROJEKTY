package lekcja4;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        /*
5. Pobierz od użytkownika dowolny tekst, następnie pobierz liczbę. Następnie spytaj, czy wydrukować dany tekst.
W zależności od odpowiedzi, 1 oznacza tak, 2 oznacza nie, wykonaj zadanie , tzn. wydrukuj tyle razy, jaką liczbę podał użytkownik.
Jeśli użytkownik wpisze coś innego niż 1 lub 2, wypisz „nie zrozumiałem, wybierz odpowiedź jeszcze raz”.
         */
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numb = scanner.nextInt();
        System.out.println("druknąć? 1 - tak, 2 - nie");
        int response = scanner.nextInt();
        if (response == 1) {
            for (int i = 0; i < numb; i++) {
                System.out.println(name);
            }
        } else  if (response == 2) {
            System.out.println("koniec programu");
        } else System.out.println("nie zrozumiałem, wybierz odpowiedź jeszcze raz");

    }
}
