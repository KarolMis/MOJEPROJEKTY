package lekcja22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe wyrazów");
        int number = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;

        String[] strings = new String[number];

        while (number>counter){
            System.out.println("podaj " + counter + " wyraz: ");
            strings[counter] = scanner.nextLine();
            counter++;
        }

        System.out.println(word(strings));

    }

    private static String word(String[] str){
        StringBuilder builder = new StringBuilder();
        for (String s : str) {
            builder.append(s.substring(s.length()-1));
        }
        return builder.toString();
    }
}
