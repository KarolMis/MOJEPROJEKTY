package lekcja5zadanie2;

import java.util.Scanner;

public class ATMController {
    private Scanner scanner = new Scanner(System.in);
    private static final int EXIT = 0;
    private static final int GET_MONEY = 1;
    private static final int CHECK_MONEY = 2;
    private Card card = new Card("1234", 2000);

    public void validateCard() {

        String userPin = scanner.nextLine();

        if( userPin.equals(card.getPin())){
            controlLoop();
        } else {
            System.out.println("Zły pin!");
            validateCard();
        }
    }


    private void controlLoop(){
        int answer = -1;
        printOptions();
        while (answer!=0){
            answer = scanner.nextInt();
            switch (answer){
                case GET_MONEY:
                    System.out.println("Ile chcesz wybrać?");
                    int howMany= scanner.nextInt();
                    if(howMany > card.getMoney()){
                        System.out.println("nie masz tyle hajsu!");
                        printOptions();
                    } else {
                        card.setMoney(card.getMoney() - howMany);
                        System.out.println("wybrałeś: " + howMany + "zł");
                        printOptions();
                    }
                    break;
                case CHECK_MONEY:
                    System.out.println(card.getMoney());
                    printOptions();
                    break;
                case EXIT:
                    System.out.println("Żegnaj");
                    break;

            }
        }
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wybranie hajsu");
        System.out.println("2 - wyświetl konta");
    }
}
