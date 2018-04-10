package lekcja23;


import java.util.Scanner;

public class CalculatorController {

    public void start(){
        System.out.println("Witaj w kalkulatorze! wpisz liczby po przecinku! i w formacie:");
        System.out.println("liczba działanie liczba");
        controlLoop();
    }

    private void controlLoop(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("podaj pierwszą liczbę: ");

            try {
                double a = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("wybierz działanie + - * /: ");
                String action = scanner.nextLine();
                System.out.print("podaj druga liczbę: ");
                double b = scanner.nextDouble();
                scanner.nextLine();
                verifyAction(action, a, b);
            } catch (Exception e) {
                System.out.println("podane dane są nieprawidłowe spróbuj jeszcze raz!!");
            }



        }
    }

    private void verifyAction(String str, double a, double b){
        Calculator calculator = new Calculator();
        char[] ans = str.toCharArray();

        switch (ans[0]){
            case '+':
                System.out.println(calculator.add(a, b));
                break;
            case '-':
                System.out.println(calculator.substract(a, b));
                break;
            case '*':
                System.out.println(calculator.multiply(a, b));
                break;
            case '/':
                System.out.println(calculator.divide(a, b));
                break;
                default:
                    System.out.println("podaj poprawny znak!");
        }
    }
}
