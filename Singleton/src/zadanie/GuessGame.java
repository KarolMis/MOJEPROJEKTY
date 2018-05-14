package zadanie;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class GuessGame {

    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame() {

    }

    private static GuessGame instance = new GuessGame();

    public void play(){

        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę: ");
            int number = random.nextInt(9);
            int ans = scanner.nextInt();

            if(number==ans){
                System.out.println("brawo");
                score++;
            } else {
                System.out.println("sorry to było: " + number);
            }

            System.out.println("Twoj wynik: " + score);
        }
    }

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance(){
        return instance;
    }

}
