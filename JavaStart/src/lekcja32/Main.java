package lekcja32;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String EXIT = "exit";

    public static void main(String[] args) {
        List<Double> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        readData(scanner, list);
        printData(list);

    }

    private static void readData(Scanner scanner, List<Double> list) {
        System.out.println("Podaj kolejną liczbę (lub wpisz \"exit\"): ");
        String input = scanner.nextLine();
        if (input.equals(EXIT)){
            return;
        } try {
            Double numb = Double.parseDouble(input);
            list.add(numb);
        } catch (Exception e){
            System.out.println("Zły typ liczbowy");
        }
        readData(scanner, list);
    }

    private static void printData(List<Double> list) {
        StringBuilder sb = new StringBuilder();
        double sum = 0;
        for(double d: list) {
            sb.append(d);
            sb.append('+');
            sum += d;
        }
        sb.replace(sb.length()-1, sb.length(), "=");
        sb.append(sum);
        System.out.println(sb.toString());
    }
}
