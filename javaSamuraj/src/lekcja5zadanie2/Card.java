package lekcja5zadanie2;

public class Card {
    private String pin;
    private int money;


    public Card(String pin, int money) {
        this.pin = pin;
        this.money = money;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
