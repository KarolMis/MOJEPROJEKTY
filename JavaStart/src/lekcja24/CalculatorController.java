package lekcja24;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorController {
    private Scanner scanner = new Scanner(System.in);
    private State state;

    public void start(){
        System.out.println("Witaj w kalkulatorze");
        controlLoop();
    }

    private void controlLoop(){
        state = State.INIT;

        while (state != State.EXIT){
            switch (state){
                case INIT: {
                    System.out.println("Co chcesz zrobić?");
                    System.out.println("1 - obliczyć pole i obwód koła");
                    System.out.println("2 - obliczyć pole i obwód prostokąta");
                    System.out.println("3 - obliczyć pole i obwód trójkąta");
                    System.out.println("0 - wyjść z programu");
                }

                switch (getInt()) {
                    case 1:
                        state = State.CIRCLE;
                        scanner.nextLine();
                        break;
                    case 2:
                        state = State.RECTANGLE;
                        scanner.nextLine();
                        break;
                    case 3:
                        state = State.TRIANGLE;
                        scanner.nextLine();
                        break;
                    case 0:
                        state = State.EXIT;
                        scanner.nextLine();
                        break;

                    default:
                        System.out.println("Zła odpowiedź");
                        state = State.INIT;
                        scanner.nextLine();
                        break;
                }
                break;

                case CIRCLE: {
                    double r;
                    try {
                        System.out.println("Podaj promień okręgu: ");
                        r = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        System.out.println("podaj odpowiednie wartości, pamiętaj liczby zmiennoprzecinkowe podajemy po przecinku a nie kropce!");
                        state = State.CIRCLE;
                        scanner.nextLine();
                        break;
                    }
                    Circle circle = new Circle(r);
                    circle.calculateArea();
                    circle.calculatePerimeter();
                    System.out.println(circle);
                    System.out.println("_________________________________________________________________");
                    state = State.INIT;
                    break;
                }

                case RECTANGLE:{
                    double a;
                    double b;
                    try {
                        System.out.println("Podaj pierwszy bok prostokąta: ");
                        a = scanner.nextDouble();
                        System.out.println("Podaj drugi bok prostokąta: ");
                        b = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        System.out.println("podaj odpowiednie wartości, pamiętaj liczby zmiennoprzecinkowe podajemy po przecinku a nie kropce!");
                        state = State.RECTANGLE;
                        scanner.nextLine();
                        break;
                    }

                    Rectangle rectangle = new Rectangle(a,b);
                    rectangle.calculateArea();
                    rectangle.calculatePerimeter();
                    System.out.println(rectangle);
                    System.out.println("_________________________________________________________________");
                    state = State.INIT;
                    break;
                }

                case TRIANGLE:{
                    double a;
                    double b;
                    double c;
                    double h;

                    try {
                        System.out.println("Podaj pierwszy bok trójkata: ");
                        a = scanner.nextDouble();
                        System.out.println("Podaj drugi bok trójkąta: ");
                        b = scanner.nextDouble();
                        System.out.println("Podaj trzeci bok trójkąta: ");
                        c = scanner.nextDouble();
                        System.out.println("Podaj wysokość trójkąta: ");
                        h = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        System.out.println("podaj odpowiednie wartości, pamiętaj liczby zmiennoprzecinkowe podajemy po przecinku a nie kropce!");
                        state = State.TRIANGLE;
                        scanner.nextLine();
                        break;
                    }

                    Triangle triangle = new Triangle(a,b,c,h);
                    triangle.calculateArea();
                    triangle.calculatePerimeter();
                    System.out.println(triangle);
                    System.out.println("_________________________________________________________________");
                    state = State.INIT;
                    break;
                }
            }
        }
    }

    private int getInt() {
        int result = -1;
        try {
            result = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("wprowadz poprawną liczbę!");
        }
        return result;
    }
}
