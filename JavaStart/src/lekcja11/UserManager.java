package lekcja11;

import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        User user = new User("jan", "janowski");
        Scanner scanner = new Scanner(System.in);

        System.out.println("co chcesz zrobić? 0, 1, 2 itp");

        int numb = scanner.nextInt();
        while (numb != 0) {
            if (numb == 1) {
                System.out.println(user.getName() + user.getSurname());
            } else if (numb == 2) {
                user.setName(scanner.nextLine());
                user.setSurname(scanner.nextLine());
            } else System.out.println("źle!");
        }
    }
}
