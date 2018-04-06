package lekcja5zadanie2;

public class ATMApp {
    private static final String INIT = "Witaj, włóż Kartę i podaj pin";

    public static void main(String[] args) {
        System.out.println(INIT);
        ATMController atmController = new ATMController();
        atmController.validateCard();
    }
}
