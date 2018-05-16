package lekcja37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.generate();
        lotto.randomize();

        List<Integer> userNumbs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbę nr: " + (i+1));
            userNumbs.add(scanner.nextInt());
        }

        System.out.println(lotto.checkResult(userNumbs));
    }
}
