package dekorator;

public class Main {
    public static void main(String[] args) {

        generateMap();

    }

    public static void generateMap(){
        Terrain terrain1 = new Plain();
        Terrain terrain2 = new Hill();
        Terrain terrain3 = new SwampDecorator(new Hill());
        Terrain terrain4 = new RoadDecorator(new SwampDecorator(new Hill()));

        System.out.println(terrain3.fuelCost());
        System.out.println(terrain4.fuelCost() + " " + terrain4.getDescription());

    }
}
