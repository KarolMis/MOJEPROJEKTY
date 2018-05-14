import houseClassicBuilder.BigHouseBuilder;
import houseClassicBuilder.HauseDirector;
import houseClassicBuilder.HouseBuilder;
import houseClassicBuilder.SmallHauseBuilder;
import houseInnerClass.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .build();

        System.out.println(house);

        SmallHauseBuilder smallHauseBuilder = new SmallHauseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HauseDirector smallHouseDirector = new HauseDirector(smallHauseBuilder);
        smallHouseDirector.buildHouse();

        HauseDirector bigHouseDirector = new HauseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        houseClassicBuilder.House smallHouse = smallHouseDirector.getHouse();
        houseClassicBuilder.House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
