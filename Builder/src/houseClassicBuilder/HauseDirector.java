package houseClassicBuilder;

public class HauseDirector {
    private HouseBuilder houseBuilder;

    public HauseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
        houseBuilder.biuldDoors();
        houseBuilder.buildGarage();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

}
