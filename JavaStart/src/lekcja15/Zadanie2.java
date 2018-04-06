package lekcja15;

import java.util.Scanner;

public class Zadanie2 {
    /*
    2. Napisz program symulujący system do planowania wizyt w szpitalu. Program powinien składać się z trzech klas:
Patient - klasa przechowująca dane o pacjencie (imię, nazwisko, PESEL) - klasa powinna być zgodna z konwencją JavaBeans
Hospital - klasa z logiką aplikacji umożliwiająca dopisanie pacjenta do kolejki oraz wyświetlenie wszystkich zapisanych pacjentów
HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 - wyjście z programu, 1 - dopisanie pacjenta,
2 - wyświetlenie listy zapisanych pacjentów
Ograniczenia:
Danego dnia może zapisać się co najwyżej 10 pacjentów, przy próbie zapisania kolejnego wyświetlana jest informacja o tym,
 że dzisiaj limit został już wyczerpany
Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu
     */
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj!");
        int answer = -1;

        while (answer!=0) {
            System.out.println("co chesz zrobic? 0 - wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów");

            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    hospital.addPatient();
                    break;

                case 2:
                    hospital.patientPrint();
                    break;

                case 0:
                    System.out.println("papa!");
                    break;

            }
        }
    }
}
