package lekcja42;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopper {
    private Instant first;

    public static void main(String[] args) {
        Stopper stopper = new Stopper();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Żeby rozpocząć pomiar czasu wciśnij ENTER");
        scanner.nextLine();
        stopper.start();

        System.out.println("Żeby zatrzymać pomiar czasu wciśnij ENTER");
        scanner.nextLine();
        stopper.end();

    }

    private void start(){
        this.first = Instant.now();
    }

    private void end(){
        Instant second = Instant.now();
        Duration duration = Duration.between(first, second);
        System.out.println(duration.getSeconds());
    }

}
