package lekcja23;

import java.util.Scanner;

public class NewFeature {
    public void start(){
        System.out.println("Witaj w kalkulatorze! wpisz liczby po przecinku! i w formacie:");
        System.out.println("liczba działanie liczba");
        controlLoop();
    }

    private void controlLoop(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            try {
                String action = scanner.nextLine();
                verifyAction(action);
            } catch (Exception e) {
                System.out.println("podane dane są nieprawidłowe spróbuj jeszcze raz!!");
            }
        }
    }

    private void verifyAction(String str) {
        Calculator calculator = new Calculator();


        String[] strings = str.split("[+-/*]");
        double a = Double.parseDouble(strings[0]);
        double b = Double.parseDouble(strings[1]);


        if (str.contains("+")) {
            System.out.println(calculator.add(a, b));
        } else if (str.contains("-")) {
            System.out.println(calculator.subtract(a, b));
        } else if (str.contains("*")){
            System.out.println(calculator.multiply(a, b));
        } else if (str.contains("/")){
            System.out.println(calculator.divide(a, b));
        } else
                System.out.println("podaj poprawny znak!");
    }
}

