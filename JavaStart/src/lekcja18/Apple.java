package lekcja18;

public class Apple extends Fruit {
    private String name;

    public Apple(String name){
        this.name = name;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.print(" Apple "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
