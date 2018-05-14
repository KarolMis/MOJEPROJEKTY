package singleton;

public enum GameEngineEnum {
    INSTANCE("imie");

    private int hp = 100;
    private String characterName = "";

    GameEngineEnum(String characterName) {

        this.characterName = characterName;
    }

    public void run() {
        while (true){
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafikę
        }
    }
}
